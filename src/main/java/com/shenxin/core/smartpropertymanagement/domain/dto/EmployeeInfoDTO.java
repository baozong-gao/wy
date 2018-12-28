package com.shenxin.core.smartpropertymanagement.domain.dto;

import com.shenxin.core.smartpropertymanagement.domain.BaseField;
import com.shenxin.core.smartpropertymanagement.domain.em.validator.StringByteSize;
import lombok.Data;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import java.math.BigDecimal;

/**
 * @author Lancelot cailuyuan
 * @create 2018-07-04 16:59
 * @description 用于传输数据
 */
@Data
public class EmployeeInfoDTO extends BaseField{
    public BigDecimal id;
    @NotNull(message = "部门不能为空")
    public BigDecimal departmentId;
    @NotNull(message = "员工姓名不能为空")
    @StringByteSize(max = 42, message = "员工姓名长度超限")
    public String name;
    @NotNull(message = "员工手机号不能为空")
    @Pattern(regexp = "[0-9]{11}", message = "员工手机号不合法")
    public String mobile;

    public String sex;

    public String age;

    public String education;

    public String departmentChairman;

    public String employeeRole;

}
