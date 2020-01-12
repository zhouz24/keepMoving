package com.enjoy.cap7.bean;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

/**
 * @Description
 * @Date 2019/11/25 15:36
 * @Authod ZG
 * @Version 1.0
 */
@Component
public class Plane implements ApplicationContextAware {
    ApplicationContext context ;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        // 获取IOC容器
        this.context = applicationContext;
    }

    public void test(){
        System.out.println(context.getApplicationName());
    }
}
