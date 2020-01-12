package com.enjoy.cap8.bean;

import org.springframework.beans.factory.annotation.Value;

/**
 * @Description
 * @Date 2019/11/25 15:48
 * @Authod ZG
 * @Version 1.0
 */
public class Bird  {
    public Bird(){}

    /**
     * propertise与yml文件的区别
     * 例子：
     *  properties的格式：mysql.info.url = 127.0.0.1
     *                      mysql.info.username = test
     *                      mysql.info.pwd=test
     * yml的格式：
     *              mysql
     *                  info
     *                      url:127.0.0.1
     *                      username:test
     *                      pwd:test
     */

    /**
     * 给属性赋值的方式：
     *      1、使用@Value进行赋值：参数可以是1、基本字符；2、springEL表达式;3、环境变量配置文件中取配置项
     *      2、使用xml中bean配置属性property的value
     *      3、构造方法
     *      4、get/set
     */
    @Value("lisan")
    private String name;

    @Value("#{20-2}")
    private int age;

    @Value("${bird.color}")
    private String color;

    public Bird(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Bird{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                '}';
    }

}
