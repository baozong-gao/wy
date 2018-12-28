package com.shenxin.core.smartpropertymanagement.domain.bo;

import com.shenxin.core.smartpropertymanagement.domain.BaseForm;
import lombok.Data;

import javax.validation.constraints.Pattern;

/**
 * @Author: gaobaozong
 * @Description: 用于查询
 * @Date: Created in 2017/12/15 - 11:07
 * @Version: V1.0-SNAPSHOT
 */
@Data
public class FunctionBO extends BaseForm<FunctionBO> {

    @Pattern(regexp = "[0-9]*", message = "权限id输入数字")
    public String id;

    public String name;

    @Pattern(regexp = "[0-9]*", message = "权限父级id输入数字")
    public String parentId;


    public String grade;


    public String code;


    public String status;


    public String type;
}
