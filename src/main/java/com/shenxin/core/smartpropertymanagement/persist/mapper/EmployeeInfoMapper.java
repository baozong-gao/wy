package com.shenxin.core.smartpropertymanagement.persist.mapper;

import com.shenxin.core.smartpropertymanagement.persist.BaseMapper;
import com.shenxin.core.smartpropertymanagement.persist.entity.*;

import java.math.BigDecimal;
import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface EmployeeInfoMapper extends BaseMapper<EmployeeInfo,EmployeeInfoExample>{
    int countByExample(EmployeeInfoExample example);

    int deleteByExample(EmployeeInfoExample example);

    int deleteByPrimaryKey(BigDecimal id);

    int insert(EmployeeInfo record);

    int insertSelective(EmployeeInfo record);

    List<EmployeeInfo> selectByExample(EmployeeInfoExample example);

    EmployeeInfo selectByPrimaryKey(BigDecimal id);

    int updateByExampleSelective(@Param("record") EmployeeInfo record, @Param("example") EmployeeInfoExample example);

    int updateByExample(@Param("record") EmployeeInfo record, @Param("example") EmployeeInfoExample example);

    int updateByPrimaryKeySelective(EmployeeInfo record);

    int updateByPrimaryKey(EmployeeInfo record);

    List<CompanyDepartmentDAO> selectDepartMentByCompanyId(BigDecimal companyId);

    int insertEmployee(EmployeeInfo employeeInfo);

    List<SysRoleDAO> selectRoleByCompanyId(BigDecimal companyId);

    SysUsrDAO selectRemarkByEmployeeId(BigDecimal employeeId);

    SysUsrDAO selectUserByEmployeeId(BigDecimal employeeId);

    int deletUser(BigDecimal employeeId);
}