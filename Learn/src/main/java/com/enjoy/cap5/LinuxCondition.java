package com.enjoy.cap5;

import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.env.Environment;
import org.springframework.core.type.AnnotatedTypeMetadata;

/**
 * @Description
 * @Date 2019/11/19 16:26
 * @Authod ZG
 * @Version 1.0
 */
public class LinuxCondition implements Condition {

    /**
     *
     * @param context 判断条件可以使用的上下文（环境）
     * @param metadata 注解的信息
     * @return
     */
    @Override
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
        // 是否为windows系统
        ConfigurableListableBeanFactory beanFactory = context.getBeanFactory();
        /**
         *   BeanFactory 与 FactoryBean
         *   java实例bean通过factoryBean注册到IOC容器红
         *   beanFactory ,通过beanFactory获取实例
         */

        // 获取当前环境变量（包括操作系统）
        Environment environment = context.getEnvironment();
        // os.name 对应属性是操作系统
        String s = environment.getProperty("os.name");

        if(s.contains("Linux")){
            return true;
        }
        return false;
    }
}
