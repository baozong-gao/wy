package com.shenxin.core.smartpropertymanagement.domain.vo;

import lombok.Data;

import java.math.BigDecimal;

/**
 * @author Lancelot cailuyuan
 * @create 2018-08-28 15:20
 * @description
 */
@Data
public class ContractFeeAccountingLogVO {

    private String createUser;

    private String operator;

    private BigDecimal beforeAmount;

    private BigDecimal afterAmount;

    private BigDecimal contractFeeId;

    private String feeType;

    private String feePayType;

    private String feePhase;

    private BigDecimal penaltyFee;

    private String feeStatus;
}
