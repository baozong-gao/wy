package com.shenxin.core.smartpropertymanagement.domain.dto;

import com.shenxin.core.smartpropertymanagement.domain.BaseField;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @author Lancelot cailuyuan
 * @create 2018-08-20 10:22
 * @description
 */
@Data
public class ContractBillsDTO extends BaseField {

    private BigDecimal id;

    private BigDecimal contractId;

    private BigDecimal billAmount;

    private BigDecimal discountAmount;

    private String needPayAmount;

    private String updateUser;

    private Date updateTime;

    private BigDecimal version;

    private BigDecimal discountAmountForLog;
}
