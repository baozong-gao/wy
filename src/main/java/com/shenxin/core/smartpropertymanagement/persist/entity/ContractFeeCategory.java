package com.shenxin.core.smartpropertymanagement.persist.entity;

import java.math.BigDecimal;

public class ContractFeeCategory {
    private BigDecimal id;

    private BigDecimal companyId;

    private BigDecimal contractId;

    private BigDecimal roomId;

    private String feePayType;

    private String feeType;

    private BigDecimal feeAmount;

    private BigDecimal penaltyRate;

    private String penaltyCalculateType;

    private BigDecimal feePayPeriod;

    private BigDecimal feeHoldPeriod;

    private String feeRemark;

    private String feeStatus;

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

    public BigDecimal getRoomId() {
        return roomId;
    }

    public void setRoomId(BigDecimal roomId) {
        this.roomId = roomId;
    }

    public String getFeePayType() {
        return feePayType;
    }

    public void setFeePayType(String feePayType) {
        this.feePayType = feePayType == null ? null : feePayType.trim();
    }

    public String getFeeType() {
        return feeType;
    }

    public void setFeeType(String feeType) {
        this.feeType = feeType == null ? null : feeType.trim();
    }

    public BigDecimal getFeeAmount() {
        return feeAmount;
    }

    public void setFeeAmount(BigDecimal feeAmount) {
        this.feeAmount = feeAmount;
    }

    public BigDecimal getPenaltyRate() {
        return penaltyRate;
    }

    public void setPenaltyRate(BigDecimal penaltyRate) {
        this.penaltyRate = penaltyRate;
    }

    public String getPenaltyCalculateType() {
        return penaltyCalculateType;
    }

    public void setPenaltyCalculateType(String penaltyCalculateType) {
        this.penaltyCalculateType = penaltyCalculateType == null ? null : penaltyCalculateType.trim();
    }

    public BigDecimal getFeePayPeriod() {
        return feePayPeriod;
    }

    public void setFeePayPeriod(BigDecimal feePayPeriod) {
        this.feePayPeriod = feePayPeriod;
    }

    public BigDecimal getFeeHoldPeriod() {
        return feeHoldPeriod;
    }

    public void setFeeHoldPeriod(BigDecimal feeHoldPeriod) {
        this.feeHoldPeriod = feeHoldPeriod;
    }

    public String getFeeRemark() {
        return feeRemark;
    }

    public void setFeeRemark(String feeRemark) {
        this.feeRemark = feeRemark == null ? null : feeRemark.trim();
    }

    public String getFeeStatus() {
        return feeStatus;
    }

    public void setFeeStatus(String feeStatus) {
        this.feeStatus = feeStatus == null ? null : feeStatus.trim();
    }
}