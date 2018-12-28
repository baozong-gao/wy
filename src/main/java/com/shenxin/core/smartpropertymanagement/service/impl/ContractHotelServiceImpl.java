package com.shenxin.core.smartpropertymanagement.service.impl;

import com.shenxin.core.smartpropertymanagement.domain.SystemConstant;
import com.shenxin.core.smartpropertymanagement.domain.bo.ContractBusinessBO;
import com.shenxin.core.smartpropertymanagement.domain.em.IdType;
import com.shenxin.core.smartpropertymanagement.persist.entity.*;
import com.shenxin.core.smartpropertymanagement.persist.mapper.ContractInfoDAOMapper;
import com.shenxin.core.smartpropertymanagement.persist.mapper.ContractRoomInfoDAOMapper;
import com.shenxin.core.smartpropertymanagement.service.IBaseService;
import com.shenxin.core.smartpropertymanagement.service.IdGenerateService;
import com.shenxin.core.smartpropertymanagement.util.BeanUtils;
import com.shenxin.core.smartpropertymanagement.util.exception.PersistentException;
import jdk.nashorn.internal.runtime.ParserException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * @Author: gaobaozong
 * @Description: 酒店合同服务
 * @Date: Created in 2018/7/23 - 15:45
 * @Version: V1.0
 */
@Service
public class ContractHotelServiceImpl extends IBaseService<ContractInfoDAO, ContractInfoDAOExample, ContractInfoDAOMapper> {

    @Autowired
    ContractRoomInfoDAOMapper roomMapper;
    @Autowired
    RoomServiceImpl roomService;

    ContractInfoDAOMapper mapper;

    IdGenerateService idGenerate;

    @Autowired
    public ContractHotelServiceImpl(ContractInfoDAOMapper mapper, IdGenerateService idGenerate) {
        super(mapper, idGenerate, IdType.CONTRACT);
        this.idGenerate = idGenerate;
        this.mapper = mapper;
    }

    public List<ContractInfoDAO> searchByRooms(ContractBusinessBO bo)throws Exception{
        ContractInfoDAO dao =  new ContractInfoDAO();
        BeanUtils.copy(bo, dao);

        List<BigDecimal> roomIds = new ArrayList<>();
        Optional.ofNullable(bo.getRoom()).ifPresent(_id -> roomIds.add(_id));
        if(bo.getProperty() != null || bo.getBuilding() != null){
            ROOMDAO room = new ROOMDAO();
            room.setPropertyId(bo.getProperty());
            room.setBuildingId(bo.getBuilding());
            Optional.ofNullable(roomService.search(room)).ifPresent(_rooms -> {
                _rooms.stream().map(_room -> _room.getId()).forEach(_id -> roomIds.add(_id));
            });
        }

        List<BigDecimal> contractIds = new ArrayList<>();
        if(roomIds.size() > 0){
            ContractRoomInfoDAOExample example = new ContractRoomInfoDAOExample();
            example.createCriteria().andRoomIdIn(roomIds);
            Optional.ofNullable(roomMapper.selectByExample(example)).ifPresent(_crs ->{
                _crs.stream().map(_cr -> _cr.getContractId()).forEach(_cid -> contractIds.add(_cid));
            });
            dao.setIds(contractIds);
        }

        return super.search(dao);
    }

    public ContractInfoDAO searchByRoomId(BigDecimal roomId){

        ContractRoomInfoDAOExample example = new ContractRoomInfoDAOExample();
        example.createCriteria().andRoomIdEqualTo(roomId).andStatusEqualTo(SystemConstant.STATUS_NORMAL);
        List<ContractRoomInfoDAO> crs =  roomMapper.selectByExample(example);
        Optional.ofNullable(crs).filter(c -> c.size() == 1).orElseThrow(() -> new PersistentException("房间合同状态异常"));

       return  Optional.ofNullable(crs.get(0))
                .map(c -> c.getContractId())
                .map(cid -> mapper.selectByPrimaryKey(cid))
                .orElseThrow(() -> new ParserException("房间合同不存在"));
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public int insert(ContractInfoDAO entity) throws PersistentException {
        super.insert(entity);

        ContractRoomInfoDAO room = new ContractRoomInfoDAO();
        room.setCompanyId(entity.getCompanyId());
        room.setId(idGenerate.getBigDecimalId());
        room.setRoomId(entity.getRoomId());
        room.setContractId(entity.getId());
        room.setStatus(SystemConstant.STATUS_NORMAL);
        roomMapper.insert(room);

        return 1;
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public int delete(BigDecimal id) {
        super.delete(id);

        ContractRoomInfoDAOExample example = new ContractRoomInfoDAOExample();
        example.createCriteria().andContractIdEqualTo(id);
        roomMapper.deleteByExample(example);

        return 1;
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public int update(ContractInfoDAO entity) throws PersistentException {
        super.update(entity);

        ContractRoomInfoDAO contractRoom = new ContractRoomInfoDAO();
        contractRoom.setRoomId(entity.getRoomId());

        ContractRoomInfoDAOExample example = new ContractRoomInfoDAOExample();
        example.createCriteria().andContractIdEqualTo(entity.getId());
        roomMapper.updateByExampleSelective(contractRoom, example);

        return 1;
    }
}
