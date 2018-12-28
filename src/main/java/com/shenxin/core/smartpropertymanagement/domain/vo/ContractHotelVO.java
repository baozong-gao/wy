package com.shenxin.core.smartpropertymanagement.domain.vo;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class ContractHotelVO {

    private String [] attachIds; //附件id

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
}
