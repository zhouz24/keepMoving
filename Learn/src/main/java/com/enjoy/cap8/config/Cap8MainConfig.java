package com.enjoy.cap8.config;

import com.enjoy.cap8.bean.Bird;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * @Description  PropertySource中的东西会加载到环境变量中
 * @Date 2019/11/25 15:50
 * @Authod ZG
 * @Version 1.0
 */
@Configuration
@PropertySource(value = "classpath:/test.propetise")
public class Cap8MainConfig {
    @Bean
    public Bird bird(){
        return new Bird();
    }
}
