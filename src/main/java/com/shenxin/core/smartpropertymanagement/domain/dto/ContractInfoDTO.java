package com.shenxin.core.smartpropertymanagement.domain.dto;

import com.shenxin.core.smartpropertymanagement.domain.BaseField;
import lombok.Data;

import java.math.BigDecimal;

/**
 * @author Lancelot cailuyuan
 * @create 2018-07-24 10:57
 * @description
 */
@Data
public class ContractInfoDTO extends BaseField{


    public String bookerName;

    public String bookerMobile;

    public String lastSignDate;

    public String bookingRemark;

}
