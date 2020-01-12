package com.enjoy.cap1;

/**
 * @Description
 * @Date 2019/11/19 11:09
 * @Authod ZG
 * @Version 1.0
 */
public class Person {
    private String name;
    private int age;

    // 使用xml中bean定义时，需要无参构造。
    public Person(){}

    public Person(String name, int age) {
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

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
