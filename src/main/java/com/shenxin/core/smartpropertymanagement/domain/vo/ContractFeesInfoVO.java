package com.shenxin.core.smartpropertymanagement.domain.vo;

import lombok.Data;

import java.math.BigDecimal;

/**
 * @author Lancelot cailuyuan
 * @create 2018-07-19 17:26
 * @description
 */
@Data
public class ContractFeesInfoVO {

    public BigDecimal id;

    public BigDecimal companyId;

    public BigDecimal roomId;

    public String feeType;

    public String feePayType;

    public BigDecimal feePeriod;

    public BigDecimal feeAmount;

    public BigDecimal contractId;

    public String feePhase;

    public String receivableDate;

    public String feeStatus;

    public String propertyName;

    public String buildingName;

    public String ownerName;

    public String principleName;

    public BigDecimal version;

    public String operator;

    public String createUser;

    private String feeStartDate;

    private String feeEndDate;

    private String bookerName;

    private String bookerMobile;

    private String roomDesc;
}
