package com.shenxin.core.smartpropertymanagement.controller.impl;

import com.shenxin.core.smartpropertymanagement.controller.IBaseController;
import com.shenxin.core.smartpropertymanagement.domain.bo.DepartmentBO;
import com.shenxin.core.smartpropertymanagement.domain.dto.DepartmentDTO;
import com.shenxin.core.smartpropertymanagement.domain.vo.DepartmentVO;
import com.shenxin.core.smartpropertymanagement.persist.entity.CompanyDepartmentDAO;
import com.shenxin.core.smartpropertymanagement.service.impl.DepartmentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.Validator;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author: wangzhenyu
 * @Description: 研发部
 * @Date: 2018/7/3
 * @Version: V1.0
 */
@Controller("departmentController")
@RequestMapping("/department")
public class DepartmentController extends IBaseController<DepartmentBO,DepartmentVO,CompanyDepartmentDAO,DepartmentDTO> {

    @Autowired
    public DepartmentController(DepartmentServiceImpl departmentService, Validator validator) {
        super(departmentService, validator, "department", null);
    }
}

