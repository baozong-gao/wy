package com.shenxin.core.smartpropertymanagement.persist.entity;

import java.math.BigDecimal;

public class ClientAccountInfo {
    private BigDecimal id;

    private BigDecimal companyId;

    private BigDecimal clientId;

    private String accountType;

    private String cardNo;

    private String cardHolderName;

    private String cardBankName;

    private String cardBankNo;

    private String cardBankEnName;

    private String cardBranchName;

    private String cardBranchNo;

    private String contactInfo;

    private String taxInfo;

    private String idType;

    private String idNo;

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

    public BigDecimal getClientId() {
        return clientId;
    }

    public void setClientId(BigDecimal clientId) {
        this.clientId = clientId;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType == null ? null : accountType.trim();
    }

    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo == null ? null : cardNo.trim();
    }

    public String getCardHolderName() {
        return cardHolderName;
    }

    public void setCardHolderName(String cardHolderName) {
        this.cardHolderName = cardHolderName == null ? null : cardHolderName.trim();
    }

    public String getCardBankName() {
        return cardBankName;
    }

    public void setCardBankName(String cardBankName) {
        this.cardBankName = cardBankName == null ? null : cardBankName.trim();
    }

    public String getCardBankNo() {
        return cardBankNo;
    }

    public void setCardBankNo(String cardBankNo) {
        this.cardBankNo = cardBankNo == null ? null : cardBankNo.trim();
    }

    public String getCardBankEnName() {
        return cardBankEnName;
    }

    public void setCardBankEnName(String cardBankEnName) {
        this.cardBankEnName = cardBankEnName == null ? null : cardBankEnName.trim();
    }

    public String getCardBranchName() {
        return cardBranchName;
    }

    public void setCardBranchName(String cardBranchName) {
        this.cardBranchName = cardBranchName == null ? null : cardBranchName.trim();
    }

    public String getCardBranchNo() {
        return cardBranchNo;
    }

    public void setCardBranchNo(String cardBranchNo) {
        this.cardBranchNo = cardBranchNo == null ? null : cardBranchNo.trim();
    }

    public String getContactInfo() {
        return contactInfo;
    }

    public void setContactInfo(String contactInfo) {
        this.contactInfo = contactInfo == null ? null : contactInfo.trim();
    }

    public String getTaxInfo() {
        return taxInfo;
    }

    public void setTaxInfo(String taxInfo) {
        this.taxInfo = taxInfo == null ? null : taxInfo.trim();
    }

    public String getIdType() {
        return idType;
    }

    public void setIdType(String idType) {
        this.idType = idType == null ? null : idType.trim();
    }

    public String getIdNo() {
        return idNo;
    }

    public void setIdNo(String idNo) {
        this.idNo = idNo == null ? null : idNo.trim();
    }
}