package com.shenxin.core.smartpropertymanagement.controller.impl;

import com.shenxin.core.smartpropertymanagement.controller.IBaseController;
import com.shenxin.core.smartpropertymanagement.domain.bo.ContractTemplateBO;
import com.shenxin.core.smartpropertymanagement.domain.dto.ContractTemplateDTO;
import com.shenxin.core.smartpropertymanagement.domain.vo.ContractTemplateVO;
import com.shenxin.core.smartpropertymanagement.persist.entity.ContractTemplateDAO;
import com.shenxin.core.smartpropertymanagement.service.impl.ContractTemplateServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.Validator;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author: wangzhenyu
 * @Description: 研发部
 * @Date: 2018/8/9
 * @Version: V1.0
 */
@Slf4j
@Controller
@RequestMapping("/contract/template")
public class ContractTemplateController extends IBaseController<ContractTemplateBO,ContractTemplateVO,ContractTemplateDAO,ContractTemplateDTO> {

    @Autowired
    public ContractTemplateController(ContractTemplateServiceImpl service, Validator validator) {
        super(service, validator, "contract_template", null);
    }
}
