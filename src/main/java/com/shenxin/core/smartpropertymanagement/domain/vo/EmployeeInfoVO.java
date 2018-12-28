package com.shenxin.core.smartpropertymanagement.domain.vo;

import lombok.Data;

import java.math.BigDecimal;

/**
 * @author Lancelot cailuyuan
 * @create 2018-07-04 16:59
 * @description
 */
@Data
public class EmployeeInfoVO {

    public BigDecimal id;

    public String name;

    public String mobile;

    public String sex;

    public String age;

    public String education;

    public String departmentChairman;

}
