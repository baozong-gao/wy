package com.shenxin.core.smartpropertymanagement.persist.entity;

import java.math.BigDecimal;

public class RLSysRoleFuncDAO {
    private BigDecimal roleId;

    private BigDecimal funcId;

    public BigDecimal getRoleId() {
        return roleId;
    }

    public void setRoleId(BigDecimal roleId) {
        this.roleId = roleId;
    }

    public BigDecimal getFuncId() {
        return funcId;
    }

    public void setFuncId(BigDecimal funcId) {
        this.funcId = funcId;
    }
}