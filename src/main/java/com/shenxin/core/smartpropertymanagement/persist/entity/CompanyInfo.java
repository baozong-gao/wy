package com.shenxin.core.smartpropertymanagement.persist.entity;

import com.shenxin.core.smartpropertymanagement.domain.em.SearchFieldRelationType;

import java.math.BigDecimal;

public class CompanyInfo {
    private BigDecimal id;

    private BigDecimal parentId;

    private BigDecimal grade;

    private String companyName;

    private String companyShortName;

    private String companyEnName;

    private String companyType;

    private String address;

    private String websiteDomain;

    private String servicePhone;

    private String zipCode;

    private String serviceType;

    private String legalName;

    private String legalPhone;

    private String legalEmail;

    private String legalIdNo;

    @SearchFieldRelationType
    private String linkName;

    private String linkPhone;

    private String linkEmail;

    private String linkIdNo;

    private String companyStatus;

    private String remark;

    private String imgFileXuke;

    private String imgFileFront;

    private String imgFileBack;

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

    public BigDecimal getGrade() {
        return grade;
    }

    public void setGrade(BigDecimal grade) {
        this.grade = grade;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName == null ? null : companyName.trim();
    }

    public String getCompanyShortName() {
        return companyShortName;
    }

    public void setCompanyShortName(String companyShortName) {
        this.companyShortName = companyShortName == null ? null : companyShortName.trim();
    }

    public String getCompanyEnName() {
        return companyEnName;
    }

    public void setCompanyEnName(String companyEnName) {
        this.companyEnName = companyEnName == null ? null : companyEnName.trim();
    }

    public String getCompanyType() {
        return companyType;
    }

    public void setCompanyType(String companyType) {
        this.companyType = companyType == null ? null : companyType.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getWebsiteDomain() {
        return websiteDomain;
    }

    public void setWebsiteDomain(String websiteDomain) {
        this.websiteDomain = websiteDomain == null ? null : websiteDomain.trim();
    }

    public String getServicePhone() {
        return servicePhone;
    }

    public void setServicePhone(String servicePhone) {
        this.servicePhone = servicePhone == null ? null : servicePhone.trim();
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode == null ? null : zipCode.trim();
    }

    public String getServiceType() {
        return serviceType;
    }

    public void setServiceType(String serviceType) {
        this.serviceType = serviceType == null ? null : serviceType.trim();
    }

    public String getLegalName() {
        return legalName;
    }

    public void setLegalName(String legalName) {
        this.legalName = legalName == null ? null : legalName.trim();
    }

    public String getLegalPhone() {
        return legalPhone;
    }

    public void setLegalPhone(String legalPhone) {
        this.legalPhone = legalPhone == null ? null : legalPhone.trim();
    }

    public String getLegalEmail() {
        return legalEmail;
    }

    public void setLegalEmail(String legalEmail) {
        this.legalEmail = legalEmail == null ? null : legalEmail.trim();
    }

    public String getLegalIdNo() {
        return legalIdNo;
    }

    public void setLegalIdNo(String legalIdNo) {
        this.legalIdNo = legalIdNo == null ? null : legalIdNo.trim();
    }

    public String getLinkName() {
        return linkName;
    }

    public void setLinkName(String linkName) {
        this.linkName = linkName == null ? null : linkName.trim();
    }

    public String getLinkPhone() {
        return linkPhone;
    }

    public void setLinkPhone(String linkPhone) {
        this.linkPhone = linkPhone == null ? null : linkPhone.trim();
    }

    public String getLinkEmail() {
        return linkEmail;
    }

    public void setLinkEmail(String linkEmail) {
        this.linkEmail = linkEmail == null ? null : linkEmail.trim();
    }

    public String getLinkIdNo() {
        return linkIdNo;
    }

    public void setLinkIdNo(String linkIdNo) {
        this.linkIdNo = linkIdNo == null ? null : linkIdNo.trim();
    }

    public String getCompanyStatus() {
        return companyStatus;
    }

    public void setCompanyStatus(String companyStatus) {
        this.companyStatus = companyStatus == null ? null : companyStatus.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public String getImgFileXuke() {
        return imgFileXuke;
    }

    public void setImgFileXuke(String imgFileXuke) {
        this.imgFileXuke = imgFileXuke;
    }

    public String getImgFileFront() {
        return imgFileFront;
    }

    public void setImgFileFront(String imgFileFront) {
        this.imgFileFront = imgFileFront;
    }

    public String getImgFileBack() {
        return imgFileBack;
    }

    public void setImgFileBack(String imgFileBack) {
        this.imgFileBack = imgFileBack;
    }

}