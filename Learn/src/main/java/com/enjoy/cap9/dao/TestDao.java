package com.enjoy.cap9.dao;

import org.springframework.stereotype.Repository;

/**
 * @Description
 * @Date 2019/11/25 16:25
 * @Authod ZG
 * @Version 1.0
 */
@Repository
public class TestDao {
    private int age = 1;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "TestDao{" +
                "age=" + age +
                '}';
    }
}
