package com.shenxin.core.smartpropertymanagement.domain.bo;

import com.shenxin.core.smartpropertymanagement.domain.BaseForm;
import lombok.Data;

import java.math.BigDecimal;

/**
 * @author Lancelot cailuyuan
 * @create 2018-08-29 14:24
 * @description
 */
@Data
public class ContractBillAccountingLogBO extends BaseForm<ContractBillAccountingLogBO>{

    private BigDecimal contractBillId;
}
