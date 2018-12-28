package com.shenxin.core.smartpropertymanagement.domain.bo;

import com.shenxin.core.smartpropertymanagement.domain.BaseForm;
import lombok.Data;

/**
 * @author Lancelot cailuyuan
 * @create 2018-07-13 10:19
 * @description
 */
@Data
public class ClientInfoBO extends BaseForm<ClientInfoBO> {
    private String inName;

    private String cmLinkName;

    private String clientType;
}
