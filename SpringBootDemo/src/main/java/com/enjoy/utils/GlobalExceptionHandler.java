package com.enjoy.utils;

import org.omg.SendingContext.RunTime;
import org.springframework.boot.web.server.ConfigurableWebServerFactory;
import org.springframework.boot.web.server.ErrorPage;
import org.springframework.boot.web.server.WebServerFactoryCustomizer;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * @Description 全局异常捕获处理器
 * @Date 2020/1/3 11:03
 * @Authod ZG
 * @Version 1.0
 */
// @ControllerAdvice :全局捕获requsetMapping请求
@ControllerAdvice
public class GlobalExceptionHandler {

    //@ExceptionHandler 捕获的异常类型
    @ExceptionHandler(value=RuntimeException.class)
    @ResponseBody
    public Object defalutReeorHandler(HttpServletRequest req,Exception e)throws Exception{
        e.printStackTrace();
        return "异常处理请求";
    }

    // 监控404请求并处理
    @Bean
    public WebServerFactoryCustomizer<ConfigurableWebServerFactory> webServerFactoryCustomizer(){
        return (factory->{
            ErrorPage error404Page = new ErrorPage(HttpStatus.NOT_FOUND, "/404.do");
            factory.addErrorPages( error404Page);
        });
    }
}
