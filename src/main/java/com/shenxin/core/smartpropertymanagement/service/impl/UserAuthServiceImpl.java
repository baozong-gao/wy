package com.shenxin.core.smartpropertymanagement.service.impl;


import com.shenxin.core.smartpropertymanagement.persist.entity.SysFunctionDAO;
import com.shenxin.core.smartpropertymanagement.persist.entity.SysRoleDAO;
import com.shenxin.core.smartpropertymanagement.persist.entity.SysUsrDAO;
import com.shenxin.core.smartpropertymanagement.persist.mapper.UserAuthMapper;
import com.shenxin.core.smartpropertymanagement.service.UserAuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

@Service("userAuthService")
public class UserAuthServiceImpl implements UserAuthService {

    @Autowired
    UserAuthMapper userAuthMapper;

    @Autowired
    UserServiceImpl userService;

    @Autowired
    FunctionServiceImpl functionService;

    @Autowired
    RoleServiceImpl roleService;

    @Value("${root.name}")
    private String ROOT;

    @Override
    public List<SysFunctionDAO> getAuthByUserId(BigDecimal userId) {
        SysUsrDAO user = (SysUsrDAO) userService.searchById(userId);
        if (ROOT.equals(user.getUserName())) {
            return functionService.search(null);
        } else {
            return userAuthMapper.getAuthByUserId(userId);
        }
    }

    @Override
    public List<SysRoleDAO> getRoleByUserId(BigDecimal userId) {
        SysUsrDAO user = (SysUsrDAO) userService.searchById(userId);
        if (ROOT.equals(user.getUserName())) {
            return roleService.search(null);
        } else {
            return userAuthMapper.getRoleByUserId(userId);
        }
    }
}
