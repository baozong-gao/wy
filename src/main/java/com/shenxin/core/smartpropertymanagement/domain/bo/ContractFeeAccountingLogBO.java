package com.shenxin.core.smartpropertymanagement.domain.bo;

import com.shenxin.core.smartpropertymanagement.domain.BaseForm;
import lombok.Data;

import java.math.BigDecimal;

/**
 * @author Lancelot cailuyuan
 * @create 2018-08-28 15:18
 * @description
 */
@Data
public class ContractFeeAccountingLogBO extends BaseForm<ContractFeeAccountingLogBO>{

    private BigDecimal contractFeeId;
}
