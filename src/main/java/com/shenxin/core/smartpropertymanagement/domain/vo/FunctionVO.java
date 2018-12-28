package com.shenxin.core.smartpropertymanagement.domain.vo;

import com.shenxin.core.smartpropertymanagement.domain.em.FiledAlias;
import lombok.Data;

import java.math.BigDecimal;

/**
 * @Author: gaobaozong
 * @Description: 用于展示
 * @Date: Created in 2017/12/15 - 14:48
 * @Version: V1.0-SNAPSHOT
 */
@Data
public class FunctionVO {
    private BigDecimal id;

    @FiledAlias("funcName")
    private String name;

    private BigDecimal parentId;

    private String grade;
    @FiledAlias("funcUri")
    private String uri;
    @FiledAlias("authCode")
    private String code;
    @FiledAlias("funcStatus")
    private String status;

    private BigDecimal orderBy;

    private String logo;

    @FiledAlias("funcType")
    private String type;

    //是否与角色关联
    private boolean auth;

    //是否选中
    private boolean select;
}
