package com.enjoy.service;

/**
 * @Description 抽象出接口
 * @Date 2020/1/3 10:45
 * @Authod ZG
 * @Version 1.0
 */
public interface IUserService {

    boolean register(String name,String passwd);

    boolean login(String name,String passwd);

    void batchAdd(String username,String passwd);
}
