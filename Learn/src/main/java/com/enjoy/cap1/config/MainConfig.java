package com.enjoy.cap1.config;

import com.enjoy.cap1.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Description 配置类
 * @Date 2019/11/19 14:21
 * @Authod ZG
 * @Version 1.0
 */
// 配置类注解
@Configuration
public class MainConfig {
    // 构造方法注入
    @Bean("abc")
    public Person person(){
        return new Person("lisi",19);
    }
}
