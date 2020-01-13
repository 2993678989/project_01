package com.zhiyou100.controller;

import com.zhiyou100.model.Admin;
import com.zhiyou100.service.AdminService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

/**
 * @Author:li
 * @Date:2019/9/27 19:30
 */
@Controller
@RequestMapping("adminController")
public class AdminController {
    @Resource
    private AdminService adminService;

    @RequestMapping("add.do")
    public String add(){
        return "admin/insert";
    }
    @RequestMapping("insert.do")
    public String insert(Admin admin,Model model){
        String msg =null;
        int add = adminService.add(admin);
        if (add==1){
            return "admin/insert";
        }
        msg = "添加失败";
        model.addAttribute("msg",msg);
        return "admin/admin";
    }
    @RequestMapping("login.do")
    public String login(){
        return "admin/admin";
    }
}
