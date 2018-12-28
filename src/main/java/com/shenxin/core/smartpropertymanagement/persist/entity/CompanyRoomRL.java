package com.shenxin.core.smartpropertymanagement.persist.entity;

import lombok.Data;

import java.math.BigDecimal;

/**
 * @Author: gaobaozong
 * @Description: 房间 , 公司 , 业态
 * @Date: Created in 2018/8/6 - 11:14
 * @Version: V1.0
 */
@Data
public class CompanyRoomRL {

    BigDecimal contractId;

    String roomName;

    String companyName;

    String propertyName;

    String buildingName;
}
