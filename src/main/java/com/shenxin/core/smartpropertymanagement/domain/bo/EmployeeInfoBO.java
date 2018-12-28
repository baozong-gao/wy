package com.shenxin.core.smartpropertymanagement.domain.bo;

import com.shenxin.core.smartpropertymanagement.domain.BaseForm;
import lombok.Data;

import java.math.BigDecimal;

/**
 * @author Lancelot cailuyuan
 * @create 2018-07-04 16:56
 * @description 查询用
 */
@Data
public class EmployeeInfoBO extends BaseForm<EmployeeInfoBO>{
    public String name;

    public String mobile;
}
