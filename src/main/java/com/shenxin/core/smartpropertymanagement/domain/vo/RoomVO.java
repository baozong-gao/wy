package com.shenxin.core.smartpropertymanagement.domain.vo;

import lombok.Data;

import java.math.BigDecimal;

/**
 * @Author: gaobaozong
 * @Description: 房间显示
 * @Date: Created in 2018/7/9 - 10:51
 * @Version: V1.0
 */
@Data
public class RoomVO {

    private BigDecimal id;

    private BigDecimal companyId;

    private BigDecimal propertyId;

    private String propertyName;

    private BigDecimal buildingId;

    private String buildingName;

    private String contractStatus;

    private String unit;

    private String floor;

    private String room;

    private String subRoom;

    private String roomType;

    private String roomDesc;

    private String ownerType;

    private String ownerName;

    private String ownerContact;

    private String roomProperty;

    private String roomPurpose;

    private BigDecimal roomSize;

    private String roomAspect;

    private String roomLayout;

    private BigDecimal roomBookPrice;

    private String roomStatus;

    private String remark;

    private BigDecimal roomRentPrice;

    public String groupByBuildingAndUnit(){
        return buildingId + "-" + unit;
    }


}
