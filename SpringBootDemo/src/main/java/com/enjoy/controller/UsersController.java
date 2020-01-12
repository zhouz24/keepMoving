package com.enjoy.controller;

import com.enjoy.service.IUserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @Description 用户前端控制器
 * @Date 2020/1/3 9:26
 * @Authod ZG
 * @Version 1.0
 */
@RestController
public class UsersController {
   // private final Logger log = LoggerFactory.getLogger(UsersController.class);

    @Resource
    private IUserService iUsersService;

    @RequestMapping("/sayHello")
    String home() {
       // log.info("hello World的日志");
        return "Hello World1!";
    }

    @RequestMapping("/login")
    public String login(String username,String passwd) {
        boolean login = iUsersService.login(username, passwd);
        if(login) {
            return "登陆成功";
        }else {
            return  "登陆失败";
        }
    }

    @RequestMapping("/register")
    public String register(String username,String passwd) {
        boolean login = iUsersService.register(username, passwd);
        if(login) {
            return "注册成功";
        }else {
            return  "注册失败";
        }
    }

    @RequestMapping("/batchAdd")
    public String batchAdd(String username,String passwd) {
        iUsersService.batchAdd(username, passwd);
        return "成功";
    }
}
