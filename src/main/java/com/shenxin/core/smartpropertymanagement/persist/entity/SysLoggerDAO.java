package com.shenxin.core.smartpropertymanagement.persist.entity;

import java.math.BigDecimal;

public class SysLoggerDAO {
    private BigDecimal id;

    private String operateDate;

    private String operateTime;

    private BigDecimal companyId;

    private BigDecimal userId;

    private String loginId;

    private String funcClass;

    private String funcAction;

    private String funcUrl;

    private String operateIp;

    private String operateResult;

    private String remark;

    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }

    public String getOperateDate() {
        return operateDate;
    }

    public void setOperateDate(String operateDate) {
        this.operateDate = operateDate == null ? null : operateDate.trim();
    }

    public String getOperateTime() {
        return operateTime;
    }

    public void setOperateTime(String operateTime) {
        this.operateTime = operateTime == null ? null : operateTime.trim();
    }

    public BigDecimal getCompanyId() {
        return companyId;
    }

    public void setCompanyId(BigDecimal companyId) {
        this.companyId = companyId;
    }

    public BigDecimal getUserId() {
        return userId;
    }

    public void setUserId(BigDecimal userId) {
        this.userId = userId;
    }

    public String getLoginId() {
        return loginId;
    }

    public void setLoginId(String loginId) {
        this.loginId = loginId == null ? null : loginId.trim();
    }

    public String getFuncClass() {
        return funcClass;
    }

    public void setFuncClass(String funcClass) {
        this.funcClass = funcClass == null ? null : funcClass.trim();
    }

    public String getFuncAction() {
        return funcAction;
    }

    public void setFuncAction(String funcAction) {
        this.funcAction = funcAction == null ? null : funcAction.trim();
    }

    public String getFuncUrl() {
        return funcUrl;
    }

    public void setFuncUrl(String funcUrl) {
        this.funcUrl = funcUrl == null ? null : funcUrl.trim();
    }

    public String getOperateIp() {
        return operateIp;
    }

    public void setOperateIp(String operateIp) {
        this.operateIp = operateIp == null ? null : operateIp.trim();
    }

    public String getOperateResult() {
        return operateResult;
    }

    public void setOperateResult(String operateResult) {
        this.operateResult = operateResult == null ? null : operateResult.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}