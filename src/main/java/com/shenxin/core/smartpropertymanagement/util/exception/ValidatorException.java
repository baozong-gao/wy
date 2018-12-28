package com.shenxin.core.smartpropertymanagement.util.exception;

/**
 * @Author: gaobaozong
 * @Description: 参数校验异常
 * @Date: Created in 2017/12/15 - 13:48
 * @Version: V1.0-SNAPSHOT
 */
public class ValidatorException extends RuntimeException{

    public ValidatorException(String message){
        super(message);
    }
}
