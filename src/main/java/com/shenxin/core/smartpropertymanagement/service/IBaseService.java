package com.shenxin.core.smartpropertymanagement.service;

import com.esotericsoftware.reflectasm.MethodAccess;
import com.shenxin.core.smartpropertymanagement.domain.em.FieldRelationTypeEnum;
import com.shenxin.core.smartpropertymanagement.domain.em.IdType;
import com.shenxin.core.smartpropertymanagement.domain.em.SearchFieldRelationType;
import com.shenxin.core.smartpropertymanagement.domain.em.SearchFiledAlias;
import com.shenxin.core.smartpropertymanagement.persist.BaseMapper;
import com.shenxin.core.smartpropertymanagement.util.BeanUtils;
import com.shenxin.core.smartpropertymanagement.util.exception.PersistentException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.dao.DuplicateKeyException;

import java.lang.reflect.*;
import java.math.BigDecimal;
import java.util.*;

/**
 * @Author: gaobaozong
 * @Description: 基础服务接口
 * @Date: Created in 2018/6/13 - 11:09
 * @Version: V1.0
 */
@Slf4j
public class IBaseService<D, E, M extends BaseMapper<D, E>> {

    M mapper;

    IdGenerateService idGenerate;

    IdType idType;

    Class<E> ec;

    public IBaseService(M mapper, IdGenerateService idGenerate, IdType idType) {
        this.mapper = mapper;
        this.idGenerate = idGenerate;
        this.idType = idType;

        Type sType = getClass().getGenericSuperclass();
        Type[] generics = ((ParameterizedType) sType).getActualTypeArguments();
        ec = (Class<E>) (generics[1]);
    }

    E getSearchFiled(D bo) {
        try {
            E e = ec.newInstance();
            if (bo == null) {
                return e;
            }
            MethodAccess access = MethodAccess.get(ec);
            int index = access.getIndex("createCriteria");
            Object criteria = access.invoke(e, index);
            access = MethodAccess.get(criteria.getClass());

            Map<String,Object> filedValueMap = new HashMap<>();

            MethodAccess access1 = MethodAccess.get(bo.getClass());
            Field[] fieldNames = bo.getClass().getDeclaredFields();
            for (Field fieldName : fieldNames) {
                String name = fieldName.getName();
                Object v = access1.invoke(bo, "get"+upperCaseFirstLatter(name));

                if (BeanUtils.filedNotNull(v)) {
                    if(fieldName.isAnnotationPresent(SearchFiledAlias.class)){
                        SearchFiledAlias filedAlias = fieldName.getAnnotation(SearchFiledAlias.class);
                        String aliasFieleName = filedAlias.value()[0];
                        log.info("SearchFiledAlias in {} -> {} in {}",name,aliasFieleName,v);
                        index = access.getIndex("and" + upperCaseFirstLatter(aliasFieleName) + "In");
                        access.invoke(criteria, index, v);
                        filedValueMap.put(aliasFieleName,v);
                    }else if(filedValueMap.get(name) == null){
                        if(fieldName.isAnnotationPresent(SearchFieldRelationType.class)){
                            SearchFieldRelationType relationTypeAno = fieldName.getAnnotation(SearchFieldRelationType.class);
                            FieldRelationTypeEnum typeEnum = relationTypeAno.value();
                            if(typeEnum == FieldRelationTypeEnum.LIKE){
                                log.info("SearchFieldRelationType {} like {}",name ,v);
                                index = access.getIndex("and" + upperCaseFirstLatter(name + "Like"));
                                access.invoke(criteria, index, "%"+v+"%");
                            }else if(typeEnum == FieldRelationTypeEnum.GREAT_EQUAL){
                                log.info("SearchFieldRelationType {} GREAT_EQUAL {}",name,v);
                                index = access.getIndex("and" + upperCaseFirstLatter(name + "GreaterThanOrEqualTo"));
                                access.invoke(criteria, index, v);
                            }else if(typeEnum == FieldRelationTypeEnum.LESS_EQUAL){
                                log.info("SearchFieldRelationType {} LESS_EQUAL {}",name,v);
                                index = access.getIndex("and" + upperCaseFirstLatter(name + "LessThanOrEqualTo"));
                                access.invoke(criteria, index, v);
                            }
                        }else{
                            index = access.getIndex("and" + upperCaseFirstLatter(name) + "EqualTo");
                            access.invoke(criteria, index, v);
                        }
                    }
                }
            }

//            for(String fieldName : filedValueMap.keySet()){
//                Object value = filedValueMap.get(fieldName);
//                if(value instanceof List){
//                    index = access.getIndex("and" + upperCaseFirstLatter(fieldName) + "In");
//                }else{
//                    index = access.getIndex("and" + upperCaseFirstLatter(fieldName) + "EqualTo");
//                }
//                access.invoke(criteria, index, value);
//            }
            return e;
        }catch (Exception e){
            log.error("拼写查询条件异常", e);
            throw new PersistentException("数据查询异常");
        }
    }

    private static String upperCaseFirstLatter(String str){
        char[] strChar=str.toCharArray();
        strChar[0]-=32;
        return String.valueOf(strChar);
    }


    public List<D> search(D criteria) {
        E ex = getSearchFiled(criteria);
        addOrderClause(ex);
        List<D> result = mapper.selectByExample(ex);
        if (result == null) {
            result = new ArrayList<>();
        }
        return result;
    }

    // 通过映射的方法,添加默认排序.需要自定义排序,需要重写改方法
    protected void addOrderClause(E ex){
        try {
            Method secureMethod = ec.getMethod("setOrderByClause",String.class);
            secureMethod.invoke(ex,"ID desc");
        } catch (NoSuchMethodException e) {
            log.info("addOrderClause NoSuchMethodException");
        } catch (IllegalAccessException e) {
            log.info("addOrderClause IllegalAccessException");
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            log.info("addOrderClause InvocationTargetException");
            e.printStackTrace();
        }
    }

    public int count(D criteria) {
        E ex = getSearchFiled(criteria);
        return mapper.countByExample(ex);
    }

    public int delete(BigDecimal id){
        if (id == null) {
            throw new PersistentException("删除失败：参数为空");
        }
        int size = mapper.deleteByPrimaryKey(id);
        Optional.ofNullable(size)
                .filter(_s -> _s != 0 || searchById(id) != null)
                .orElseThrow(() -> new PersistentException("删除对象不存在"));
        return size;
    }

    public int insert(D entity) throws PersistentException {
        if (entity == null) {
            throw new PersistentException("插入失败：参数为空");
        }
        try {
            String id = idGenerate.getId(idType);
            MethodAccess access = MethodAccess.get(entity.getClass());
            access.invoke(entity, "setId", new BigDecimal(id));
            return mapper.insertSelective(entity);
        }catch (DuplicateKeyException e){
            throw new PersistentException("数据已存在");
        }
    }

    public D searchById(BigDecimal id) {
        if (id == null) {
            return null;
        }
        return mapper.selectByPrimaryKey(id);
    }

    public int update(D entity) throws PersistentException {
        MethodAccess access = MethodAccess.get(entity.getClass());
        if (entity == null || access.invoke(entity,"getId") == null) {
            throw new PersistentException("更新失败：id为空");
        }
        try{
            return mapper.updateByPrimaryKeySelective(entity);
        }catch (DuplicateKeyException e){
            throw new PersistentException("更新失败");
        }
    }

}
