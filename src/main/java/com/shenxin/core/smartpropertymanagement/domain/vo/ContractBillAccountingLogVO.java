package com.shenxin.core.smartpropertymanagement.domain.vo;

import lombok.Data;

import java.math.BigDecimal;

/**
 * @author Lancelot cailuyuan
 * @create 2018-08-29 14:26
 * @description
 */
@Data
public class ContractBillAccountingLogVO {

    private BigDecimal contractBillId;

    private BigDecimal createUser;

    private String billStatus;

    private BigDecimal penaltyAmount;

    private BigDecimal billAmount;

    private BigDecimal afterAmount;

    private String roomDesc;

    private BigDecimal contractId;

    private String operator;

    private BigDecimal contractFeeId;
}
