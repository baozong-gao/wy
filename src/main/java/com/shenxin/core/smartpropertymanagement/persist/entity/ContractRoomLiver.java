package com.shenxin.core.smartpropertymanagement.persist.entity;

import java.math.BigDecimal;

public class ContractRoomLiver {
    private BigDecimal id;

    private BigDecimal companyId;

    private BigDecimal contractId;

    private BigDecimal roomId;

    private String liverName;

    private String liverSex;

    private BigDecimal liverAge;

    private String liverMobile;

    private String liverIdType;

    private String liverIdNo;

    private BigDecimal relatedClientId;

    private String ownerFlag;

    private String renterFlag;

    private String billReceiver;

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

    public String getLiverName() {
        return liverName;
    }

    public void setLiverName(String liverName) {
        this.liverName = liverName == null ? null : liverName.trim();
    }

    public String getLiverSex() {
        return liverSex;
    }

    public void setLiverSex(String liverSex) {
        this.liverSex = liverSex == null ? null : liverSex.trim();
    }

    public BigDecimal getLiverAge() {
        return liverAge;
    }

    public void setLiverAge(BigDecimal liverAge) {
        this.liverAge = liverAge;
    }

    public String getLiverMobile() {
        return liverMobile;
    }

    public void setLiverMobile(String liverMobile) {
        this.liverMobile = liverMobile == null ? null : liverMobile.trim();
    }

    public String getLiverIdType() {
        return liverIdType;
    }

    public void setLiverIdType(String liverIdType) {
        this.liverIdType = liverIdType == null ? null : liverIdType.trim();
    }

    public String getLiverIdNo() {
        return liverIdNo;
    }

    public void setLiverIdNo(String liverIdNo) {
        this.liverIdNo = liverIdNo == null ? null : liverIdNo.trim();
    }

    public BigDecimal getRelatedClientId() {
        return relatedClientId;
    }

    public void setRelatedClientId(BigDecimal relatedClientId) {
        this.relatedClientId = relatedClientId;
    }

    public String getOwnerFlag() {
        return ownerFlag;
    }

    public void setOwnerFlag(String ownerFlag) {
        this.ownerFlag = ownerFlag == null ? null : ownerFlag.trim();
    }

    public String getRenterFlag() {
        return renterFlag;
    }

    public void setRenterFlag(String renterFlag) {
        this.renterFlag = renterFlag == null ? null : renterFlag.trim();
    }

    public String getBillReceiver() {
        return billReceiver;
    }

    public void setBillReceiver(String billReceiver) {
        this.billReceiver = billReceiver == null ? null : billReceiver.trim();
    }
}