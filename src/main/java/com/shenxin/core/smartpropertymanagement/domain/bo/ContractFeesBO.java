package com.shenxin.core.smartpropertymanagement.domain.bo;

import com.shenxin.core.smartpropertymanagement.domain.BaseForm;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @Author: gaobaozong
 * @Description: 帐单计划
 * @Date: Created in 2018/7/24 - 10:12
 * @Version: V1.0
 */
@Data
public class ContractFeesBO extends BaseForm<ContractFeesBO> {

    private BigDecimal id;

    private BigDecimal contractId;

    private BigDecimal roomId;

    private BigDecimal billsId;

    private String feeType;

    private String feePayType;

    private BigDecimal feeAmount;

    private BigDecimal feePeriod;

    private String feePhase;

    private String feeStartDate;

    private String feeEndDate;

    private String receivableDate;

    private BigDecimal penaltyFee;

    private BigDecimal discountFee;

    private String discountRemark;

    private BigDecimal realAmount;

    private String feeStatus;

    private String feeRemark;

    private String deleted;

    private String createUser;

    private String updateUser;

    private Date createTime;

    private Date updateTime;

    private BigDecimal version;
}
