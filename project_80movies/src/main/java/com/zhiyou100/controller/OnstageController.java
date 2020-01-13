package com.zhiyou100.controller;

import com.zhiyou100.model.Banner;
import com.zhiyou100.service.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

/**
 * @Author:li
 * @Date:2019/10/11 19:08
 */
@Controller
@RequestMapping("onstageController")
public class OnstageController {
    @Resource
    private MoldService moldService;
    @Resource
    private AreaService areaService;
    @Resource
    private BannerService bannerService;
    @Resource
    private ChannelService channelService;
    @RequestMapping("onstageShow.do")
    public String videoShow(Model model, String account, HttpSession session){
        model.addAttribute("channels",channelService.findChannelAndMoldAndVideoAndActor());
        model.addAttribute("channelHots",channelService.findChannelAndMoldAndVideoPlay());
        model.addAttribute("banners",bannerService.queryAll());
        session.setAttribute("account",account);
        return "onstage/onstageShow";
    }
    @RequestMapping("selectVideoByChannelId.do")
    public String selectVideoByChannelId(Model model,Integer id,Integer moldId,Integer areaId,Integer year){
        if (id ==null){
            id=1;
        }
        model.addAttribute("channelVideo",channelService.selectVideoByChannelId(id,moldId,areaId,year));
        model.addAttribute("channels",channelService.queryAll());
        model.addAttribute("molds",moldService.findByChannelId(id));
        model.addAttribute("areas",areaService.findByChannelId(id));
        model.addAttribute("moldId",moldId);
        model.addAttribute("areaId",areaId);
        model.addAttribute("id",id);
        return "onstage/onstageSelect";
    }
}
