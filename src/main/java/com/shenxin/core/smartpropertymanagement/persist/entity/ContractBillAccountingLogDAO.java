package com.shenxin.core.smartpropertymanagement.persist.entity;

import java.math.BigDecimal;
import java.util.Date;

public class ContractBillAccountingLogDAO {
    private BigDecimal id;

    private BigDecimal companyId;

    private BigDecimal contractBillId;

    private String accountingType;

    private BigDecimal accountingAmount;

    private BigDecimal beforeAmount;

    private BigDecimal afterAmount;

    private String accountingDate;

    private String accountingRemark;

    private String cdFlag;

    private String deleted;

    private String createUser;

    private String updateUser;

    private Date createTime;

    private Date updateTime;

    private BigDecimal version;

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

    public BigDecimal getContractBillId() {
        return contractBillId;
    }

    public void setContractBillId(BigDecimal contractBillId) {
        this.contractBillId = contractBillId;
    }

    public String getAccountingType() {
        return accountingType;
    }

    public void setAccountingType(String accountingType) {
        this.accountingType = accountingType == null ? null : accountingType.trim();
    }

    public BigDecimal getAccountingAmount() {
        return accountingAmount;
    }

    public void setAccountingAmount(BigDecimal accountingAmount) {
        this.accountingAmount = accountingAmount;
    }

    public BigDecimal getBeforeAmount() {
        return beforeAmount;
    }

    public void setBeforeAmount(BigDecimal beforeAmount) {
        this.beforeAmount = beforeAmount;
    }

    public BigDecimal getAfterAmount() {
        return afterAmount;
    }

    public void setAfterAmount(BigDecimal afterAmount) {
        this.afterAmount = afterAmount;
    }

    public String getAccountingDate() {
        return accountingDate;
    }

    public void setAccountingDate(String accountingDate) {
        this.accountingDate = accountingDate == null ? null : accountingDate.trim();
    }

    public String getAccountingRemark() {
        return accountingRemark;
    }

    public void setAccountingRemark(String accountingRemark) {
        this.accountingRemark = accountingRemark == null ? null : accountingRemark.trim();
    }

    public String getCdFlag() {
        return cdFlag;
    }

    public void setCdFlag(String cdFlag) {
        this.cdFlag = cdFlag == null ? null : cdFlag.trim();
    }

    public String getDeleted() {
        return deleted;
    }

    public void setDeleted(String deleted) {
        this.deleted = deleted == null ? null : deleted.trim();
    }

    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser == null ? null : createUser.trim();
    }

    public String getUpdateUser() {
        return updateUser;
    }

    public void setUpdateUser(String updateUser) {
        this.updateUser = updateUser == null ? null : updateUser.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public BigDecimal getVersion() {
        return version;
    }

    public void setVersion(BigDecimal version) {
        this.version = version;
    }
}