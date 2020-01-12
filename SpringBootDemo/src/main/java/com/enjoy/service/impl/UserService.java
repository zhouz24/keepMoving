package com.enjoy.service.impl;

import com.enjoy.dao.UsersMapper;
import com.enjoy.model.Users;
import com.enjoy.service.IUserService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * @Description 具体实现service
 * @Date 2020/1/3 10:46
 * @Authod ZG
 * @Version 1.0
 */
@Service
public class UserService implements IUserService {
    @Resource
    private UsersMapper usersMapper;

    @Override
    public boolean login(String name, String passwd) {
        Users user = usersMapper.selectUserByUserNameAndPasswd(name,passwd);
        return user != null;
    }

    // 方法上添加事务
    @Override
    @Transactional
    public void batchAdd(String username, String passwd) {
        Users users = new Users();
        users.setUsername(username);
        users.setPasswd(passwd);
        usersMapper.insertByUsers(users);
        int i = 10 /0;
        users = new Users();
        users.setUsername(username+"2");
        users.setPasswd(passwd);
        usersMapper.insertByUsers(users);
    }

    @Override
    public boolean register(String name, String passwd) {
        Users user = new Users();
        user.setUsername(name);
        user.setPasswd(passwd);
        int i = usersMapper.insertByUsers(user);
        return i > 0;
    }
}
