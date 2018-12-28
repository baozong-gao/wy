package com.shenxin.core.smartpropertymanagement.service.impl;

import com.shenxin.core.smartpropertymanagement.domain.em.IdType;
import com.shenxin.core.smartpropertymanagement.persist.entity.CompanyDepartmentDAO;
import com.shenxin.core.smartpropertymanagement.persist.entity.CompanyDepartmentDAOExample;
import com.shenxin.core.smartpropertymanagement.persist.mapper.CompanyDepartmentDAOMapper;
import com.shenxin.core.smartpropertymanagement.service.IBaseService;
import com.shenxin.core.smartpropertymanagement.service.IdGenerateService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author: wangzhenyu
 * @Description: 研发部
 * @Date: 2018/7/3
 * @Version: V1.0
 */
@Slf4j
@Service("departmentService")
public class DepartmentServiceImpl extends IBaseService<CompanyDepartmentDAO,CompanyDepartmentDAOExample,CompanyDepartmentDAOMapper> {
    @Autowired
    public DepartmentServiceImpl(CompanyDepartmentDAOMapper mapper, IdGenerateService idGenerateService){
        super(mapper, idGenerateService, IdType.DEPARTMENT);
    }

//    public int insert(CompanyDepartmentDAO entity) throws PersistentException {
//        if (entity == null) {
//            throw new PersistentException("插入失败：参数为空");
//        }
//        int id = this.idGenerate.getId(IdType.DEPARTMENT);
//        BigDecimal companyId = entity.getCompanyId();
//        MethodAccess access = MethodAccess.get(entity.getClass());
//        access.invoke(entity, "setId",new BigDecimal(String.format("%s%d", companyId, id)));
//        return mapper.insertSelective(entity);
//    }

}
