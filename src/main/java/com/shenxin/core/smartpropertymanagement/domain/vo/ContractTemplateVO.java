package com.shenxin.core.smartpropertymanagement.domain.vo;

import lombok.Data;

import java.math.BigDecimal;

/**
 * @Author: wangzhenyu
 * @Description: 研发部
 * @Date: 2018/8/9
 * @Version: V1.0
 */
@Data
public class ContractTemplateVO {
    private BigDecimal id;

    private String contractType;

    private String contractTemplateName;

    private String templateDocLocation;

    private String remark;
}
