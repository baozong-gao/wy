package com.shenxin.core.smartpropertymanagement.domain.dto;

import com.shenxin.core.smartpropertymanagement.domain.BaseField;
import com.shenxin.core.smartpropertymanagement.domain.em.validator.StringByteSize;
import lombok.Data;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import java.math.BigDecimal;

/**
 * @author Lancelot cailuyuan
 * @create 2018-07-09 19:52
 * @description 用于数据传输
 */
@Data
public class BuildingInfoDTO extends BaseField{
    public BigDecimal id;
    public BigDecimal propertyId;
    @NotNull(message = "楼宇名称不能为空")
    @StringByteSize(max = 42, message = "楼宇名称长度超限")
    public String buildingName;
    @NotNull(message = "楼宇区域不能为空")
    @StringByteSize(max = 42, message = "楼宇区域长度超限")
    public String buildingArea;
    @NotNull(message = "楼宇描述不能为空")
    @StringByteSize(max = 85, message = "楼宇描述长度超限")
    public String buildingDesc;
    @NotNull(message = "楼宇用途不能为空")
    @StringByteSize(max = 42, message = "楼宇用途长度超限")
    public String buildingPurpose;
    @NotNull(message = "产权所有人类型不能为空")
    public String ownerType;
    @NotNull(message = "产权所有人名称不能为空")
    @StringByteSize(max = 85, message = "产权所有人名称长度超限")
    public String ownerName;
    @NotNull(message = "产权所有人联系方式不能为空")
    @Pattern(regexp = "(\\d{11})|^((\\d{7,8})|(\\d{4}|\\d{3})-(\\d{7,8})|(\\d{4}|\\d{3})-(\\d{7,8})-(\\d{4}|\\d{3}|\\d{2}|\\d{1})|(\\d{7,8})-(\\d{4}|\\d{3}|\\d{2}|\\d{1}))$", message = "产权所有人联系方式不合法")
    public String ownerContact;
    @StringByteSize(max = 85, message = "备注长度超限")
    public String remark;
}
