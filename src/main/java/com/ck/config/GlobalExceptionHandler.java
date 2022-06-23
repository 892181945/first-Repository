package com.ck.config;

import com.ck.response.CommodResponse;
import jdk.nashorn.internal.runtime.logging.Logger;
import lombok.extern.slf4j.Slf4j;
import org.apache.tomcat.util.http.ResponseUtil;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.servlet.http.HttpServletRequest;
@Slf4j
@RestControllerAdvice
public class GlobalExceptionHandler {

    /**
     * 处理空指针的异常
     * @param e
     * @return
     */
    @ExceptionHandler(value =NullPointerException.class)
    public CommodResponse exceptionHandlerNullPointer(HttpServletRequest req, NullPointerException e){
        log.error("发生空指针异常！原因是:",e);
        return CommodResponse.failed("发生空指针异常，请联系管理员");
    }

    @ExceptionHandler(value =Exception.class)
    public CommodResponse exceptionHandlerException(HttpServletRequest req, Exception e){
        log.error("未知异常:",e);
        return CommodResponse.failed("系统错误，请联系管理员");
    }
}
