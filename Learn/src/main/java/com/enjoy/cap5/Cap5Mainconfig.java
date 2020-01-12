package com.enjoy.cap5;

import com.enjoy.cap1.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

/**
 * @Description @Conditional(value = {})条件注册bean
 * @Date 2019/11/19 14:32
 * @Authod ZG
 * @Version 1.0
 */
@Configuration
public class Cap5Mainconfig {
    /**
     *给容器中注册一个bean，类型为返回值的类型
     * @return
     */
    @Bean("person")
    public Person person(){
        System.out.println("创建person，并添加到IOC容器中");
        return new Person("lisi",19);
    }

    // 判断WinCondition.class 的matches()方法是否返回true，为true加载
    @Conditional(value = {WinCondition.class})
    @Bean("zhangsan")
    public Person zhangsan(){
        System.out.println("创建zhangsan，并添加到IOC容器中");
        return new Person("zhangsan",19);
    }

    // 判断WinCondition.class 的matches()方法是否返回true，为true加载
    @Conditional(value = {LinuxCondition.class})
    @Bean("wangwu")
    public Person wangwu(){
        System.out.println("创建lisi，并添加到IOC容器中");
        return new Person("lisi",19);
    }
}
