package com.enjoy.test;

import com.enjoy.App;
import com.enjoy.dao.UsersMapper;
import com.enjoy.model.Users;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

/**
 * @Description
 * @Date 2020/1/3 9:39
 * @Authod ZG
 * @Version 1.0
 */
//@SpringBootTest 使用时需要加上启动类
@SpringBootTest(classes = App.class)
@RunWith(SpringRunner.class)
public class UsersTest {

    @Resource
    private UsersMapper usersMapper;

    @Test
    public void insertTest(){
        Users users = new Users();
        users.setPasswd("123");
        users.setUsername("james");
        System.out.println("i:"+usersMapper.insertByUsers(users));
    }
    @Test
    public void selectTest(){
        Users users = usersMapper.selectUserByUserNameAndPasswd("james","123");
        System.out.println(users.toString());
    }
}
