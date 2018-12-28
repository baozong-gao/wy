package com.shenxin.core.smartpropertymanagement.persist.entity;

import com.shenxin.core.smartpropertymanagement.domain.em.SearchFiledAlias;

import java.math.BigDecimal;
import java.util.List;

public class BuildingInfo {
    private BigDecimal id;

    private BigDecimal companyId;

    private BigDecimal propertyId;

    private String buildingName;

    private String buildingArea;

    private String buildingDesc;

    private String buildingPurpose;

    private String ownerType;

    private String ownerName;

    private String ownerContact;

    private String remark;

    @SearchFiledAlias("propertyId")
    private List<BigDecimal> propertyIds;

    public List<BigDecimal> getPropertyIds() {
        return propertyIds;
    }

    public void setPropertyIds(List<BigDecimal> propertyIds) {
        this.propertyIds = propertyIds;
    }

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

    public BigDecimal getPropertyId() {
        return propertyId;
    }

    public void setPropertyId(BigDecimal propertyId) {
        this.propertyId = propertyId;
    }

    public String getBuildingName() {
        return buildingName;
    }

    public void setBuildingName(String buildingName) {
        this.buildingName = buildingName == null ? null : buildingName.trim();
    }

    public String getBuildingArea() {
        return buildingArea;
    }

    public void setBuildingArea(String buildingArea) {
        this.buildingArea = buildingArea == null ? null : buildingArea.trim();
    }

    public String getBuildingDesc() {
        return buildingDesc;
    }

    public void setBuildingDesc(String buildingDesc) {
        this.buildingDesc = buildingDesc == null ? null : buildingDesc.trim();
    }

    public String getBuildingPurpose() {
        return buildingPurpose;
    }

    public void setBuildingPurpose(String buildingPurpose) {
        this.buildingPurpose = buildingPurpose == null ? null : buildingPurpose.trim();
    }

    public String getOwnerType() {
        return ownerType;
    }

    public void setOwnerType(String ownerType) {
        this.ownerType = ownerType == null ? null : ownerType.trim();
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName == null ? null : ownerName.trim();
    }

    public String getOwnerContact() {
        return ownerContact;
    }

    public void setOwnerContact(String ownerContact) {
        this.ownerContact = ownerContact == null ? null : ownerContact.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}