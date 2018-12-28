package com.shenxin.core.smartpropertymanagement.domain.dto;

import com.shenxin.core.smartpropertymanagement.domain.BaseField;
import com.shenxin.core.smartpropertymanagement.domain.em.validator.StringByteSize;
import lombok.Data;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import java.math.BigDecimal;

/**
 * @Author: wangzhenyu
 * @Description: 用于插入，更新
 * @Date: 2018/7/3
 * @Version: V1.0
 */

@Data
public class DepartmentDTO extends BaseField {
    private BigDecimal id;

    @NotNull(message = "名称不能为空")
    @StringByteSize(max = 32, message = "名称长度超限")
    private String departmentName;

    @StringByteSize(max = 255, message = "描述长度超限")
    private String departmentDesc;

    @NotNull(message = "联系人姓名不能为空")
    @StringByteSize(max = 32, message = "联系人名称长度超限")
    private String linkName;

    @NotNull(message = "联系人手机号不能为空")
    @Pattern(regexp = "[0-9]{11}", message = "手机号不合法")
    private String linkMobile;

    private String status;
}
