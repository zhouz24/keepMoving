package com.enjoy.cap4;

import com.enjoy.cap1.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

/**
 * @Description
 * @Date 2019/11/19 14:32
 * @Authod ZG
 * @Version 1.0
 */

// @Configuration -- 配置类

@Configuration
public class Cap4Mainconfig {
    /**
     *给容器中注册一个bean，类型为返回值的类型
     * @return
     *
     * 懒加载： 主要针对单实例bean：默认在容器启动的时候创建对象
     *      容器初始化的时候不创建对象，仅当第一次使用（获取）的时候才创建对象。
     */
    @Lazy
    @Bean("person")
    public Person person(){
        System.out.println("创建person，并添加到IOC容器中");
        return new Person("lisi",19);
    }
}
