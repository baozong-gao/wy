package com.shenxin.core.smartpropertymanagement.util.exception;

import com.shenxin.core.smartpropertymanagement.util.BeanUtils;
import com.shenxin.core.smartpropertymanagement.util.ResultVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.transaction.interceptor.TransactionAspectSupport;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.util.Optional;

/**
 * @Author: gaobaozong
 * @Description: 统一异常处理
 * @Date: Created in 2018/6/6 - 14:16
 * @Version: V1.0
 */
@Slf4j
@ControllerAdvice
public class ExceptionHandle {

    @RequestMapping
    @ExceptionHandler(Exception.class)
    public ModelAndView handleException(Exception ex, HttpServletRequest request, HttpServletResponse response) {
        log.error("出错了", ex);
        String error;
        if (ex instanceof DuplicateKeyException) {
            error = ResultVo.error("数据已存在");
        } else if (ex instanceof PersistentException) {
            error = ResultVo.error("数据保存异常: "+ex.getMessage());
        } else if (ex instanceof ValidatorException) {
            error = ResultVo.error("数据校验异常: "+ex.getMessage());
        } else {
            error = ResultVo.error("未知异常");
        }

        TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();

        //跟据不同类型,返回不同格式的数据
        String type = request.getHeader("accept");
        if(Optional.ofNullable(type).filter(_t -> _t.contains("text/html")).map(_t -> true).orElse(false)){
            ModelAndView view = new ModelAndView();
            view.setViewName("error/error");
            ResultVo result = BeanUtils.json2Object(error,ResultVo.class);
            view.addObject("errorMsg",result.getMsg());
            return view;
        }
        retJson(response, error);
        return null;
    }

    private String getExceptionStackTraceMessage(Exception ex) {
        final Writer result = new StringWriter();
        final PrintWriter printWriter = new PrintWriter(result);
        ex.printStackTrace(printWriter);
        return result.toString();
    }

    public static void retJson(HttpServletResponse response, String jo){
        response.setContentType("application/json" + ";charset=UTF-8");
        response.setHeader("Pragma", "No-cache");
        response.setHeader("Cache-Control", "no-cache");
        response.setDateHeader("Expires", 0);
        response.setHeader("Access-Control-Allow-Origin", "*");
        try {
            response.getWriter().write(jo);
            response.getWriter().flush();
            response.getWriter().close();
        } catch (IOException e) {
            log.error("返回json异常", e);
        }
    }

}
