package com.shenxin.core.smartpropertymanagement.domain.vo;

import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

/**
 * @author Lancelot cailuyuan
 * @create 2018-07-09 19:52
 * @description 用于展示
 */
@Data
public class BuildingInfoVO {
    public BigDecimal id;

    public BigDecimal propertyId;

    public String buildingName;

    public String buildingArea;

    public String buildingDesc;

    public String buildingPurpose;

    public String ownerType;

    public String ownerName;

    public String ownerContact;

    public String remark;

    public String unit;

    public String propertyName;

    public List<Floor> floors;

    public int size;

    public  static class Floor{
        public String floor;
        public int size;
        public List<RoomVO> rooms;
    }
}
