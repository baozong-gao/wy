package com.shenxin.core.smartpropertymanagement.domain.bo;

import com.shenxin.core.smartpropertymanagement.domain.BaseForm;
import lombok.Data;

/**
 * @Author: wangzhenyu
 * @Description: 研发部
 * @Date: 2018/8/9
 * @Version: V1.0
 */

@Data
public class ContractTemplateBO extends BaseForm<ContractTemplateBO> {

    private String contractType;

    private String contractTemplateName;

}
