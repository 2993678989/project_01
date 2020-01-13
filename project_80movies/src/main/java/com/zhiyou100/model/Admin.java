package com.zhiyou100.model;

/**
 * @Author:li
 * @Date:2019/9/27 19:18
 * 管理员
 */
public class Admin {
    private Integer Id;
    private String account;
    private String password;

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Admin{" +
                "Id=" + Id +
                ", account='" + account + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
