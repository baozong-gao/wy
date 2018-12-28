package com.shenxin.core.smartpropertymanagement.domain.vo;

import lombok.Data;

import java.math.BigDecimal;

/**
 * @author Lancelot cailuyuan
 * @create 2018-06-25 20:19
 * @description 用于前台页面的展示
 */
@Data
public class CompanyInfoVO {
    private BigDecimal id;

    private  String companyName;

    private String linkName;

    private String linkPhone;

    private String address;

    private String servicePhone;

    private String companyStatus;

    private String legalName;

    private String legalPhone;

    private String legalIdNo;

    private String legalEmail;

    private String linkIdNo;

    private String linkEmail;
}
