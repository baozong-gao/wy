package com.shenxin.core.smartpropertymanagement.persist.mapper;

import com.shenxin.core.smartpropertymanagement.persist.BaseMapper;
import com.shenxin.core.smartpropertymanagement.persist.entity.ContractFeeCategoryDAO;
import com.shenxin.core.smartpropertymanagement.persist.entity.ContractFeeCategoryDAOExample;
import org.apache.ibatis.annotations.Param;

import java.math.BigDecimal;
import java.util.List;

public interface ContractFeeCategoryDAOMapper extends BaseMapper<ContractFeeCategoryDAO,ContractFeeCategoryDAOExample>{
    List<ContractFeeCategoryDAO> selectContractResidenceList(BigDecimal contractId);
}