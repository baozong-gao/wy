package com.shenxin.core.smartpropertymanagement.persist.mapper;

import com.shenxin.core.smartpropertymanagement.persist.BaseMapper;
import com.shenxin.core.smartpropertymanagement.persist.entity.ContractBillAccountingLogDAO;
import com.shenxin.core.smartpropertymanagement.persist.entity.ContractBillAccountingLogDAOExample;
import java.math.BigDecimal;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ContractBillAccountingLogDAOMapper extends BaseMapper<ContractBillAccountingLogDAO,ContractBillAccountingLogDAOExample>{
    int countByExample(ContractBillAccountingLogDAOExample example);

    int deleteByExample(ContractBillAccountingLogDAOExample example);

    int deleteByPrimaryKey(BigDecimal id);

    int insert(ContractBillAccountingLogDAO record);

    int insertSelective(ContractBillAccountingLogDAO record);

    List<ContractBillAccountingLogDAO> selectByExample(ContractBillAccountingLogDAOExample example);

    ContractBillAccountingLogDAO selectByPrimaryKey(BigDecimal id);

    int updateByExampleSelective(@Param("record") ContractBillAccountingLogDAO record, @Param("example") ContractBillAccountingLogDAOExample example);

    int updateByExample(@Param("record") ContractBillAccountingLogDAO record, @Param("example") ContractBillAccountingLogDAOExample example);

    int updateByPrimaryKeySelective(ContractBillAccountingLogDAO record);

    int updateByPrimaryKey(ContractBillAccountingLogDAO record);

    BigDecimal searchRoomIdByContractId(BigDecimal contractId);

    BigDecimal searchContractFeeIdByContractId(BigDecimal contractId);
}