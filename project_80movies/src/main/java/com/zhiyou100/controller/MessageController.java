package com.zhiyou100.controller;

import com.github.pagehelper.PageHelper;
import com.zhiyou100.model.Message;
import com.zhiyou100.service.MessageService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;

/**
 * @Author:li
 * @Date:2019/10/8 15:22
 */
@Controller
@RequestMapping("messageController")
public class MessageController {
    @Resource
    private MessageService messageService;
    @RequestMapping(value = "queryMessageAndUser.do",method = RequestMethod.GET)
    public String queryAll(Model model,Integer page){
        model.addAttribute("messageAndUsers",messageService.queryMessageAndUser(page));
        return "message/messageShow";
    }
//    @RequestMapping(value = "goAdd.do",method = RequestMethod.GET)
//    public String goAdd(){
//        return "message/messageAdd";
//    }
//    @RequestMapping(value = "add.do",method = RequestMethod.POST)
//    public String add(Model model, Message message){
//        messageService.add(message);
//        model.addAttribute("messages",messageService.queryAll());
//        return "message/messagesShow";
//    }
    @RequestMapping(value = "update.do")
    public String update(Model model, Integer id,String state){
        messageService.update(id,state);
        return "forward:queryMessageAndUser.do";
    }
    @RequestMapping("delete.do")
    public String delete(Model model,Integer id){
        messageService.deleteById(id);
        return "forward:queryMessageAndUser.do";
    }
}
