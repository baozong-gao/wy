package com.shenxin.core.smartpropertymanagement.persist.mapper;

import com.shenxin.core.smartpropertymanagement.persist.BaseMapper;
import com.shenxin.core.smartpropertymanagement.persist.entity.ContractRoomLiver;
import com.shenxin.core.smartpropertymanagement.persist.entity.ContractRoomLiverExample;
import org.apache.ibatis.annotations.Param;

import java.math.BigDecimal;
import java.util.List;

public interface ContractRoomLiverMapper extends BaseMapper<ContractRoomLiver,ContractRoomLiverExample> {
    int countByExample(ContractRoomLiverExample example);

    int deleteByExample(ContractRoomLiverExample example);

    int deleteByPrimaryKey(BigDecimal id);

    int insert(ContractRoomLiver record);

    int insertSelective(ContractRoomLiver record);

    List<ContractRoomLiver> selectByExample(ContractRoomLiverExample example);

    ContractRoomLiver selectByPrimaryKey(BigDecimal id);

    int updateByExampleSelective(@Param("record") ContractRoomLiver record, @Param("example") ContractRoomLiverExample example);

    int updateByExample(@Param("record") ContractRoomLiver record, @Param("example") ContractRoomLiverExample example);

    int updateByPrimaryKeySelective(ContractRoomLiver record);

    int updateByPrimaryKey(ContractRoomLiver record);
}