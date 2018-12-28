package com.shenxin.core.smartpropertymanagement.domain.vo;

import lombok.Data;

import java.math.BigDecimal;

/**
 * @Author: gaobaozong
 * @Description: 商业合同
 * @Date: Created in 2018/7/23 - 16:05
 * @Version: V1.0
 */
@Data
public class ContractBusinessVO {

    private Object [] attachIds; //附件id

    private BigDecimal feePayPeriod; //付几

    private BigDecimal feeHoldPeriod;  //押几

    private BigDecimal payAmt; //租金

    private BigDecimal depositAmt; //押金

    private BigDecimal propertyAmt; //物业费

    private String feePayType; //物业费支付类型

    private String propertyChangeCalculate;//物业费每年增加

    private String feeChangeCalculate;//每年增加

    private String room;

    private String company;

    private String property;

    private String building;

    private BigDecimal id;

    private BigDecimal companyId;

    private BigDecimal contractTemplateId;

    private String principleName;

    private String principleMobile;

    private String principleAddress;

    private String principleAgent;

    private String principleAgentMobile;

    private String principleAgentAddress;

    private String principleAgentRemark;

    private String contraName;

    private String contraMobile;

    private String contraAddress;

    private String contraAgent;

    private String contraAgentMobile;

    private String contraAgentAddress;

    private String contraAgentRemark;

    private BigDecimal relatedClientId;

    private String thirdPartyName;

    private String thirdPartyMobile;

    private BigDecimal contractPeriod;

    private String contractStartDate;

    private String contractEndDate;

    private String contractCloseDate;

    private String contractStatus;

    private String contractType;

    private String signerName;

    private String signerMobile;

    private String signerIdType;

    private String signerIdNo;

    private String signerSex;

    private String signDate;

    private String signTime;

    private String bookingDate;

    private String bookingTime;

    private String bookerName;

    private String bookerMobile;

    private BigDecimal bookingDays;

    private String lastSignDate;

    private String bookingRemark;
}
