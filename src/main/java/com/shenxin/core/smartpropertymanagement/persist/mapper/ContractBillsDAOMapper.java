package com.shenxin.core.smartpropertymanagement.persist.mapper;

import com.shenxin.core.smartpropertymanagement.domain.dto.ContractBillsDTO;
import com.shenxin.core.smartpropertymanagement.persist.BaseMapper;
import com.shenxin.core.smartpropertymanagement.persist.entity.ContractBillsDAO;
import com.shenxin.core.smartpropertymanagement.persist.entity.ContractBillsDAOExample;
import java.math.BigDecimal;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ContractBillsDAOMapper extends BaseMapper<ContractBillsDAO,ContractBillsDAOExample>{
    int countByExample(ContractBillsDAOExample example);

    int deleteByExample(ContractBillsDAOExample example);

    int deleteByPrimaryKey(BigDecimal id);

    int insert(ContractBillsDAO record);

    int insertSelective(ContractBillsDAO record);

    List<ContractBillsDAO> selectByExample(ContractBillsDAOExample example);

    ContractBillsDAO selectByPrimaryKey(BigDecimal id);

    int updateByExampleSelective(@Param("record") ContractBillsDAO record, @Param("example") ContractBillsDAOExample example);

    int updateByExample(@Param("record") ContractBillsDAO record, @Param("example") ContractBillsDAOExample example);

    int updateByPrimaryKeySelective(ContractBillsDAO record);

    int updateByPrimaryKey(ContractBillsDAO record);

    int updateContractBillsFavorable(ContractBillsDTO contractBillsDTO);
}