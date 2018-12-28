package com.shenxin.core.smartpropertymanagement.domain.bo;

import com.shenxin.core.smartpropertymanagement.domain.BaseForm;
import lombok.Data;

/**
 * @author Lancelot cailuyuan
 * @create 2018-06-26 10:38
 * @description
 */
@Data
public class CompanyInfoBO extends BaseForm<CompanyInfoBO>{
    private String companyName;

    private String address;

    private String linkName;

    private String status;

    private String companyStatus;
}
