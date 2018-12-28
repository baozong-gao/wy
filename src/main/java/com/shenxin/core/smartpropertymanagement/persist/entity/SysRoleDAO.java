package com.shenxin.core.smartpropertymanagement.persist.entity;

import com.shenxin.core.smartpropertymanagement.domain.em.FiledAlias;

import java.math.BigDecimal;

public class SysRoleDAO {
    private BigDecimal id;

    private BigDecimal companyId;

    private String name;

    @FiledAlias("status")
    private String roleStatus;

    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }

    public BigDecimal getCompanyId() {
        return companyId;
    }

    public void setCompanyId(BigDecimal companyId) {
        this.companyId = companyId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getRoleStatus() {
        return roleStatus;
    }

    public void setRoleStatus(String roleStatus) {
        this.roleStatus = roleStatus == null ? null : roleStatus.trim();
    }
}