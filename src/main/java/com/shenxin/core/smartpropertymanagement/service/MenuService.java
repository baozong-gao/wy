package com.shenxin.core.smartpropertymanagement.service;

import com.shenxin.core.smartpropertymanagement.domain.bo.MenuBO;
import com.shenxin.core.smartpropertymanagement.domain.vo.FunctionTree;

import java.math.BigDecimal;
import java.util.List;

/**
 * Created by APPLE on 16/1/12.
 */
public interface MenuService {
    List<MenuBO> getAllEnabledMenuByUserId(BigDecimal userid);

    List<FunctionTree> getAllFunctionByRoleId(BigDecimal roleId);
}
