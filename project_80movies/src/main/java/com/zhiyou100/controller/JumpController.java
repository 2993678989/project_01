package com.zhiyou100.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author:li
 * @Date:2019/9/27 21:53
 */
@Controller
@RequestMapping("jump")
public class JumpController {

    @RequestMapping("userShow.do")
    public String userShow(){
        return "user/show";
    }
    @RequestMapping("userUpdate.do")
    public String userUpdate(){
        return "user/update";
    }
    @RequestMapping("userInsert.do")
    public String userInsert(){
        return "user/insert";
    }
    @RequestMapping("channelShow.do")
    public String channelShow(){
        return "channel/show";
    }
}
