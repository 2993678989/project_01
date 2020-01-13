package com.zhiyou100.controller;

import com.zhiyou100.model.Area;
import com.zhiyou100.service.AreaService;
import com.zhiyou100.service.ChannelService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;

/**
 * @Author:li
 * @Date:2019/10/8 9:41
 */
@Controller
@RequestMapping("areaController")
public class AreaController {
    @Resource
    private ChannelService channelService;
    @Resource
    private AreaService areaService;
    @RequestMapping("queryAreaAndChannel.do")
    public String queryAreaAndChannel(Model model){
        model.addAttribute("areaAndChannel",areaService.queryAreaAndChannel());
        return "area/areaShow";
    }
    @RequestMapping("goAdd.do")
    public String goAdd(Model model){
        model.addAttribute("channels",channelService.queryAll());
        return "area/areaAdd";
    }
    @RequestMapping(value = "add",method = RequestMethod.POST)
    public String add(Model model, Area area){
        areaService.add(area);
        return "forward:queryAreaAndChannel.do";
    }
    @RequestMapping("delete")
    public String delete(Model model,Integer id){
        areaService.deleteById(id);
        return "forward:queryAreaAndChannel.do";
    }
    @RequestMapping("goUpdate.do")
    public String goUpdate(Model model,Integer id){
        model.addAttribute("channels",channelService.queryAll());
        model.addAttribute("area",areaService.queryAreaAndChannelById(id));
        return "area/areaUpdate";
    }
    @RequestMapping("update.do")
    public String update(Model model,Area area){
        areaService.update(area);
        return "forward:queryAreaAndChannel.do";
    }
}
