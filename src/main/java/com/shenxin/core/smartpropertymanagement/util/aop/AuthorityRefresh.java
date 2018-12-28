package com.shenxin.core.smartpropertymanagement.util.aop;

import com.shenxin.core.smartpropertymanagement.domain.SystemConstant;
import com.shenxin.core.smartpropertymanagement.domain.bo.MenuBO;
import com.shenxin.core.smartpropertymanagement.security.AnyUser;
import com.shenxin.core.smartpropertymanagement.security.AnyUserDetailsService;
import com.shenxin.core.smartpropertymanagement.security.InvocationSecurityMetadataSourceService;
import com.shenxin.core.smartpropertymanagement.service.MenuService;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import java.math.BigDecimal;
import java.util.List;

/**
 * @Author: gaobaozong
 * @Description: 权限角色用户 spring security 刷新
 * @Date: Created in 2018/6/28 - 13:57
 * @Version: V1.0
 */
@Slf4j
@Aspect
@Component
public class AuthorityRefresh {

    @Autowired
    InvocationSecurityMetadataSourceService sourceService;

    @Autowired
    MenuService menuService;

    @Autowired
    AnyUserDetailsService anyUserDetailsService;

    @AfterReturning("bean(functionController) || bean(roleController) ||  bean(userController) ")
    public void refresh(){
        try {
            sourceService.reloadResource();
            anyUserDetailsService.refreshAuth();

            AnyUser user = (AnyUser) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
            List<MenuBO> menuBOList = menuService.getAllEnabledMenuByUserId(new BigDecimal(user.getId()));

            RequestAttributes ra = RequestContextHolder.getRequestAttributes();
            ServletRequestAttributes sra = (ServletRequestAttributes) ra;
            HttpServletRequest request = sra.getRequest();

            request.getSession().setAttribute(SystemConstant.SESSION_USER_KEY, user);
            request.getSession().setAttribute("menu", menuBOList);
        }catch (Exception e){
            log.warn("权限刷新失败", e);
        }
    }
}
