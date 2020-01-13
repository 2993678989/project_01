package com.zhiyou100.controller;

import com.zhiyou100.model.Admin;
import com.zhiyou100.model.ResponseVo;
import com.zhiyou100.service.AdminService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @Author:li
 * @Date:2019/9/27 19:57
 */
@RestController
@RequestMapping("loginController")
public class LoginController {
    @Resource
    private AdminService adminService;
    @RequestMapping(value = "login.do",method = RequestMethod.POST)
    public ResponseVo<Admin> login(Admin admin){
        ResponseVo<Admin> login = adminService.login(admin);
        return login;
    }

}
