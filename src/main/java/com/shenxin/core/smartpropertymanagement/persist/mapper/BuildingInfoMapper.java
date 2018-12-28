package com.shenxin.core.smartpropertymanagement.persist.mapper;

import com.shenxin.core.smartpropertymanagement.persist.BaseMapper;
import com.shenxin.core.smartpropertymanagement.persist.entity.BuildingInfo;
import com.shenxin.core.smartpropertymanagement.persist.entity.BuildingInfoExample;
import java.math.BigDecimal;
import java.util.List;

import com.shenxin.core.smartpropertymanagement.persist.entity.PropertyInfo;
import org.apache.ibatis.annotations.Param;

public interface BuildingInfoMapper extends BaseMapper<BuildingInfo,BuildingInfoExample>{
    int countByExample(BuildingInfoExample example);

    int deleteByExample(BuildingInfoExample example);

    int deleteByPrimaryKey(BigDecimal id);

    int insert(BuildingInfo record);

    int insertSelective(BuildingInfo record);

    List<BuildingInfo> selectByExample(BuildingInfoExample example);

    BuildingInfo selectByPrimaryKey(BigDecimal id);

    int updateByExampleSelective(@Param("record") BuildingInfo record, @Param("example") BuildingInfoExample example);

    int updateByExample(@Param("record") BuildingInfo record, @Param("example") BuildingInfoExample example);

    int updateByPrimaryKeySelective(BuildingInfo record);

    int updateByPrimaryKey(BuildingInfo record);

    List<PropertyInfo> selectPropertyByCompanyId(BigDecimal companyId);

    List<BuildingInfo> selectBuilding(BigDecimal propertyId);

    String selectPropertyName(BigDecimal propertyId);
}