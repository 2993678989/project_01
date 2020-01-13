package com.zhiyou100.service;

import com.zhiyou100.model.Actor;
import com.zhiyou100.model.Admin;
import com.zhiyou100.model.ResponseVo;

import java.util.List;

/**
 * @Author:li
 * @Date:2019/9/26 11:32
 */
public interface AdminService {
    Admin findById(Integer id);
    int add(Admin admin);
    int deleteById(Integer id);
    int update(Admin admin);
    Admin findByName(String name);
    ResponseVo<Admin> login(Admin admin);
}
