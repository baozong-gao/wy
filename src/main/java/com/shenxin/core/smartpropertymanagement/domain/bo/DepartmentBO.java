package com.shenxin.core.smartpropertymanagement.domain.bo;

import com.shenxin.core.smartpropertymanagement.domain.BaseForm;
import lombok.Data;

import java.math.BigDecimal;

/**
 * @Author: wangzhenyu
 * @Description: 研发部
 * @Date: 2018/7/3
 * @Version: V1.0
 */
@Data
public class DepartmentBO extends BaseForm<DepartmentBO> {

    private String departmentName;

    private String linkMobile;

}
