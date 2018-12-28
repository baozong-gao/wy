package com.shenxin.core.smartpropertymanagement.domain.vo;

import com.shenxin.core.smartpropertymanagement.domain.em.FiledAlias;
import lombok.Data;

import java.math.BigDecimal;

/**
 * @Author: gaobaozong
 * @Description: 用于展示
 * @Date: Created in 2017/12/21 - 14:03
 * @Version: V1.0-SNAPSHOT
 */
@Data
public class UserVO {
    private BigDecimal id;

    private BigDecimal instId;

    private String userType;

    @FiledAlias("userName")
    private String name;

    @FiledAlias("passwd")
    private String pwd;

    private String remark;

    private String userStatus;

    private String email;

    private String loginId;
    private String mobile;

}
