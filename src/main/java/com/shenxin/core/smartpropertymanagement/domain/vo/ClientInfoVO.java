package com.shenxin.core.smartpropertymanagement.domain.vo;

import lombok.Data;

import java.math.BigDecimal;

/**
 * @author Lancelot cailuyuan
 * @create 2018-07-13 10:18
 * @description 用于展示已知数据
 */
@Data
public class ClientInfoVO {

    private BigDecimal id;

    private BigDecimal companyId;

    private String clientType;

    private String inName;

    private String inEnName;

    private BigDecimal inAge;

    private String inSexual;

    private String inMobile;

    private String inCountry;

    private String inOrig;

    private String inOrigAddress;

    private String inLiveAddress;

    private String inIdType;

    private String inIdNo;

    private String cmName;

    private String cmEnName;

    private String cmOutName;

    private BigDecimal cmSize;

    private String cmType;

    private String cmCatagory;

    private String cmMainBusiness;

    private String cmAddress;

    private String cmRegisterAmount;

    private String cmRegisterAddress;

    private String cmCompanyNo;

    private String cmLegalName;

    private String cmLegalPhone;

    private String cmLegalEmail;

    private String cmLinkName;

    private String cmLinkPhone;

    private String cmLinkEmail;

    private String vipFlag;

    private String vipNo;

}
