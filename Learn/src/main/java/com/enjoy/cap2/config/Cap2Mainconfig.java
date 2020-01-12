package com.enjoy.cap2.config;

import com.enjoy.cap1.Person;
import com.enjoy.cap2.controller.OrderController;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Controller;

/**
 * @Description @ComponentScan指定扫描范围的测试用例
 * @Date 2019/11/19 14:32
 * @Authod ZG
 * @Version 1.0
 */

//@Configuration -- 配置类
// @ComponentScan -- 扫描范围
    // value是包名，includeFilters 引入哪些类型 ，
    // excludeFilters 除了哪些类型， userDefaultFilters 是否是默认 @Filters(type是过滤类型)

    //  userDefaultFilters 设置为true，会把所有的Component组件加载
@Configuration
@ComponentScan(value = "com.enjoy.cap2" ,includeFilters = {
        //@ComponentScan.Filter(type = FilterType.ANNOTATION,classes = {Controller.class}) // 过滤注解类型
        // @ComponentScan.Filter(type = FilterType.ASSIGNABLE_TYPE,classes = {OrderController.class}) // 过滤类的类型
        @ComponentScan.Filter(type = FilterType.CUSTOM,classes = {MyFilter.class}) // 过滤自定义类型
} ,useDefaultFilters = false)
public class Cap2Mainconfig {
    // 构造方法注入
    @Bean("person")
    public Person person(){
        return new Person("lisi",19);
    }
}
