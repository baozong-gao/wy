package com.shenxin.core.smartpropertymanagement.persist.entity;

import java.math.BigDecimal;

public class ContractTemplateDAO {
    private BigDecimal id;

    private BigDecimal companyId;

    private String contractType;

    private String contractTemplateName;

    private String templateDocLocation;

    private String remark;

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

    public String getContractType() {
        return contractType;
    }

    public void setContractType(String contractType) {
        this.contractType = contractType == null ? null : contractType.trim();
    }

    public String getContractTemplateName() {
        return contractTemplateName;
    }

    public void setContractTemplateName(String contractTemplateName) {
        this.contractTemplateName = contractTemplateName == null ? null : contractTemplateName.trim();
    }

    public String getTemplateDocLocation() {
        return templateDocLocation;
    }

    public void setTemplateDocLocation(String templateDocLocation) {
        this.templateDocLocation = templateDocLocation == null ? null : templateDocLocation.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}