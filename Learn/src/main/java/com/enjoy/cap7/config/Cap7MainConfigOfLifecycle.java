package com.enjoy.cap7.config;

import com.enjoy.cap1.Person;
import com.enjoy.cap7.bean.Bike;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Scope;
/**
 *   BeanFactory 与 FactoryBean
 *   java实例bean通过factoryBean注册到IOC容器红
 *   beanFactory ,通过beanFactory获取实例
 */
/**
 * @Description
 *  三种方式可以自定义bean的初始化和销毁方法：、
 *      1、@Bean中的initMethod/destoryMethod属性指定对应方法 （正规方式）
 *      2、通过实现接口InitializingBean,DisposableBean实现抽象方法实现
 *      3、通过jsr250规范的@PostConstruct、@PreDestroy注解实现
 *      4、实现BeanPostProcessor接口
 *
 * @Date 2019/11/21 9:56
 * @Authod ZG
 * @Version 1.0
 */
@ComponentScan("com.enjoy.cap7.bean")
public class Cap7MainConfigOfLifecycle {
    /**
     *
     * @return
     */
    @Bean("person")
    public Person person(){
        System.out.println("创建person，并添加到IOC容器中");
        return new Person("lisi",19);
    }

    /**
     * initMethod 实例初始化方法
     * destroyMethod 实例销毁方法
     * @return
     *
     *
     */

    @Bean(initMethod = "init", destroyMethod = "destory")
    public Bike bike(){
        return new Bike();
    }
}
