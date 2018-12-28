package com.shenxin.core.smartpropertymanagement.domain.dto;

import com.shenxin.core.smartpropertymanagement.domain.BaseField;
import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

/**
 * @Author: wangzhenyu
 * @Description: 研发部
 * @Date: 2018/7/30
 * @Version: V1.0
 */
@Data
public class BatchRoomDTO extends BaseField {
    private BigDecimal id;

    private BigDecimal propertyId;

    private BigDecimal buildingId;
    private String roomType;
    private List<RoomDTO> rooms;
}
