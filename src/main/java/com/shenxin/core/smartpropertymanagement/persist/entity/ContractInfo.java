package com.shenxin.core.smartpropertymanagement.persist.entity;

import java.math.BigDecimal;

public class ContractInfo {
    private BigDecimal id;

    private BigDecimal companyId;

    private BigDecimal contractTemplateId;

    private String principleName;

    private String principleMobile;

    private String principleAddress;

    private String principleAgent;

    private String principleAgentMobile;

    private String principleAgentAddress;

    private String principleAgentRemark;

    private String contraName;

    private String contraMobile;

    private String contraAddress;

    private String contraAgent;

    private String contraAgentMobile;

    private String contraAgentAddress;

    private String contraAgentRemark;

    private BigDecimal relatedClientId;

    private String thirdPartyName;

    private String thirdPartyMobile;

    private BigDecimal contractPeriod;

    private String contractStartDate;

    private String contractEndDate;

    private String contractCloseDate;

    private String contractStatus;

    private String contractType;

    private String signerName;

    private String signerMobile;

    private String signerIdType;

    private String signerIdNo;

    private String signerSex;

    private String signDate;

    private String signTime;

    private String bookingDate;

    private String bookingTime;

    private String bookerName;

    private String bookerMobile;

    private BigDecimal bookingDays;

    private String lastSignDate;

    private String bookingRemark;

    private String feeAmount;

    private String roomId;

    private String htDate;

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

    public BigDecimal getContractTemplateId() {
        return contractTemplateId;
    }

    public void setContractTemplateId(BigDecimal contractTemplateId) {
        this.contractTemplateId = contractTemplateId;
    }

    public String getPrincipleName() {
        return principleName;
    }

    public void setPrincipleName(String principleName) {
        this.principleName = principleName == null ? null : principleName.trim();
    }

    public String getPrincipleMobile() {
        return principleMobile;
    }

    public void setPrincipleMobile(String principleMobile) {
        this.principleMobile = principleMobile == null ? null : principleMobile.trim();
    }

    public String getPrincipleAddress() {
        return principleAddress;
    }

    public void setPrincipleAddress(String principleAddress) {
        this.principleAddress = principleAddress == null ? null : principleAddress.trim();
    }

    public String getPrincipleAgent() {
        return principleAgent;
    }

    public void setPrincipleAgent(String principleAgent) {
        this.principleAgent = principleAgent == null ? null : principleAgent.trim();
    }

    public String getPrincipleAgentMobile() {
        return principleAgentMobile;
    }

    public void setPrincipleAgentMobile(String principleAgentMobile) {
        this.principleAgentMobile = principleAgentMobile == null ? null : principleAgentMobile.trim();
    }

    public String getPrincipleAgentAddress() {
        return principleAgentAddress;
    }

    public void setPrincipleAgentAddress(String principleAgentAddress) {
        this.principleAgentAddress = principleAgentAddress == null ? null : principleAgentAddress.trim();
    }

    public String getPrincipleAgentRemark() {
        return principleAgentRemark;
    }

    public void setPrincipleAgentRemark(String principleAgentRemark) {
        this.principleAgentRemark = principleAgentRemark == null ? null : principleAgentRemark.trim();
    }

    public String getContraName() {
        return contraName;
    }

    public void setContraName(String contraName) {
        this.contraName = contraName == null ? null : contraName.trim();
    }

    public String getContraMobile() {
        return contraMobile;
    }

    public void setContraMobile(String contraMobile) {
        this.contraMobile = contraMobile == null ? null : contraMobile.trim();
    }

    public String getContraAddress() {
        return contraAddress;
    }

    public void setContraAddress(String contraAddress) {
        this.contraAddress = contraAddress == null ? null : contraAddress.trim();
    }

    public String getContraAgent() {
        return contraAgent;
    }

    public void setContraAgent(String contraAgent) {
        this.contraAgent = contraAgent == null ? null : contraAgent.trim();
    }

    public String getContraAgentMobile() {
        return contraAgentMobile;
    }

    public void setContraAgentMobile(String contraAgentMobile) {
        this.contraAgentMobile = contraAgentMobile == null ? null : contraAgentMobile.trim();
    }

    public String getContraAgentAddress() {
        return contraAgentAddress;
    }

    public void setContraAgentAddress(String contraAgentAddress) {
        this.contraAgentAddress = contraAgentAddress == null ? null : contraAgentAddress.trim();
    }

    public String getContraAgentRemark() {
        return contraAgentRemark;
    }

    public void setContraAgentRemark(String contraAgentRemark) {
        this.contraAgentRemark = contraAgentRemark == null ? null : contraAgentRemark.trim();
    }

    public BigDecimal getRelatedClientId() {
        return relatedClientId;
    }

    public void setRelatedClientId(BigDecimal relatedClientId) {
        this.relatedClientId = relatedClientId;
    }

    public String getThirdPartyName() {
        return thirdPartyName;
    }

    public void setThirdPartyName(String thirdPartyName) {
        this.thirdPartyName = thirdPartyName == null ? null : thirdPartyName.trim();
    }

    public String getThirdPartyMobile() {
        return thirdPartyMobile;
    }

    public void setThirdPartyMobile(String thirdPartyMobile) {
        this.thirdPartyMobile = thirdPartyMobile == null ? null : thirdPartyMobile.trim();
    }

    public BigDecimal getContractPeriod() {
        return contractPeriod;
    }

    public void setContractPeriod(BigDecimal contractPeriod) {
        this.contractPeriod = contractPeriod;
    }

    public String getContractStartDate() {
        return contractStartDate;
    }

    public void setContractStartDate(String contractStartDate) {
        this.contractStartDate = contractStartDate == null ? null : contractStartDate.trim();
    }

    public String getContractEndDate() {
        return contractEndDate;
    }

    public void setContractEndDate(String contractEndDate) {
        this.contractEndDate = contractEndDate == null ? null : contractEndDate.trim();
    }

    public String getContractCloseDate() {
        return contractCloseDate;
    }

    public void setContractCloseDate(String contractCloseDate) {
        this.contractCloseDate = contractCloseDate == null ? null : contractCloseDate.trim();
    }

    public String getContractStatus() {
        return contractStatus;
    }

    public void setContractStatus(String contractStatus) {
        this.contractStatus = contractStatus == null ? null : contractStatus.trim();
    }

    public String getContractType() {
        return contractType;
    }

    public void setContractType(String contractType) {
        this.contractType = contractType == null ? null : contractType.trim();
    }

    public String getSignerName() {
        return signerName;
    }

    public void setSignerName(String signerName) {
        this.signerName = signerName == null ? null : signerName.trim();
    }

    public String getSignerMobile() {
        return signerMobile;
    }

    public void setSignerMobile(String signerMobile) {
        this.signerMobile = signerMobile == null ? null : signerMobile.trim();
    }

    public String getSignerIdType() {
        return signerIdType;
    }

    public void setSignerIdType(String signerIdType) {
        this.signerIdType = signerIdType == null ? null : signerIdType.trim();
    }

    public String getSignerIdNo() {
        return signerIdNo;
    }

    public void setSignerIdNo(String signerIdNo) {
        this.signerIdNo = signerIdNo == null ? null : signerIdNo.trim();
    }

    public String getSignerSex() {
        return signerSex;
    }

    public void setSignerSex(String signerSex) {
        this.signerSex = signerSex == null ? null : signerSex.trim();
    }

    public String getSignDate() {
        return signDate;
    }

    public void setSignDate(String signDate) {
        this.signDate = signDate == null ? null : signDate.trim();
    }

    public String getSignTime() {
        return signTime;
    }

    public void setSignTime(String signTime) {
        this.signTime = signTime == null ? null : signTime.trim();
    }

    public String getBookingDate() {
        return bookingDate;
    }

    public void setBookingDate(String bookingDate) {
        this.bookingDate = bookingDate == null ? null : bookingDate.trim();
    }

    public String getBookingTime() {
        return bookingTime;
    }

    public void setBookingTime(String bookingTime) {
        this.bookingTime = bookingTime == null ? null : bookingTime.trim();
    }

    public String getBookerName() {
        return bookerName;
    }

    public void setBookerName(String bookerName) {
        this.bookerName = bookerName == null ? null : bookerName.trim();
    }

    public String getBookerMobile() {
        return bookerMobile;
    }

    public void setBookerMobile(String bookerMobile) {
        this.bookerMobile = bookerMobile == null ? null : bookerMobile.trim();
    }

    public BigDecimal getBookingDays() {
        return bookingDays;
    }

    public void setBookingDays(BigDecimal bookingDays) {
        this.bookingDays = bookingDays;
    }

    public String getLastSignDate() {
        return lastSignDate;
    }

    public void setLastSignDate(String lastSignDate) {
        this.lastSignDate = lastSignDate == null ? null : lastSignDate.trim();
    }

    public String getBookingRemark() {
        return bookingRemark;
    }

    public void setBookingRemark(String bookingRemark) {
        this.bookingRemark = bookingRemark == null ? null : bookingRemark.trim();
    }

    public String getFeeAmount() {
        return feeAmount;
    }

    public void setFeeAmount(String feeAmount) {
        this.feeAmount = feeAmount;
    }

    public String getRoomId() {
        return roomId;
    }

    public void setRoomId(String roomId) {
        this.roomId = roomId;
    }

    public String getHtDate() {
        return htDate;
    }

    public void setHtDate(String htDate) {
        this.htDate = htDate;
    }
}