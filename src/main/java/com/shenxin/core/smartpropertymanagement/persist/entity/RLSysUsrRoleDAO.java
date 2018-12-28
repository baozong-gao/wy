package com.shenxin.core.smartpropertymanagement.persist.entity;

import java.math.BigDecimal;

public class RLSysUsrRoleDAO {
    private BigDecimal userId;

    private BigDecimal roleId;

    public BigDecimal getUserId() {
        return userId;
    }

    public void setUserId(BigDecimal userId) {
        this.userId = userId;
    }

    public BigDecimal getRoleId() {
        return roleId;
    }

    public void setRoleId(BigDecimal roleId) {
        this.roleId = roleId;
    }
}