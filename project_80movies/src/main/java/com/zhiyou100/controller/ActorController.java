package com.zhiyou100.controller;

import com.zhiyou100.model.Actor;
import com.zhiyou100.service.ActorService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;

/**
 * @Author:li
 * @Date:2019/9/26 11:40
 */
@Controller
@RequestMapping("actorController")
public class ActorController {
    @Resource
    private ActorService actorService;
    @RequestMapping(value = "queryAll.do")
    public String queryAll(Model model){
        model.addAttribute("actors",actorService.queryAll());
        return "actor/actorShow";
    }
    @RequestMapping(value = "goAdd.do",method = RequestMethod.GET)
    public String goAdd(){
        return "actor/actorAdd";
    }
    @RequestMapping(value = "add.do",method = RequestMethod.POST)
    public String add(Actor actor){
        actorService.add(actor);
        return "forward:queryAll.do";
    }
    @RequestMapping("goUpdate.do")
    public String goUpdate(Model model,Integer id){
        model.addAttribute("actor",actorService.findById(id));
        return "actor/actorUpdate";
    }
    @RequestMapping(value = "update.do",method = RequestMethod.POST)
    public String update(Actor actor){
        actorService.update(actor);
        return "forward:queryAll.do";
    }
    @RequestMapping("delete.do")
    public String delete(Integer id){
        actorService.deleteById(id);
        return "forward:queryAll.do";
    }
}
