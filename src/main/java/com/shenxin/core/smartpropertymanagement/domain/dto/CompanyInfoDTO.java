package com.shenxin.core.smartpropertymanagement.domain.dto;

import com.shenxin.core.smartpropertymanagement.domain.BaseField;
import com.shenxin.core.smartpropertymanagement.domain.em.validator.StringByteSize;
import lombok.Data;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import java.math.BigDecimal;

/**
 * @author Lancelot cailuyuan
 * @create 2018-06-25 19:37
 * @description
 */
@Data
public class CompanyInfoDTO extends BaseField {

    private BigDecimal id;
    @NotNull(message = "公司名称不能为空")
    @StringByteSize(max = 85, message = "公司名称长度超限")
    private String companyName;
    @NotNull(message = "客服电话不能为空")
    private String servicePhone;
    @NotNull(message = "公司地址不能为空")
    @StringByteSize(max = 85, message = "公司地址长度超限")
    private String address;
    @NotNull(message = "法人姓名不能为空")
    @StringByteSize(max = 85, message = "法人姓名长度超限")
    private String legalName;
    @NotNull(message = "法人手机号不能为空")
    @Pattern(regexp = "[0-9]{11}", message = "法人手机号不合法")
    private String legalPhone;
    @NotNull(message = "法人身份证号不能为空")
    @Pattern(regexp = "^(^[1-9]\\d{7}((0\\d)|(1[0-2]))(([0|1|2]\\d)|3[0-1])\\d{3}$)|(^[1-9]\\d{5}[1-9]\\d{3}((0\\d)|(1[0-2]))(([0|1|2]\\d)|3[0-1])((\\d{4})|\\d{3}[Xx])$)$", message = "法人身份证号不合法")
    private String legalIdNo;
    @NotNull(message = "法人邮箱不能为空")
    @Pattern(regexp = "^[a-zA-Z0-9_.-]+@[a-zA-Z0-9-]+(\\.[a-zA-Z0-9-]+)*\\.[a-zA-Z0-9]{2,6}$", message = "法人邮箱不合法")
    private String legalEmail;
    @NotNull(message = "联系人姓名不能为空")
    @StringByteSize(max = 42, message = "联系人姓名长度超限")
    private String linkName;
    @NotNull(message = "联系人手机号不能为空")
    @Pattern(regexp = "[0-9]{11}", message = "联系人手机号不合法")
    private String linkPhone;
    @NotNull(message = "联系人身份证号不能为空")
    @Pattern(regexp = "^(^[1-9]\\d{7}((0\\d)|(1[0-2]))(([0|1|2]\\d)|3[0-1])\\d{3}$)|(^[1-9]\\d{5}[1-9]\\d{3}((0\\d)|(1[0-2]))(([0|1|2]\\d)|3[0-1])((\\d{4})|\\d{3}[Xx])$)$", message = "联系人身份证号不合法")
    private String linkIdNo;
    @NotNull(message = "联系人邮箱不能为空")
    @Pattern(regexp = "^[a-zA-Z0-9_.-]+@[a-zA-Z0-9-]+(\\.[a-zA-Z0-9-]+)*\\.[a-zA-Z0-9]{2,6}$", message = "联系人邮箱不合法")
    private String linkEmail;

    private String grade;
    private String imgFileXuke;
    private String imgFileFront;
    private String imgFileBack;

/*    private String fileXuke;

    private String fileFront;

    private String fileBack;*/
}
