package com.shenxin.core.smartpropertymanagement.domain.vo;

import com.shenxin.core.smartpropertymanagement.domain.em.FiledAlias;
import lombok.Data;

import java.math.BigDecimal;

/**
 * @Author: wangzhenyu
 * @Description: 研发部
 * @Date: 2018/7/3
 * @Version: V1.0
 */

@Data
public class DepartmentVO {
    private BigDecimal id;

    private String departmentName;

    private String departmentDesc;

    private String linkName;

    private String linkMobile;

    @FiledAlias("departmentStatus")
    private String status;
}
