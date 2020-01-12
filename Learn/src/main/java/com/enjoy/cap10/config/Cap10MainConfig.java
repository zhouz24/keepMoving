package com.enjoy.cap10.config;

import com.enjoy.cap10.aop.Calcuator;
import com.enjoy.cap10.aop.LogAspects;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Controller;

/**
 * @Description 配置类
 * @Date 2019/11/26 15:34
 * @Authod ZG
 * @Version 1.0
 */

/**
 *  切面类的使用范围：
 *      1、日志切面类的方法需要动态感知到div()方法运行；
 *      2、通知方法：
 *          前置通知：logStart()：在我们执行div（）方法之前运行 @Before
 *          后置通知：logEnd（）：在我们执行div()方法之后运行 @After
 *          返回通知：logReturn（）：执行目标方法div（）之后返回正常值运行 @AfterReturning
 *          异常通知：logException（）：执行方法发生异常后调用 @AfterThrowing
 *          环绕通知：动态代理，需要手动执行joinPoint.procced（）方法（即目标方法）， @Around
 */
@ComponentScan("com.enjoy.cap10.aop")
@Configuration
@EnableAspectJAutoProxy
public class Cap10MainConfig {
/*
    @Bean
    public Calcuator calcuator(){
        return new Calcuator();
    }

    @Bean
    public LogAspects logAspects(){
        return new LogAspects();
    }*/
}
