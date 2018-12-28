package com.shenxin.core.smartpropertymanagement.persist.entity;

import java.math.BigDecimal;
import java.util.Date;

public class ContractBillsDAO {
    private BigDecimal id;

    private BigDecimal companyId;

    private BigDecimal contractId;

    private BigDecimal billAmount;

    private BigDecimal penaltyAmount;

    private BigDecimal discountAmount;

    private String discountRemark;

    private BigDecimal needPayAmount;

    private BigDecimal payAmount;

    private String billStatus;

    private String billRemark;

    private String notifyStatus;

    private String promptStatus;

    private BigDecimal notifyTimes;

    private String lastNotifyTime;

    private BigDecimal promptTimes;

    private String lastPromptTime;

    private BigDecimal paymentRecordId;

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

    public BigDecimal getContractId() {
        return contractId;
    }

    public void setContractId(BigDecimal contractId) {
        this.contractId = contractId;
    }

    public BigDecimal getBillAmount() {
        return billAmount;
    }

    public void setBillAmount(BigDecimal billAmount) {
        this.billAmount = billAmount;
    }

    public BigDecimal getPenaltyAmount() {
        return penaltyAmount;
    }

    public void setPenaltyAmount(BigDecimal penaltyAmount) {
        this.penaltyAmount = penaltyAmount;
    }

    public BigDecimal getDiscountAmount() {
        return discountAmount;
    }

    public void setDiscountAmount(BigDecimal discountAmount) {
        this.discountAmount = discountAmount;
    }

    public String getDiscountRemark() {
        return discountRemark;
    }

    public void setDiscountRemark(String discountRemark) {
        this.discountRemark = discountRemark == null ? null : discountRemark.trim();
    }

    public BigDecimal getNeedPayAmount() {
        return needPayAmount;
    }

    public void setNeedPayAmount(BigDecimal needPayAmount) {
        this.needPayAmount = needPayAmount;
    }

    public BigDecimal getPayAmount() {
        return payAmount;
    }

    public void setPayAmount(BigDecimal payAmount) {
        this.payAmount = payAmount;
    }

    public String getBillStatus() {
        return billStatus;
    }

    public void setBillStatus(String billStatus) {
        this.billStatus = billStatus == null ? null : billStatus.trim();
    }

    public String getBillRemark() {
        return billRemark;
    }

    public void setBillRemark(String billRemark) {
        this.billRemark = billRemark == null ? null : billRemark.trim();
    }

    public String getNotifyStatus() {
        return notifyStatus;
    }

    public void setNotifyStatus(String notifyStatus) {
        this.notifyStatus = notifyStatus == null ? null : notifyStatus.trim();
    }

    public String getPromptStatus() {
        return promptStatus;
    }

    public void setPromptStatus(String promptStatus) {
        this.promptStatus = promptStatus == null ? null : promptStatus.trim();
    }

    public BigDecimal getNotifyTimes() {
        return notifyTimes;
    }

    public void setNotifyTimes(BigDecimal notifyTimes) {
        this.notifyTimes = notifyTimes;
    }

    public String getLastNotifyTime() {
        return lastNotifyTime;
    }

    public void setLastNotifyTime(String lastNotifyTime) {
        this.lastNotifyTime = lastNotifyTime == null ? null : lastNotifyTime.trim();
    }

    public BigDecimal getPromptTimes() {
        return promptTimes;
    }

    public void setPromptTimes(BigDecimal promptTimes) {
        this.promptTimes = promptTimes;
    }

    public String getLastPromptTime() {
        return lastPromptTime;
    }

    public void setLastPromptTime(String lastPromptTime) {
        this.lastPromptTime = lastPromptTime == null ? null : lastPromptTime.trim();
    }

    public BigDecimal getPaymentRecordId() {
        return paymentRecordId;
    }

    public void setPaymentRecordId(BigDecimal paymentRecordId) {
        this.paymentRecordId = paymentRecordId;
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