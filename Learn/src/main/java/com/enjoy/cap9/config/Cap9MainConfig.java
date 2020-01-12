package com.enjoy.cap9.config;

import com.enjoy.cap9.dao.TestDao;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

/**
 * @Description
 * @Date 2019/11/25 16:23
 * @Authod ZG
 * @Version 1.0
 */
@Configuration
@ComponentScan({"com.enjoy.cap9"})
public class Cap9MainConfig {

    @Primary
    @Bean("testDao")
    public TestDao testDao(){
        TestDao tDao = new TestDao();
        tDao.setAge(2);
        return tDao;
    }
}
