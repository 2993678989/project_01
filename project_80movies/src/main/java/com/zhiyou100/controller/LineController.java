package com.zhiyou100.controller;

import com.zhiyou100.model.Director;
import com.zhiyou100.model.Line;
import com.zhiyou100.service.DirectorService;
import com.zhiyou100.service.LineService;
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
@RequestMapping("lineController")
public class LineController {
    @Resource
    private LineService lineService;
    @RequestMapping(value = "queryAll.do")
    public String queryAll(Model model){
        model.addAttribute("lines",lineService.queryAll());
        return "line/lineShow";
    }
    @RequestMapping(value = "goAdd.do",method = RequestMethod.GET)
    public String goAdd(){
        return "line/lineAdd";
    }
    @RequestMapping(value = "add.do",method = RequestMethod.POST)
    public String add(Model model,Line line){
        lineService.add(line);
        model.addAttribute("lines",lineService.queryAll());
        return "forward:queryAll.do";
    }
    @RequestMapping("goUpdate.do")
    public String goUpdate(Model model,Integer id){
        model.addAttribute("line",lineService.findById(id));
        return "line/lineUpdate";
    }
    @RequestMapping(value = "update.do",method = RequestMethod.POST)
    public String update(Model model, Line line){
        lineService.update(line);
        model.addAttribute("lines",lineService.queryAll());
        return "forward:queryAll.do";
    }
    @RequestMapping("delete.do")
    public String delete(Model model,Integer id){
        lineService.deleteById(id);
        model.addAttribute("lines",lineService.queryAll());
        return "forward:queryAll.do";
    }
}
