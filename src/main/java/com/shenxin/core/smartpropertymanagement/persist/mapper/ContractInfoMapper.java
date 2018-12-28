package com.shenxin.core.smartpropertymanagement.persist.mapper;

import com.shenxin.core.smartpropertymanagement.persist.BaseMapper;
import com.shenxin.core.smartpropertymanagement.persist.entity.*;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface ContractInfoMapper extends BaseMapper<ContractInfo,ContractInfoExample>{
    int countByExample(ContractInfoExample example);

    int deleteByExample(ContractInfoExample example);

    int deleteByPrimaryKey(BigDecimal id);

    int insert(ContractInfo record);

    int insertSelective(ContractInfo record);

    List<ContractInfo> selectByExample(ContractInfoExample example);

    ContractInfo selectByPrimaryKey(BigDecimal id);

    int updateByExampleSelective(@Param("record") ContractInfo record, @Param("example") ContractInfoExample example);

    int updateByExample(@Param("record") ContractInfo record, @Param("example") ContractInfoExample example);

    int updateByPrimaryKeySelective(ContractInfo record);

    int updateByPrimaryKey(ContractInfo record);

    int insertContractInfo(ContractInfo contractInfo);

    int insertContractFeeCategory(ContractFeeCategory contractFeeCategory);

    int updateRoomStatus(ROOMDAO roomdao);

    List<ContractInfo> selectContractInfo(BigDecimal contractId);

    BigDecimal selectContractId(@Param("roomId") BigDecimal roomId,@Param("status") String status);

    ContractInfo selectContractResidence(BigDecimal contractId);
}