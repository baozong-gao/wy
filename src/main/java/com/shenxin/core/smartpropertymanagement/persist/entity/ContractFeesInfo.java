package com.shenxin.core.smartpropertymanagement.persist.entity;

import com.shenxin.core.smartpropertymanagement.domain.em.FieldRelationTypeEnum;
import com.shenxin.core.smartpropertymanagement.domain.em.SearchFieldRelationType;
import com.shenxin.core.smartpropertymanagement.domain.em.SearchFiledAlias;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

public class ContractFeesInfo {
    private BigDecimal id;

    private BigDecimal companyId;

    private BigDecimal contractId;

    private BigDecimal roomId;

    private BigDecimal billsId;

    private String feeType;

    private String feePayType;

    private BigDecimal feeAmount;

    private BigDecimal feePeriod;

    private String feePhase;

    @SearchFieldRelationType(value = FieldRelationTypeEnum.GREAT_EQUAL)
    private String feeStartDate;

    @SearchFieldRelationType(value = FieldRelationTypeEnum.LESS_EQUAL)
    private String feeEndDate;

    private String receivableDate;

    private BigDecimal penaltyFee;

    private BigDecimal discountFee;

    private String discountRemark;

    private BigDecimal realAmount;

    private String feeStatus;

    private String feeRemark;

    private String deleted;

    private String createUser;

    private String updateUser;

    private Date createTime;

    private Date updateTime;

    private BigDecimal version;

    @SearchFiledAlias("contractId")
    private List<BigDecimal> ids;

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

    public BigDecimal getBillsId() {
        return billsId;
    }

    public void setBillsId(BigDecimal billsId) {
        this.billsId = billsId;
    }

    public String getFeeType() {
        return feeType;
    }

    public void setFeeType(String feeType) {
        this.feeType = feeType == null ? null : feeType.trim();
    }

    public String getFeePayType() {
        return feePayType;
    }

    public void setFeePayType(String feePayType) {
        this.feePayType = feePayType == null ? null : feePayType.trim();
    }

    public BigDecimal getFeeAmount() {
        return feeAmount;
    }

    public void setFeeAmount(BigDecimal feeAmount) {
        this.feeAmount = feeAmount;
    }

    public BigDecimal getFeePeriod() {
        return feePeriod;
    }

    public void setFeePeriod(BigDecimal feePeriod) {
        this.feePeriod = feePeriod;
    }

    public String getFeePhase() {
        return feePhase;
    }

    public void setFeePhase(String feePhase) {
        this.feePhase = feePhase == null ? null : feePhase.trim();
    }

    public String getFeeStartDate() {
        return feeStartDate;
    }

    public void setFeeStartDate(String feeStartDate) {
        this.feeStartDate = feeStartDate == null ? null : feeStartDate.trim();
    }

    public String getFeeEndDate() {
        return feeEndDate;
    }

    public void setFeeEndDate(String feeEndDate) {
        this.feeEndDate = feeEndDate == null ? null : feeEndDate.trim();
    }

    public String getReceivableDate() {
        return receivableDate;
    }

    public void setReceivableDate(String receivableDate) {
        this.receivableDate = receivableDate == null ? null : receivableDate.trim();
    }

    public BigDecimal getPenaltyFee() {
        return penaltyFee;
    }

    public void setPenaltyFee(BigDecimal penaltyFee) {
        this.penaltyFee = penaltyFee;
    }

    public BigDecimal getDiscountFee() {
        return discountFee;
    }

    public void setDiscountFee(BigDecimal discountFee) {
        this.discountFee = discountFee;
    }

    public String getDiscountRemark() {
        return discountRemark;
    }

    public void setDiscountRemark(String discountRemark) {
        this.discountRemark = discountRemark == null ? null : discountRemark.trim();
    }

    public BigDecimal getRealAmount() {
        return realAmount;
    }

    public void setRealAmount(BigDecimal realAmount) {
        this.realAmount = realAmount;
    }

    public String getFeeStatus() {
        return feeStatus;
    }

    public void setFeeStatus(String feeStatus) {
        this.feeStatus = feeStatus == null ? null : feeStatus.trim();
    }

    public String getFeeRemark() {
        return feeRemark;
    }

    public void setFeeRemark(String feeRemark) {
        this.feeRemark = feeRemark == null ? null : feeRemark.trim();
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

    public List<BigDecimal> getIds() {
        return ids;
    }

    public void setIds(List<BigDecimal> ids) {
        this.ids = ids;
    }
}