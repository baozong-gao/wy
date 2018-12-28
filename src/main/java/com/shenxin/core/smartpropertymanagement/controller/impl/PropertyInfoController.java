package com.shenxin.core.smartpropertymanagement.controller.impl;

import com.shenxin.core.smartpropertymanagement.controller.HeightenBaseControllerSupport;
import com.shenxin.core.smartpropertymanagement.controller.IBaseController;
import com.shenxin.core.smartpropertymanagement.domain.SystemConstant;
import com.shenxin.core.smartpropertymanagement.domain.bo.PropertyInfoBO;
import com.shenxin.core.smartpropertymanagement.domain.dto.PropertyInfoDTO;
import com.shenxin.core.smartpropertymanagement.domain.vo.PropertyInfoVO;
import com.shenxin.core.smartpropertymanagement.persist.entity.CompanyInfo;
import com.shenxin.core.smartpropertymanagement.persist.entity.PropertyInfo;
import com.shenxin.core.smartpropertymanagement.security.AnyUser;
import com.shenxin.core.smartpropertymanagement.service.biz.PropertyInfoBiz;
import com.shenxin.core.smartpropertymanagement.service.impl.PropertyInfoServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.Validator;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * Created by lijinzhu on 2018/6/14.
 * 业态管理
 */
@Slf4j
@Controller
@RequestMapping("/property")
public class PropertyInfoController extends IBaseController<PropertyInfoBO, PropertyInfoVO, PropertyInfo, PropertyInfoDTO> {

    @Autowired
    public PropertyInfoController(PropertyInfoServiceImpl service, Validator validator, PropertyInfoBiz propertyInfoBiz) {
        super(service, validator, "property", new HeightenBaseControllerSupport() {
            @Override
            public void searchAfter(HttpServletRequest request, HttpServletResponse response, List result) {
                List<PropertyInfoVO> infoList = result;
                AnyUser user = (AnyUser) request.getSession().getAttribute(SystemConstant.SESSION_USER_KEY);
                CompanyInfo companyInfo = propertyInfoBiz.getCompanyInfo(user.getUser().getCompanyId() + "");
                log.info(companyInfo.getCompanyEnName() + "======================");
                // volist里面遍历设置companyName
                Optional.ofNullable(infoList)
                        .map(_info -> _info.stream().map(_vo -> {
                            _vo.setCompanyName(companyInfo.getCompanyName());
                            return _vo;
                        }).collect(Collectors.toList()))
                        .orElseGet(null);
            }

            @Override
            public void insertPageAfter(HttpServletRequest request, HttpServletResponse response) {
                AnyUser user = (AnyUser) request.getSession().getAttribute(SystemConstant.SESSION_USER_KEY);
                CompanyInfo companyInfo = propertyInfoBiz.getCompanyInfo(user.getUser().getCompanyId() + "");
                // 获取当前公司设置companyName
                request.setAttribute("companyName",companyInfo.getCompanyName());
            }

            @Override
            public void updatePageAfter(HttpServletRequest request, HttpServletResponse response, Object dao) {
                AnyUser user = (AnyUser) request.getSession().getAttribute(SystemConstant.SESSION_USER_KEY);
                CompanyInfo companyInfo = propertyInfoBiz.getCompanyInfo(user.getUser().getCompanyId() + "");
                // 获取当前公司设置companyName
                request.setAttribute("companyName",companyInfo.getCompanyName());
            }

            /*            @Override
            public void insertBefore(HttpServletRequest request, HttpServletResponse response, Object dao) {
                AnyUser user = (AnyUser) request.getSession().getAttribute(SystemConstant.SESSION_USER_KEY);
                PropertyInfo propertyInfo = (PropertyInfo)dao;
                propertyInfo.setCompanyId(user.getUser().getCompanyId());
            }*/
        });
    }

}
