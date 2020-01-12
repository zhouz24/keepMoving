package com.enjoy.dao;

import com.enjoy.model.Users;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @Description mybatis映射类
 * @Date 2020/1/3 9:26
 * @Authod ZG
 * @Version 1.0
 */
//@Mapper注解用于往容器中注册
//@Mapper
public interface UsersMapper {
    // 新增
    int insertByUsers(Users record);

    Users selectUserByUserNameAndPasswd(@Param("username") String username,@Param("passwd") String passwd);
}
