package com.shenxin.core.smartpropertymanagement.domain.vo;

import lombok.Data;

import java.math.BigDecimal;

/**
 * @author Lancelot cailuyuan
 * @create 2018-08-20 10:22
 * @description
 */
@Data
public class ContractBillsVO {

    private BigDecimal id;

    private BigDecimal companyId;

    private BigDecimal contractId;

    private BigDecimal billAmount;

    private BigDecimal discountAmount;

    private BigDecimal needPayAmount;

    private String billStatus;

    private BigDecimal version;

    private String bookerName;

    private String bookerMobile;
}
