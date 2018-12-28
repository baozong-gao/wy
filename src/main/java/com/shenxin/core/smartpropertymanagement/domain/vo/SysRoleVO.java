package com.shenxin.core.smartpropertymanagement.domain.vo;

import com.shenxin.core.smartpropertymanagement.domain.em.FiledAlias;
import lombok.Data;

import java.math.BigDecimal;

/**
 * @Author: gaobaozong
 * @Description: 用于展示
 * @Date: Created in 2017/12/19 - 10:46
 * @Version: V1.0-SNAPSHOT
 */
@Data
public class SysRoleVO {

    private BigDecimal id;

    private String name;

    @FiledAlias("roleStatus")
    private String status;

    private String remark;

    //是否与用户关联
    private boolean isAuth;
}
