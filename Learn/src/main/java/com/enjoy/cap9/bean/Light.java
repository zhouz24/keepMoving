package com.enjoy.cap9.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

/**
 * @Description
 * @Date 2019/11/26 15:16
 * @Authod ZG
 * @Version 1.0
 */
@Component
public class Light implements ApplicationContextAware,BeanNameAware {

    private ApplicationContext context;

    @Override
    public void setBeanName(String name) {
        System.out.println("当前的bean名称："+name);

    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("传入的IOC容器为："+applicationContext);
        this.context = applicationContext;
    }


}
