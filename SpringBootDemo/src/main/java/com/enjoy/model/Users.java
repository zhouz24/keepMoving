package com.enjoy.model;

/**
 * @Description pojo实体类
 * @Date 2020/1/3 9:27
 * @Authod ZG
 * @Version 1.0
 */
public class Users {
    private int id;
    private String passwd;
    private String username;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public String toString() {
        return "Users{" +
                "id=" + id +
                ", passwd='" + passwd + '\'' +
                ", username='" + username + '\'' +
                '}';
    }
}
