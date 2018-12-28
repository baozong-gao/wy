package com.shenxin.core.smartpropertymanagement.service;

import com.shenxin.core.smartpropertymanagement.persist.entity.SysFunctionDAO;
import com.shenxin.core.smartpropertymanagement.persist.entity.SysRoleDAO;

import java.math.BigDecimal;
import java.util.List;

/**
 * Created by APPLE on 16/1/13.
 */
public interface UserAuthService {

    List<SysFunctionDAO> getAuthByUserId(BigDecimal userId);

    List<SysRoleDAO> getRoleByUserId(BigDecimal userId);

}
