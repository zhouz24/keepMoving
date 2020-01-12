package com.enjoy;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description SpringBoot的启动入口
 * @Date 2020/1/2 14:20
 * @Authod ZG
 * @Version 1.0
 */

//@RestController ：@ResponseBody和@Controller的组合注解
// EnableAutoConfiguration 包含自动装配版本功能
    /*
     *@SpringBootApplication是一个组合注解
     * 包含两个核心注解：@SpringBootConfiguration和@EnableAutoConfiguration
     * @SpringBootConfiguration里面包含了一个@Configuration注解，声明这个是一个spring的配置类，类似于@SpringBootConfiguration=@Configuration
     * @EnableAutoConfiguration自动配置注解：包含@AutoConfigurationPackage和@Import({AutoConfigurationImportSelector.class})
     *
     * @MapperScan扫描注册mapper映射接口包
     *
     * @EnableTransactionManagement 开启事务
     */
//@EnableAutoConfiguration
@SpringBootApplication
@MapperScan("com.enjoy.dao")
@EnableTransactionManagement
public class App extends SpringBootServletInitializer {

    public static void main(String[] args) {
        // 启动入口，参数：指定启动加载类，个性化参数
        SpringApplication.run(App.class, args);
    }

    /**
     * 打包成war的时候指定启动类的入口
     * @param builder
     * @return
     */
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        // 指定启动类
        return builder.sources(App.class);
    }
}
