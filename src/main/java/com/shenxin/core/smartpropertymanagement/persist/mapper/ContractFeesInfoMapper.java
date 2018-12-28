package com.shenxin.core.smartpropertymanagement.persist.mapper;

import com.shenxin.core.smartpropertymanagement.domain.vo.ContractFeesInfoVO;
import com.shenxin.core.smartpropertymanagement.persist.BaseMapper;
import com.shenxin.core.smartpropertymanagement.persist.entity.*;
import org.apache.ibatis.annotations.Param;

import java.math.BigDecimal;
import java.util.List;

public interface ContractFeesInfoMapper extends BaseMapper<ContractFeesInfo,ContractFeesInfoExample>{
    int countByExample(ContractFeesInfoExample example);

    int deleteByExample(ContractFeesInfoExample example);

    int deleteByPrimaryKey(BigDecimal id);

    int insert(ContractFeesInfo record);

    int insertSelective(ContractFeesInfo record);

    List<ContractFeesInfo> selectByExample(ContractFeesInfoExample example);

    ContractFeesInfo selectByPrimaryKey(BigDecimal id);

    int updateByExampleSelective(@Param("record") ContractFeesInfo record, @Param("example") ContractFeesInfoExample example);

    int updateByExample(@Param("record") ContractFeesInfo record, @Param("example") ContractFeesInfoExample example);

    int updateByPrimaryKeySelective(ContractFeesInfo record);

    int updateByPrimaryKey(ContractFeesInfo record);

    List<PropertyInfo> selectPropertyByCompanyId(BigDecimal companyId);

    List<PropertyInfo> selectAllProperty(BigDecimal companyId);

    List<BuildingInfo> selectBuilding(BigDecimal propertyId);

    List<CompanyInfo> selectAllCompany();

    List<PropertyInfo> selectPropertyByCompanyIdAnother(BigDecimal companyId);

    BigDecimal selectContractDetails(BigDecimal roomId);

    String selectRoomDesc(BigDecimal roomId);

    ContractFeesInfoVO selectAboutProperty(BigDecimal roomId);

    int updateFeeAmount(ContractFeesInfo contractFeesInfo);

}