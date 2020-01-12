package com.enjoy.cap10.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.Arrays;

/**
 * @Description 日志切面类 @Aspect声明
 * @Date 2019/11/26 15:46
 * @Authod ZG
 * @Version 1.0
 */
@Component
@Aspect
public class LogAspects {

    // 公共的切点拦截方法,给所有的通知创建公共方法
    @Pointcut(value = " execution(public int com.enjoy.cap10.aop.Calcuator.* (..))")
    public void pointCut(){

    }

    @Before("pointCut()")
    public void logStart(JoinPoint point){
        System.out.println("方法："+point.getSignature().getName()+" ，aop前置通知 ，"
            +"参数："+Arrays.asList(point.getArgs()));

    }

    @After("pointCut()")
    public void logEnd(){
        System.out.println("aop后置通知");
    }

    @AfterReturning(value = "pointCut()",returning = "result")
    public void logReturn(Object result){
        System.out.println("aop返回值:"+result);
    }

    @AfterThrowing(value = "pointCut()",throwing = "exception")
    public void logException(Exception exception){
        System.out.println("aop异常:"+exception);
    }

   /* @Around("pointCut()")
    public Object logAround(ProceedingJoinPoint joinPoint) throws Throwable {
        // 在前置通知之前运行
        System.out.println("aop前置");
        // 执行目标方法
        Object o = joinPoint.proceed();

        System.out.println("aop后置");
        return o;
    }*/
}
