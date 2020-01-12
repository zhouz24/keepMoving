package com.enjoy.cap1;

import com.enjoy.cap1.config.MainConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Description 基于注解方法拿配置（）
 * @Date 2019/11/19 14:23
 * @Authod ZG
 * @Version 1.0
 */
public class MainTest2 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MainConfig.class);
        Object person = context.getBean("abc");
        System.out.println(person);
        String[] beanNamesForType = context.getBeanNamesForType(Person.class);
        for (String s : beanNamesForType) {
            System.out.println(s);
        }
        System.out.println();
    }
}
