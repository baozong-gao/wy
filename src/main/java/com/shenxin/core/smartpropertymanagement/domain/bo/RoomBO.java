package com.shenxin.core.smartpropertymanagement.domain.bo;

import com.shenxin.core.smartpropertymanagement.domain.BaseForm;
import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

/**
 * @Author: gaobaozong
 * @Description: 房间查询
 * @Date: Created in 2018/7/9 - 10:48
 * @Version: V1.0
 */
@Data
public class RoomBO extends BaseForm<RoomBO>{

    private BigDecimal id;

    private BigDecimal propertyId;

    private BigDecimal buildingId;

    private String room;

    private String unit;

    private String floor;

    private String roomStatus;

    private List<BigDecimal> propertyIds;
}
