package com.shenxin.core.smartpropertymanagement.domain.dto;

import com.shenxin.core.smartpropertymanagement.domain.BaseField;
import com.shenxin.core.smartpropertymanagement.domain.em.validator.StringByteSize;
import lombok.Data;

import java.math.BigDecimal;

/**
 * @Author: gaobaozong
 * @Description: 房间插入更新
 * @Date: Created in 2018/7/9 - 10:49
 * @Version: V1.0
 */
@Data
public class RoomDTO extends BaseField {
    private BigDecimal id;

    private BigDecimal propertyId;

    private BigDecimal buildingId;

    @StringByteSize(max = 32, message = "单元长度超限")
    private String unit;
    @StringByteSize(max = 32, message = "楼层长度超限")
    private String floor;
    @StringByteSize(max = 64, message = "房间长度超限")
    private String room;
    @StringByteSize(max = 64, message = "子房间长度超限")
    private String subRoom;
    @StringByteSize(max = 16, message = "房间类型长度超限")
    private String roomType;
    @StringByteSize(max = 256, message = "备注长度超限")
    private String roomDesc;

    @StringByteSize(max = 16, message = "产权类型长度超限")
    private String ownerType;
    @StringByteSize(max = 256, message = "产权人长度超限")
    private String ownerName;
    @StringByteSize(max = 16, message = "产权人联系方式长度超限")
    private String ownerContact;
    @StringByteSize(max = 16, message = "房间属性长度超限")
    private String roomProperty;
    @StringByteSize(max = 256, message = "房间用途长度超限")
    private String roomPurpose;

    private BigDecimal roomSize;
    @StringByteSize(max = 16, message = "房间朝向长度超限")
    private String roomAspect;
    @StringByteSize(max = 64, message = "房型长度超限")
    private String roomLayout;

    private BigDecimal roomBookPrice;
    @StringByteSize(max = 16, message = "房间状态长度超限")
    private String roomStatus;
    @StringByteSize(max = 256, message = "备注长度超限")
    private String remark;

    private BigDecimal roomRentPrice;


}



