package com.shenxin.core.smartpropertymanagement.domain.bo;

import com.shenxin.core.smartpropertymanagement.domain.BaseForm;
import lombok.Data;

import java.math.BigDecimal;

/**
 * @author Lancelot cailuyuan
 * @create 2018-07-09 19:53
 * @description 用于查询
 */
@Data
public class BuildingInfoBO extends BaseForm<BuildingInfoBO> {
    public BigDecimal propertyId;

    public String buildingName;
}
