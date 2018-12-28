package com.shenxin.core.smartpropertymanagement.controller.impl;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * @Author: wangzhenyu
 * @Description: 研发部
 * @Date: 2018/7/30
 * @Version: V1.0
 */
@Slf4j
@Controller
@RequestMapping("service")
public class ServiceController {
    @RequestMapping("wecpay")
    public String page(HttpServletRequest request) {
        return "service/wecpay";
    }
}
