package com.shenxin.core.smartpropertymanagement.controller.impl;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * @Author: wangzhenyu
 * @Description: 研发部
 * @Date: 2018/8/15
 * @Version: V1.0
 */
@Slf4j
@Controller
@RequestMapping("/repair")
public class RepairController {
    @RequestMapping("page")
    public String page(HttpServletRequest request) {
        return "repair/listPage";
    }

    @GetMapping("updatepage/{id:.*}")
    public String doUpdateUserPage(@PathVariable String id, HttpSession session, HttpServletRequest request,
                                   HttpServletResponse response) throws Exception {
        return "repair/updatePage";
    }
}
