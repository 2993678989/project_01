package com.zhiyou100.controller;

import com.zhiyou100.model.Area;
import com.zhiyou100.model.Channel;
import com.zhiyou100.model.Mold;
import com.zhiyou100.service.ActorService;
import com.zhiyou100.service.AreaService;
import com.zhiyou100.service.ChannelService;
import com.zhiyou100.service.MoldService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author:li
 * @Date:2019/9/26 11:40
 */
@Controller
@RequestMapping("channelController")
public class ChannelController {
    @Resource
    private ChannelService channelService;
    @Resource
    private AreaService areaService;
    @Resource
    private MoldService moldService;
    @RequestMapping("queryChannelAreaMold.do")
    public String queryChannelAreaMold(Model model){
        model.addAttribute("channelAreaMolds",channelService.queryChannelAreaMold());
        return "channel/show";

    }
    @RequestMapping("add.do")
    public String add(){
        return "channel/add";
    }
    @RequestMapping(value = "insert.do",method = RequestMethod.POST)
    public String insert(Model model, Channel channel){
        int add = channelService.add(channel);
        List<Channel> channels = channelService.queryChannelAreaMold();
        model.addAttribute("channelAreaMolds",channels);
        return "channel/show";
    }
    @RequestMapping("goUpdate.do")
    public String goUpdate(Model model,Integer id){
        model.addAttribute("queryChannelAreaMoldById",channelService.queryChannelAreaMoldById(id));
        return "channel/update";
    }
    @RequestMapping("update.do")
    public String update(Model model,Channel channel){
        channelService.update(channel);
        List<Channel> channels = channelService.queryChannelAreaMold();
        model.addAttribute("channelAreaMolds",channels);
        return "channel/show";
    }
    @RequestMapping("delete.do")
    public String delete(Model model,Integer id){
        channelService.deleteById(id);
        List<Channel> channels = channelService.queryChannelAreaMold();
        model.addAttribute("channelAreaMolds",channels);
        return "channel/show";
    }
    @RequestMapping("goUpdateArea.do")
    public String goUpdateArea(Model model,Integer id){
        model.addAttribute("channelAreas",channelService.queryChannelAreaMoldById(id));
        model.addAttribute("areas",areaService.queryAll());
        return "channel/updateArea";
    }
    @RequestMapping("deleteArea.do")
    public String deleteArea(Model model,Integer channelId,Integer id){
        areaService.deleteById(id);
        model.addAttribute("channelAreas",channelService.queryChannelAreaMoldById(channelId));
        model.addAttribute("areas",areaService.queryAll());
        return "channel/updateArea";
    }
    @RequestMapping("addArea.do")
    public String addArea(Model model, Area area){
        areaService.add(area);
        model.addAttribute("channelAreas",channelService.queryChannelAreaMoldById(area.getChannelId()));
        model.addAttribute("areas",areaService.queryAll());
        return "channel/updateArea";
    }
    @RequestMapping("goUpdateMold.do")
    public String goUpdateMold(Model model,Integer id){
        model.addAttribute("channelMolds",channelService.queryChannelAreaMoldById(id));
        model.addAttribute("molds",moldService.queryAll());
        return "channel/updateMold";
    }
    @RequestMapping("deleteMold.do")
    public String deleteMold(Model model,Integer channelId,Integer id){
        moldService.deleteById(id);
        model.addAttribute("channelMolds",channelService.queryChannelAreaMoldById(channelId));
        model.addAttribute("molds",moldService.queryAll());
        return "channel/updateMold";
    }
    @RequestMapping("addMold.do")
    public String addMold(Model model, Mold mold){
        moldService.add(mold);
        model.addAttribute("channelMolds",channelService.queryChannelAreaMoldById(mold.getChannelId()));
        model.addAttribute("molds",moldService.queryAll());
        return "channel/updateMold";
    }

}
