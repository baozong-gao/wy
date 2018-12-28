package com.shenxin.core.smartpropertymanagement.util;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

/**
 * @Author: gaobaozong
 * @Description: 返回封装
 * @Date: Created in 2017/9/25 - 10:56
 * @Version: V1.0
 */
public class ResultVo {
    public transient static final String ERROR_CODE = "400";
    public transient static final String SUCCEED_CODE = "200";

    static Gson gson = null;
    static{
        GsonBuilder gb = new GsonBuilder();
        gb.serializeNulls();
        gson = gb.create();
    }

    private String code;
    private String msg;
    private Object data;
    private int total;

    public String getMsg(){
        return msg;
    }

    public static String errorAuth(){
        ResultVo result = new ResultVo();
        result.code = "401";
        result.msg = "未授权";
        return gson.toJson(result);
    }

    public static String errorNotLogin(){
        ResultVo result = new ResultVo();
        result.code = "402";
        result.msg = "请登入";
        return gson.toJson(result);
    }

    public static String error(){
        ResultVo result = new ResultVo();
        result.code = ERROR_CODE;
        result.msg = "请求异常";
        return gson.toJson(result);
    }

    public static String error(String msg){
        ResultVo result = new ResultVo();
        result.code = ERROR_CODE;
        result.msg = msg;
        return gson.toJson(result);
    }

    public static String succeed(){
        ResultVo result = new ResultVo();
        result.code = SUCCEED_CODE;
        result.msg = "请求成功";
        return gson.toJson(result);
    }

    public static String succeed(Object data){
        ResultVo result = new ResultVo();
        result.code = SUCCEED_CODE;
        result.msg = "请求成功";
        result.data = data;
        return gson.toJson(result);
    }

    public static String succeedPage(Object data,int rows){
        ResultVo result = new ResultVo();
        result.code = SUCCEED_CODE;
        result.msg = "请求成功";
        result.data = data;
        result.total = rows;
        return gson.toJson(result);
    }

    public static String succeed(String msg,Object data){
        ResultVo result = new ResultVo();
        result.code = SUCCEED_CODE;
        result.msg = msg;
        result.data = gson.toJson(data);
        return gson.toJson(result);
    }

}
