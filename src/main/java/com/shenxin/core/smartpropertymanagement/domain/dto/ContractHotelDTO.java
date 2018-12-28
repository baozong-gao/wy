package com.shenxin.core.smartpropertymanagement.domain.dto;

import com.shenxin.core.smartpropertymanagement.domain.BaseField;
import com.shenxin.core.smartpropertymanagement.domain.em.validator.StringByteSize;
import com.shenxin.core.smartpropertymanagement.util.BeanUtils;
import lombok.Data;
import org.apache.commons.lang3.StringUtils;

import javax.validation.constraints.Max;
import javax.validation.constraints.Pattern;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Data
public class ContractHotelDTO extends BaseField {

    private BigDecimal roomId;

    private BigDecimal feePayPeriod; //付几

    private BigDecimal feeHoldPeriod;  //押几

    private BigDecimal payAmt; //租金

    private BigDecimal depositAmt; //押金

    private String feeChangeCalculate;//每年增加

    public List<ContractRoomLiverDTO> livers; //费用

    public List<ContractFeeCategory> fees; //费用

    private BigDecimal id;

    private BigDecimal contractTemplateId; //合同模板

    @StringByteSize(max = 256, message = "承租人名称超限")
    private String principleName;

    private String principleMobile;

    private String czCardType;

    private String czCardIdNo;

    //附件
    private String hotelBPic;

    private String hotelAPic;

    @Max(value = Integer.MAX_VALUE, message = "合同周期不正确")
    private BigDecimal contractPeriod;

    @Pattern(regexp = "(([0-9]{3}[1-9]|[0-9]{2}[1-9][0-9]{1}|[0-9]{1}[1-9][0-9]{2}|[1-9][0-9]{3})(((0[13578]|1[02])(0[1-9]|[12][0-9]|3[01]))|((0[469]|11)(0[1-9]|[12][0-9]|30))|(02(0[1-9]|[1][0-9]|2[0-8]))))|((([0-9]{2})(0[48]|[2468][048]|[13579][26])|((0[48]|[2468][048]|[3579][26])00))0229)", message = "租期格式不正确")
    private String contractStartDate;

    @Pattern(regexp = "(([0-9]{3}[1-9]|[0-9]{2}[1-9][0-9]{1}|[0-9]{1}[1-9][0-9]{2}|[1-9][0-9]{3})(((0[13578]|1[02])(0[1-9]|[12][0-9]|3[01]))|((0[469]|11)(0[1-9]|[12][0-9]|30))|(02(0[1-9]|[1][0-9]|2[0-8]))))|((([0-9]{2})(0[48]|[2468][048]|[13579][26])|((0[48]|[2468][048]|[3579][26])00))0229)", message = "租期格式不正确")
    private String contractEndDate;
    @Pattern(regexp = "(([0-9]{3}[1-9]|[0-9]{2}[1-9][0-9]{1}|[0-9]{1}[1-9][0-9]{2}|[1-9][0-9]{3})(((0[13578]|1[02])(0[1-9]|[12][0-9]|3[01]))|((0[469]|11)(0[1-9]|[12][0-9]|30))|(02(0[1-9]|[1][0-9]|2[0-8]))))|((([0-9]{2})(0[48]|[2468][048]|[13579][26])|((0[48]|[2468][048]|[3579][26])00))0229)", message = "合同关闭格式不正确")
    private String contractCloseDate;

    @Pattern(regexp = "^(NORMAL|RETREAT|NEED_CONFIRM|CLOSE){0,1}$", message = "合同状态不正确")
    private String contractStatus;

    @Pattern(regexp = "^(BIZ_RENT|FEE|HOTEL_RENT|HOTEL_BOOKING){0,1}$", message = "合同类型不正确")
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

    public void setContractStartDate(String d) {
        if (StringUtils.isNotBlank(d)) {
            d = StringUtils.remove(d, " ");
            String[] temp = d.split("~");
            if (temp.length == 2) {
                contractStartDate = StringUtils.remove(temp[0], "-");
                contractEndDate = StringUtils.remove(temp[1], "-");
            }
        } else {
            contractStartDate = d;
        }
    }

    public void setLivers(String d){
        if(StringUtils.isNotBlank(d)){
            this.livers = (ArrayList) BeanUtils.json2Object(d, ArrayList.class, ContractRoomLiverDTO.class);
        }
    }

    public void setFees(String d){
        if(StringUtils.isNotBlank(d)){
            this.fees = (ArrayList) BeanUtils.json2Object(d, ArrayList.class, ContractFeeCategory.class);
        }
    }
    @Data
    public static class ContractFeeCategory {
        public String feePayType;
        public String feeType;
        public BigDecimal feeAmount;
    }

    @Data
    public static class ContractRoomLiverDTO {
        @StringByteSize(max = 256, message = "入住人名称超限")
        public String liverName;
        public String liverMobile;
        public String liverSex;
        public String liverIdType;
        public String liverIdNo;
    }

}
