package com.shenxin.core.smartpropertymanagement.domain.bo;

import com.shenxin.core.smartpropertymanagement.domain.BaseForm;
import lombok.Data;

import java.math.BigDecimal;

/**
 * Created by lijinzhu on 2018/6/22.
 */
@Data
public class PropertyInfoBO extends BaseForm<PropertyInfoBO> {
    private String propertyName;
    private String linkName;
    private String propertyType;
}
