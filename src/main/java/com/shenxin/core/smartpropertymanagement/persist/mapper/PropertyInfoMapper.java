package com.shenxin.core.smartpropertymanagement.persist.mapper;

import com.shenxin.core.smartpropertymanagement.persist.BaseMapper;
import com.shenxin.core.smartpropertymanagement.persist.entity.PropertyInfo;
import com.shenxin.core.smartpropertymanagement.persist.entity.PropertyInfoExample;
import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

import com.shenxin.core.smartpropertymanagement.persist.entity.SysFunctionDAO;
import com.shenxin.core.smartpropertymanagement.persist.entity.SysFunctionDAOExample;
import org.apache.ibatis.annotations.Param;

public interface PropertyInfoMapper extends BaseMapper<PropertyInfo,PropertyInfoExample> {

    int countByExample(PropertyInfoExample example);

    int deleteByExample(PropertyInfoExample example);

    int deleteByPrimaryKey(BigDecimal id);

    int insert(PropertyInfo record);

    int insertSelective(PropertyInfo record);

    List<PropertyInfo> selectByExample(PropertyInfoExample example);

    PropertyInfo selectByPrimaryKey(BigDecimal id);

    int updateByExampleSelective(@Param("record") PropertyInfo record, @Param("example") PropertyInfoExample example);

    int updateByExample(@Param("record") PropertyInfo record, @Param("example") PropertyInfoExample example);

    int updateByPrimaryKeySelective(PropertyInfo record);

    int updateByPrimaryKey(PropertyInfo record);

    List<PropertyInfo> pageListOrderByIdAndWhere(@Param("map")Map<String,Object> map);

}