package com.shenxin.core.smartpropertymanagement.controller;

import com.shenxin.core.smartpropertymanagement.domain.SystemConstant;
import com.shenxin.core.smartpropertymanagement.domain.bo.MenuBO;
import com.shenxin.core.smartpropertymanagement.security.AnyUser;
import com.shenxin.core.smartpropertymanagement.service.MenuService;
import com.shenxin.core.smartpropertymanagement.service.impl.FunctionServiceImpl;
import com.shenxin.core.smartpropertymanagement.service.impl.UserServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServletRequest;
import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

/**
 * @Author: gaobaozong
 * @Description: 用户登入
 * @Date: Created in 2018/6/5 - 11:35
 * @Version: V1.0
 */
@Slf4j
@Controller
public class LoginController {

    @Autowired
    MenuService menuService;

    @Autowired
    FunctionServiceImpl functionService;

    @Autowired
    UserServiceImpl userService;

    @GetMapping(value = "login")
    public String hello(Map<String, Object> map) {
        return "login";
    }

    @GetMapping(value = "index")
    public String login(HttpServletRequest request) {
        AnyUser user = (AnyUser) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        List<MenuBO> menuBOList = menuService.getAllEnabledMenuByUserId(new BigDecimal(user.getId()));

        request.getSession().setAttribute(SystemConstant.SESSION_USER_KEY, user);
        request.getSession().setAttribute("menu", menuBOList);
        return "index";
    }


    @GetMapping(value = "browersError")
    public String browersError(HttpServletRequest request) {
        return "error/client_error";
    }
}
