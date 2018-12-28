package com.shenxin.core.smartpropertymanagement.persist.mapper;

import com.shenxin.core.smartpropertymanagement.persist.entity.SysFunctionDAO;
import com.shenxin.core.smartpropertymanagement.persist.entity.SysRoleDAO;
import org.apache.ibatis.annotations.Param;

import java.math.BigDecimal;
import java.util.List;

public interface UserAuthMapper {

    List<SysFunctionDAO> getAuthByUserId(@Param("userId") BigDecimal userId);

    List<SysRoleDAO> getRoleByUserId(@Param("userId") BigDecimal userId);
}
