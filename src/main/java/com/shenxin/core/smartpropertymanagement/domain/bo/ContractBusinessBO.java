package com.shenxin.core.smartpropertymanagement.domain.bo;

import com.shenxin.core.smartpropertymanagement.domain.BaseForm;
import lombok.Data;
import org.apache.commons.lang3.StringUtils;

import java.math.BigDecimal;
import java.util.List;

/**
 * @Author: gaobaozong
 * @Description: 商业合同
 * @Date: Created in 2018/7/23 - 16:04
 * @Version: V1.0
 */
@Data
public class ContractBusinessBO extends BaseForm<ContractBusinessBO> {

    private BigDecimal property;

    private BigDecimal building;

    private BigDecimal room;

    private BigDecimal id;

    private List<BigDecimal> ids;

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

    public void  setContractStartDate(String d){
        if(StringUtils.isNotBlank(d)){
            d = StringUtils.remove(d, " ");
            String [] temp = d.split("~");
            if(temp.length == 2){
                contractStartDate = StringUtils.remove(temp[0], "-");
                contractEndDate = StringUtils.remove(temp[1], "-");
            }
        }else{
            contractStartDate = d;
        }
    }
}
