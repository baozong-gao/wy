package com.shenxin.core.smartpropertymanagement.domain.vo;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * Created by lijinzhu on 2018/3/14.
 */
@Data
public class PropertyInfoVO {

    private BigDecimal id;

    private BigDecimal companyId;

    private String companyName;

    private String propertyType;

    private String propertyName;

    private String propertyShortName;

    private String propertyEnName;

    private String propertyAddress;

    private String servicePhone;

    private String ownerType;

    private String ownerName;

    private String linkName;

    private String linkMobile;

    private String linkEmail;

    private String remark;

}
