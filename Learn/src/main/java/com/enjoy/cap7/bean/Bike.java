package com.enjoy.cap7.bean;

/**
 * @Description  通过@Bean中添加initMethod，destoryMethod方法查看备案的生命周期
 * @Date 2019/11/21 10:16
 * @Authod ZG
 * @Version 1.0
 */
public class Bike {
    public Bike(){
        System.out.println("Bike construction  ");
    }

    public void init(){
        System.out.println("Bike init ");
    }

    public void destory(){
        System.out.println("Bike destory ");
    }
}
