package com.zhiyou100.controller;

import com.zhiyou100.model.Actor;
import com.zhiyou100.model.Director;
import com.zhiyou100.service.ActorService;
import com.zhiyou100.service.DirectorService;
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
@RequestMapping("directorController")
public class DirectorController {
    @Resource
    private DirectorService directorService;
    @RequestMapping(value = "queryAll.do")
    public String queryAll(Model model){
        model.addAttribute("directors",directorService.queryAll());
        return "director/directorShow";
    }
    @RequestMapping(value = "goAdd.do",method = RequestMethod.GET)
    public String goAdd(){
        return "director/directorAdd";
    }
    @RequestMapping(value = "add.do",method = RequestMethod.POST)
    public String add(Model model,Director director){
        directorService.add(director);
        model.addAttribute("directors",directorService.queryAll());
        return "forward:queryAll.do";
    }
    @RequestMapping("goUpdate.do")
    public String goUpdate(Model model,Integer id){
        model.addAttribute("director",directorService.findById(id));
        return "director/directorUpdate";
    }
    @RequestMapping(value = "update.do",method = RequestMethod.POST)
    public String update(Model model, Director director){
        directorService.update(director);
        model.addAttribute("directors",directorService.queryAll());
        return "forward:queryAll.do";
    }
    @RequestMapping("delete.do")
    public String delete(Model model,Integer id){
        directorService.deleteById(id);
        model.addAttribute("directors",directorService.queryAll());
        return "forward:queryAll.do";
    }
}
