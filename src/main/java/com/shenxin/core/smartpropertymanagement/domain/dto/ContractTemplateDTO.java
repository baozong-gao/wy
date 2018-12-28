package com.shenxin.core.smartpropertymanagement.domain.dto;

import com.shenxin.core.smartpropertymanagement.domain.BaseField;
import com.shenxin.core.smartpropertymanagement.domain.em.validator.StringByteSize;
import lombok.Data;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import java.math.BigDecimal;

/**
 * @Author: wangzhenyu
 * @Description: 研发部
 * @Date: 2018/8/9
 * @Version: V1.0
 */

@Data
public class ContractTemplateDTO extends BaseField {
    private BigDecimal id;

    @Pattern(regexp = "^(BUSINESS|RESIDENCE|HOTEL)$", message = "业态类型不正确")
    private String contractType;

    @NotNull(message = "名称不能为空")
    @StringByteSize(max = 32, message = "名称长度超限")
    private String contractTemplateName;

    @NotNull(message = "模板地址不能为空")
    @StringByteSize(max = 80, message = "模板地址长度超限")
    private String templateDocLocation;

    private String remark;
}
