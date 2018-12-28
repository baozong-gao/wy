package com.shenxin.core.smartpropertymanagement.persist.mapper;

import com.shenxin.core.smartpropertymanagement.persist.BaseMapper;

import java.math.BigDecimal;
import java.util.List;

import com.shenxin.core.smartpropertymanagement.persist.entity.ContractRoomInfo;
import com.shenxin.core.smartpropertymanagement.persist.entity.ContractRoomInfoExample;
import org.apache.ibatis.annotations.Param;

public interface ContractRoomInfoMapper extends BaseMapper<ContractRoomInfo,ContractRoomInfoExample>{
    int countByExample(ContractRoomInfoExample example);

    int deleteByExample(ContractRoomInfoExample example);

    int deleteByPrimaryKey(BigDecimal id);

    int insert(ContractRoomInfo record);

    int insertSelective(ContractRoomInfo record);

    List<ContractRoomInfo> selectByExample(ContractRoomInfoExample example);

    ContractRoomInfo selectByPrimaryKey(BigDecimal id);

    int updateByExampleSelective(@Param("record") ContractRoomInfo record, @Param("example") ContractRoomInfoExample example);

    int updateByExample(@Param("record") ContractRoomInfo record, @Param("example") ContractRoomInfoExample example);

    int updateByPrimaryKeySelective(ContractRoomInfo record);

    int updateByPrimaryKey(ContractRoomInfo record);
}