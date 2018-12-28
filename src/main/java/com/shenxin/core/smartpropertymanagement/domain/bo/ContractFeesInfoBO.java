package com.shenxin.core.smartpropertymanagement.domain.bo;

import com.shenxin.core.smartpropertymanagement.domain.BaseForm;
import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

/**
 * @author Lancelot cailuyuan
 * @create 2018-07-19 17:26
 * @description
 */
@Data
public class ContractFeesInfoBO extends BaseForm<ContractFeesInfoBO>{

    private BigDecimal id;

    private List<BigDecimal> ids;

    private String feeStartDate;

    private String feeEndDate;

    private BigDecimal contractId;

    private String roomDesc;

    private String bookerName;

    private BigDecimal propertyId;

    private BigDecimal buildingId;
}
