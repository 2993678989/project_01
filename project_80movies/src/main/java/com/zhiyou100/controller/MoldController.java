package com.zhiyou100.controller;

import com.zhiyou100.mapper.MoldMapper;
import com.zhiyou100.model.Mold;
import com.zhiyou100.service.ChannelService;
import com.zhiyou100.service.MoldService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;

/**
 * @Author:li
 * @Date:2019/9/29 16:03
 */
@Controller
@RequestMapping("moldController")
public class MoldController {
    @Resource
    private MoldService moldService;
    @Resource
    private ChannelService channelService;
    @RequestMapping("findMoldChannel")
    public String findMoldChannel(Model model){
        model.addAttribute("moldChannels",moldService.findMoldChannel());
        return "mold/moldShow";
    }
    @RequestMapping("goUpdate")
    public String goUpdate(Model model,Integer id){
        model.addAttribute("mold",moldService.findMoldChannelById(id));
        model.addAttribute("channels",channelService.queryAll());
        return "mold/moldUpdate";
    }
    @RequestMapping("delete")
    public String delete(Model model,Integer id){
        moldService.deleteById(id);
        model.addAttribute("moldChannels",moldService.findMoldChannel());
        return "mold/moldShow";
    }
    @RequestMapping("update")
    public String update(Mold mold,Model model){
        moldService.update(mold);
        model.addAttribute("moldChannels",moldService.findMoldChannel());
        return "mold/moldShow";
    }
    @RequestMapping("goAdd")
    public String goAdd(Model model){
        model.addAttribute("channels",channelService.queryAll());
        return "mold/moldAdd";
    }
    @RequestMapping(value = "add",method = RequestMethod.POST)
    public String add(Model model,Mold mold){
        moldService.add(mold);
        model.addAttribute("moldChannels",moldService.findMoldChannel());
        return "mold/moldShow";
    }
}
