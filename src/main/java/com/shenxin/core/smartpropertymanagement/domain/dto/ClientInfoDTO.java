package com.shenxin.core.smartpropertymanagement.domain.dto;

import com.shenxin.core.smartpropertymanagement.domain.BaseField;
import lombok.Data;

import java.math.BigDecimal;

/**
 * @author Lancelot cailuyuan
 * @create 2018-07-13 10:19
 * @description
 */
@Data
public class ClientInfoDTO extends BaseField{
    private BigDecimal id;

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
    private BigDecimal clientId;

    private String accountType;

    private String cardNo;

    private String cardHolderName;

    private String cardBankName;

    private String cardBankNo;

    private String cardBankEnName;

    private String cardBranchName;

    private String cardBranchNo;

    private String contactInfo;

    private String taxInfo;

    private String idType;

    private String idNo;

}
