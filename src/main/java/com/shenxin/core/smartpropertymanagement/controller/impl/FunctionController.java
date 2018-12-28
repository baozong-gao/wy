package com.shenxin.core.smartpropertymanagement.controller.impl;

import com.shenxin.core.smartpropertymanagement.controller.HeightenBaseControllerSupport;
import com.shenxin.core.smartpropertymanagement.controller.IBaseController;
import com.shenxin.core.smartpropertymanagement.domain.bo.FunctionBO;
import com.shenxin.core.smartpropertymanagement.domain.dto.FunctionDTO;
import com.shenxin.core.smartpropertymanagement.domain.vo.FunctionVO;
import com.shenxin.core.smartpropertymanagement.persist.entity.SysFunctionDAO;
import com.shenxin.core.smartpropertymanagement.service.biz.FunctionBiz;
import com.shenxin.core.smartpropertymanagement.service.impl.FunctionServiceImpl;
import com.shenxin.core.smartpropertymanagement.util.BeanUtils;
import com.shenxin.core.smartpropertymanagement.util.ReturnUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.Validator;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * @Author: gaobaozong
 * @Description: 权限
 * @Date: Created in 2018/6/19 - 16:34
 * @Version: V1.0
 */
@Controller("functionController")
@RequestMapping("fun")
public class FunctionController extends IBaseController<FunctionBO,FunctionVO,SysFunctionDAO,FunctionDTO>{

    FunctionBiz functionBiz;

    @Autowired
    public FunctionController(FunctionServiceImpl service, Validator validator, FunctionBiz functionBiz){
        super(service, validator, "fun", new HeightenBaseControllerSupport() {


            @Override
            public void updatePageAfter(HttpServletRequest request, HttpServletResponse response, Object obj) {
                SysFunctionDAO dao = (SysFunctionDAO)obj;

                List<SysFunctionDAO> parentFuncs = functionBiz.searchParentFunction(dao.getGrade());
                List<FunctionVO> parentVos = BeanUtils.copyList(parentFuncs, FunctionVO.class);
                parentVos = Optional.ofNullable(parentVos)
                        .map(_parent -> _parent.stream().map(_p -> {
                            // 遍历,设置选中的父级
                            _p.setSelect(_p.getId().equals(dao.getParentId()));
                            return _p;
                        }).collect(Collectors.toList()))
                        .orElseGet(null);
                // 设置父级类表
                request.setAttribute("selectParents", parentVos);
            }
        });
        this.functionBiz = functionBiz;
    }

    @RequestMapping("searchparent/{grade:.*}")
    public String getParent(@PathVariable("grade") String grade,
                            HttpServletRequest request,
                            HttpServletResponse response) throws Exception {
        List<SysFunctionDAO> parentFuncs = functionBiz.searchParentFunction(grade);
        List<FunctionVO> parentVos = BeanUtils.copyList(parentFuncs, FunctionVO.class);
        ReturnUtil.retJson(response, BeanUtils.object2Json(parentVos));
        return null;
    }

}
