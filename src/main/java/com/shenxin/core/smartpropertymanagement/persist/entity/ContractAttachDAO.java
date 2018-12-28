package com.shenxin.core.smartpropertymanagement.persist.entity;

import java.math.BigDecimal;

public class ContractAttachDAO {
    private BigDecimal id;

    private BigDecimal companyId;

    private BigDecimal contractId;

    private String attachType;

    private String mediaType;

    private String storeType;

    private String mediaLocation;

    private String mediaDesc;

    private String mediaStatus;

    private byte[] mediaContent;

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

    public String getAttachType() {
        return attachType;
    }

    public void setAttachType(String attachType) {
        this.attachType = attachType == null ? null : attachType.trim();
    }

    public String getMediaType() {
        return mediaType;
    }

    public void setMediaType(String mediaType) {
        this.mediaType = mediaType == null ? null : mediaType.trim();
    }

    public String getStoreType() {
        return storeType;
    }

    public void setStoreType(String storeType) {
        this.storeType = storeType == null ? null : storeType.trim();
    }

    public String getMediaLocation() {
        return mediaLocation;
    }

    public void setMediaLocation(String mediaLocation) {
        this.mediaLocation = mediaLocation == null ? null : mediaLocation.trim();
    }

    public String getMediaDesc() {
        return mediaDesc;
    }

    public void setMediaDesc(String mediaDesc) {
        this.mediaDesc = mediaDesc == null ? null : mediaDesc.trim();
    }

    public String getMediaStatus() {
        return mediaStatus;
    }

    public void setMediaStatus(String mediaStatus) {
        this.mediaStatus = mediaStatus == null ? null : mediaStatus.trim();
    }

    public byte[] getMediaContent() {
        return mediaContent;
    }

    public void setMediaContent(byte[] mediaContent) {
        this.mediaContent = mediaContent;
    }
}