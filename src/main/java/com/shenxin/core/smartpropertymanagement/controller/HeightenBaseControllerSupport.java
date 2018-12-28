package com.shenxin.core.smartpropertymanagement.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.math.BigDecimal;
import java.util.List;

/**
 * @Author: gaobaozong
 * @Description: 增强基础方法
 * @Date: Created in 2018/6/21 - 9:21
 * @Version: V1.0
 */
public interface HeightenBaseControllerSupport {


     default void searchPageBefore(HttpServletRequest request, HttpServletResponse response, Object bo){}
//     default void searchPageAfter(HttpServletRequest request, HttpServletResponse response){}
     default void searchBefore(HttpServletRequest request, HttpServletResponse response, Object bo){}
     default void searchAfter(HttpServletRequest request, HttpServletResponse response, List result){}

     default void updatePageAfter(HttpServletRequest request, HttpServletResponse response, Object dao){}
     default void updateBefore(HttpServletRequest request, HttpServletResponse response, Object dao){}
     default void updateAfter(HttpServletRequest request, HttpServletResponse response, Object ... param) throws Exception {}

     default void insertPageAfter(HttpServletRequest request, HttpServletResponse response){}
     default void insertBefore(HttpServletRequest request, HttpServletResponse response, Object dao){}
     default void insertAfter(HttpServletRequest request, HttpServletResponse response, Object ... param){}
     default void deleteAfter(HttpServletRequest request, HttpServletResponse response, BigDecimal id){}
     default void searchDetailAfter(HttpServletRequest request,HttpServletResponse response,Object dao){};
     default void searchDetailBefore(HttpServletRequest request,HttpServletResponse response,Object dao){};

}
