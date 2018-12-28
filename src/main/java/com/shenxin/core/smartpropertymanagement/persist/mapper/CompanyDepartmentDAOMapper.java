package com.shenxin.core.smartpropertymanagement.persist.mapper;

import com.shenxin.core.smartpropertymanagement.persist.BaseMapper;
import com.shenxin.core.smartpropertymanagement.persist.entity.CompanyDepartmentDAO;
import com.shenxin.core.smartpropertymanagement.persist.entity.CompanyDepartmentDAOExample;
import org.apache.ibatis.annotations.Param;

import java.math.BigDecimal;
import java.util.List;

public interface CompanyDepartmentDAOMapper extends BaseMapper<CompanyDepartmentDAO,CompanyDepartmentDAOExample> {
    int countByExample(CompanyDepartmentDAOExample example);

    int deleteByExample(CompanyDepartmentDAOExample example);

    int deleteByPrimaryKey(BigDecimal id);

    int insert(CompanyDepartmentDAO record);

    int insertSelective(CompanyDepartmentDAO record);

    List<CompanyDepartmentDAO> selectByExample(CompanyDepartmentDAOExample example);

    CompanyDepartmentDAO selectByPrimaryKey(BigDecimal id);

    int updateByExampleSelective(@Param("record") CompanyDepartmentDAO record, @Param("example") CompanyDepartmentDAOExample example);

    int updateByExample(@Param("record") CompanyDepartmentDAO record, @Param("example") CompanyDepartmentDAOExample example);

    int updateByPrimaryKeySelective(CompanyDepartmentDAO record);

    int updateByPrimaryKey(CompanyDepartmentDAO record);

}