package com.shenxin.core.smartpropertymanagement.persist.entity;

import com.shenxin.core.smartpropertymanagement.domain.em.FiledAlias;

import java.math.BigDecimal;

public class SysFunctionDAO {
    private BigDecimal id;

    private BigDecimal parentId;

    private String grade;

    @FiledAlias("name")
    private String funcName;

    @FiledAlias("uri")
    private String funcUri;

    @FiledAlias("type")
    private String funcType;

    @FiledAlias("code")
    private String authCode;

    @FiledAlias("status")
    private String funcStatus;

    private BigDecimal orderBy;

    private String logo;

    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }

    public BigDecimal getParentId() {
        return parentId;
    }

    public void setParentId(BigDecimal parentId) {
        this.parentId = parentId;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade == null ? null : grade.trim();
    }

    public String getFuncName() {
        return funcName;
    }

    public void setFuncName(String funcName) {
        this.funcName = funcName == null ? null : funcName.trim();
    }

    public String getFuncUri() {
        return funcUri;
    }

    public void setFuncUri(String funcUri) {
        this.funcUri = funcUri == null ? null : funcUri.trim();
    }

    public String getFuncType() {
        return funcType;
    }

    public void setFuncType(String funcType) {
        this.funcType = funcType == null ? null : funcType.trim();
    }

    public String getAuthCode() {
        return authCode;
    }

    public void setAuthCode(String authCode) {
        this.authCode = authCode == null ? null : authCode.trim();
    }

    public String getFuncStatus() {
        return funcStatus;
    }

    public void setFuncStatus(String funcStatus) {
        this.funcStatus = funcStatus == null ? null : funcStatus.trim();
    }

    public BigDecimal getOrderBy() {
        return orderBy;
    }

    public void setOrderBy(BigDecimal orderBy) {
        this.orderBy = orderBy;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo == null ? null : logo.trim();
    }
}