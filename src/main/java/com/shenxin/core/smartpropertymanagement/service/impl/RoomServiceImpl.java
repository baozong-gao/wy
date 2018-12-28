package com.shenxin.core.smartpropertymanagement.service.impl;

import com.shenxin.core.smartpropertymanagement.domain.em.IdType;
import com.shenxin.core.smartpropertymanagement.persist.entity.ContractRoomInfoDAOExample;
import com.shenxin.core.smartpropertymanagement.persist.entity.ROOMDAO;
import com.shenxin.core.smartpropertymanagement.persist.entity.ROOMDAOExample;
import com.shenxin.core.smartpropertymanagement.persist.mapper.ContractRoomInfoDAOMapper;
import com.shenxin.core.smartpropertymanagement.persist.mapper.ROOMDAOMapper;
import com.shenxin.core.smartpropertymanagement.service.IBaseService;
import com.shenxin.core.smartpropertymanagement.service.IdGenerateService;
import com.shenxin.core.smartpropertymanagement.util.exception.PersistentException;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.session.ExecutorType;
import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @Author: gaobaozong
 * @Description: 房间
 * @Date: Created in 2018/7/9 - 10:43
 * @Version: V1.0
 */
@Slf4j
@Service
public class RoomServiceImpl extends IBaseService<ROOMDAO,ROOMDAOExample,ROOMDAOMapper> {

    @Autowired
    ContractRoomInfoDAOMapper roomMapper;

    @Autowired
    SqlSessionTemplate template;

    ROOMDAOMapper mapper;

    IdGenerateService idGenerateService;

    @Autowired
    public RoomServiceImpl(ROOMDAOMapper mapper, IdGenerateService idGenerateService){
        super(mapper,idGenerateService, IdType.ROOM);
        this.idGenerateService = idGenerateService;
        this.mapper = mapper;
    }

    // 根据ContractId 获取room可能是多个.
    public List<ROOMDAO> searchByContractId(BigDecimal id){
        ContractRoomInfoDAOExample example = new ContractRoomInfoDAOExample();
        example.createCriteria().andContractIdEqualTo(id);
        List<BigDecimal> roomIds =  roomMapper.selectByExample(example).stream().map(_r -> _r.getRoomId()).collect(Collectors.toList());
        if(roomIds == null || roomIds.size() == 0){
            return null;
        }

        ROOMDAOExample example1 = new ROOMDAOExample();
        example1.createCriteria().andIdIn(roomIds);
        return mapper.selectByExample(example1);
    }

    public boolean addBatch(List<ROOMDAO> rooms){
        try {
            SqlSession session = template.getSqlSessionFactory().openSession(ExecutorType.BATCH, false);
            ROOMDAOMapper mapper = session.getMapper(ROOMDAOMapper.class);
            rooms.forEach(room -> {
                String id = idGenerateService.getId(IdType.ROOM) ;
                room.setId(new BigDecimal(id));
                mapper.insert(room);
            });
            session.commit();
            session.clearCache();
            return true;
        }catch (Exception e){
            log.error("批量插入房间异常", e);
            throw new PersistentException("批量插入房间异常");
        }
    }

}
