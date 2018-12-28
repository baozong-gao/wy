package com.shenxin.core.smartpropertymanagement.persist.mapper;

import com.shenxin.core.smartpropertymanagement.persist.BaseMapper;
import com.shenxin.core.smartpropertymanagement.persist.entity.ContractFeeAccountingLogDAO;
import com.shenxin.core.smartpropertymanagement.persist.entity.ContractFeeAccountingLogDAOExample;
import java.math.BigDecimal;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ContractFeeAccountingLogDAOMapper extends BaseMapper<ContractFeeAccountingLogDAO,ContractFeeAccountingLogDAOExample>{
    int countByExample(ContractFeeAccountingLogDAOExample example);

    int deleteByExample(ContractFeeAccountingLogDAOExample example);

    int deleteByPrimaryKey(BigDecimal id);

    int insert(ContractFeeAccountingLogDAO record);

    int insertSelective(ContractFeeAccountingLogDAO record);

    List<ContractFeeAccountingLogDAO> selectByExample(ContractFeeAccountingLogDAOExample example);

    ContractFeeAccountingLogDAO selectByPrimaryKey(BigDecimal id);

    int updateByExampleSelective(@Param("record") ContractFeeAccountingLogDAO record, @Param("example") ContractFeeAccountingLogDAOExample example);

    int updateByExample(@Param("record") ContractFeeAccountingLogDAO record, @Param("example") ContractFeeAccountingLogDAOExample example);

    int updateByPrimaryKeySelective(ContractFeeAccountingLogDAO record);

    int updateByPrimaryKey(ContractFeeAccountingLogDAO record);
}