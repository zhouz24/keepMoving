package com.enjoy.cap1;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Description 从xml中拿bean
 * @Date 2019/11/19 11:14
 * @Authod ZG
 * @Version 1.0
 */
public class MainTest {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
        Object person = applicationContext.getBean("person");
        System.out.println(person);
        System.out.println(person.toString());

    }
}
