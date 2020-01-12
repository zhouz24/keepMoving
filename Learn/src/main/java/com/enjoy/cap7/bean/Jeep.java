package com.enjoy.cap7.bean;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @Description 通过jsr250规范来查看bean的声明周期
 * @Date 2019/11/24 10:19
 * @Authod ZG
 * @Version 1.0
 */
@Component
public class Jeep {
    public Jeep() {
        System.out.println("Jeep....construction....;");
    }

    @PostConstruct
    public void init(){
        System.out.println("jeep......init......");
    }

    @PreDestroy
    public void destory(){
        System.out.println("jeep......destory.......");
    }
}
