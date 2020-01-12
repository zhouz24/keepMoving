package com.enjoy.cap7.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

/**
 * @Description BeanPostProcessor是bena的后置处理器，对bean的初始化的一个增强，非常核心的一个接口，AOP使用原理
 *  执行顺序：
 *      1、IOC容器会先调用构造方法，
 *      2、调用postProcessBeforeInitialization，bean的后置处理器
 *      3、调用init（）方法；（单例模式）
 *      4、调用postProcessAfterInitialization，bean的后置处理器
 *
 * @Date 2019/11/24 10:39
 * @Authod ZG
 * @Version 1.0
 */
@Component
public class MyBeanPostProcessor implements BeanPostProcessor {

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        // 返回一个对象（传过来的对象）
        // 在init方法调用之前，进行后置处理工作
        // 在initMethod方法调用之前被执行
        System.out.println("postProcessBeforeInitialization执行了,"+beanName+"....."+bean);
        return null;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        // 返回一个对象（传过来的对象）
        // 在init方法调用之后，进行后置处理工作
        // 在initMethod方法调用之后被执行
        System.out.println("postProcessAfterInitialization被执行了,"+beanName+"....."+bean);
        return null;
    }
}
