package com.enjoy.cap3.config;

import com.enjoy.cap1.Person;
import com.enjoy.cap2.config.MyFilter;
import org.springframework.context.annotation.*;

/**
 * @Description bean的作用域 (默认是单例）
 *
 * @Date 2019/11/19 14:32
 * @Authod ZG
 * @Version 1.0
 */

// @Configuration -- 配置类

@Configuration
public class Cap3Mainconfig {
    // 构造方法注入,给IOC容器中注册一个bean，默认是单例

    // @Scope-- 实例作用域 加载注册bean的方法上，prototype多实例，singleton单实例
    // 多实例与单实例的区别在于，
    // 多例在IOC容器中启动时不会调用方法创建对象，会在每次调用时才调用方法初始化
    // 单例在IOC容器启动时会调用犯法创建对象并放到IOC容器中，以后每次获取就是直接从容器中（BeanFactory大的map）拿同一个bean
    // requset : 主要针对web应用，递交一次请求创建一个实例
    // session : 同一个session创建一个实例
    @Bean("person")
    //@Scope(value = "prototype")
    @Scope(value = "singleton")
    public Person person(){
        return new Person("lisi",19);
    }
}
