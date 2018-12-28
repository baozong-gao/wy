package com.shenxin.core.smartpropertymanagement.util.exception;

import java.util.UUID;

/**
 * @Author: gaobaozong
 * @Description: 异常id，方便查询
 * @Date: Created in 2018/6/19 - 16:14
 * @Version: V1.0
 */
public class ExceptionID {

    public  static  String getID(){
       return  UUID.randomUUID().toString();
    }
}
