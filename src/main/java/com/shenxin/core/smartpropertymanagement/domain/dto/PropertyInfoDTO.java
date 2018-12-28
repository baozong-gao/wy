package com.shenxin.core.smartpropertymanagement.domain.dto;

import com.shenxin.core.smartpropertymanagement.domain.BaseField;
import com.shenxin.core.smartpropertymanagement.domain.em.validator.StringByteSize;
import lombok.Data;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import java.math.BigDecimal;

/**
 * Created by lijinzhu on 2018/6/25.
 */
@Data
public class PropertyInfoDTO extends BaseField{

    private BigDecimal id;
    @NotNull(message = "业态名称不能为空")
    @StringByteSize(max = 85, message = "业态名称长度超限")
    private String propertyName;
    @NotNull(message = "业态简称不能为空")
    @StringByteSize(max = 43, message = "业态简称长度超限")
    private String propertyShortName;
    @NotNull(message = "业态地址不能为空")
    @StringByteSize(max = 85, message = "业态地址长度超限")
    private String propertyAddress;
    @NotNull(message = "客服电话不能为空")
    @Pattern(regexp = "(\\d{11})|^((\\d{7,8})|(\\d{4}|\\d{3})-(\\d{7,8})|(\\d{4}|\\d{3})-(\\d{7,8})-(\\d{4}|\\d{3}|\\d{2}|\\d{1})|(\\d{7,8})-(\\d{4}|\\d{3}|\\d{2}|\\d{1}))$", message = "客服电话不合法")
    @StringByteSize(max = 16, message = "客服电话长度超限")
    private String servicePhone;
    @NotNull(message = "联系人不能为空")
    @StringByteSize(max = 85, message = "联系人长度超限")
    private String linkName;
    @NotNull(message = "联系人电话不能为空")
    @Pattern(regexp = "(\\d{11})|^((\\d{7,8})|(\\d{4}|\\d{3})-(\\d{7,8})|(\\d{4}|\\d{3})-(\\d{7,8})-(\\d{4}|\\d{3}|\\d{2}|\\d{1})|(\\d{7,8})-(\\d{4}|\\d{3}|\\d{2}|\\d{1}))$", message = "联系人电话不合法")
    @StringByteSize(max = 16, message = "联系人电话长度超限")
    private String linkMobile;
    @StringByteSize(max = 43, message = "邮箱长度超限")
    private String linkEmail;
    @StringByteSize(max = 172, message = "备注长度超限")
    private String remark;
    @NotNull(message = "业态类型不能为空")
    @StringByteSize(max = 16, message = "业态类型长度超限")
    private String propertyType;
    @NotNull(message = "产权所有人类型不能为空")
    @StringByteSize(max = 16, message = "产权所有人类型长度超限")
    private String ownerType;
    @NotNull(message = "产权所有人姓名不能为空")
    @StringByteSize(max = 85, message = "产权所有人姓名长度超限")
    private String ownerName;
}
