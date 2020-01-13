package com.zhiyou100.controller;

import com.zhiyou100.model.Banner;
import com.zhiyou100.model.Hot;
import com.zhiyou100.model.Video;
import com.zhiyou100.service.HotService;
import com.zhiyou100.service.MoldService;
import com.zhiyou100.service.VideoService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

/**
 * @Author:li
 * @Date:2019/10/10 16:18
 */
@Controller
@RequestMapping("hotController")
public class HotController {
    @Resource
    private HotService hotService;
    @Resource
    private MoldService moldService;
    @Resource
    private VideoService videoService;
    @RequestMapping("findQueryAll")
    public String findQueryAll(Model model){
        model.addAttribute("hots",hotService.findQueryAll());
        return "hot/hotShow";
    }
    @RequestMapping("goAdd.do")
    public String goAdd(Model model){
        model.addAttribute("molds",moldService.queryAll());
        return "hot/hotAdd";
    }
    @RequestMapping("selectVideo.do")
    public String selectVideo(Model model, Video video){
        model.addAttribute("videos",videoService.likeVideo(video));
        model.addAttribute("molds",moldService.queryAll());
        return "hot/hotAdd";
    }
    @RequestMapping(value = "addHot.do",method = RequestMethod.POST)
    public String addBanner(Hot hot, @RequestParam("file") MultipartFile file, HttpServletRequest request){
        hotService.add(hot,file,request);
        return "forward:findQueryAll.do";
    }
    @RequestMapping("deleteHot.do")
    public String deleteBanner(Integer id){
        hotService.deleteById(id);
        return "forward:findQueryAll.do";
    }
    @RequestMapping("goUpdate.do")
    public String goUpdate(Model model,Integer id){
        model.addAttribute("molds",moldService.queryAll());
        model.addAttribute("hot",hotService.findQueryAllById(id));
        model.addAttribute("hotId",id);
        return "hot/hotUpdate";
    }
    @RequestMapping("selectVideoUpdate.do")
    public String selectVideoUpdate(Model model,Integer hotId, Video video){
        model.addAttribute("videos",videoService.likeVideo(video));
        model.addAttribute("molds",moldService.queryAll());
        model.addAttribute("hot",hotService.findQueryAllById(hotId));
        model.addAttribute("hotId",hotId);
        return "hot/hotUpdate";
    }
    @RequestMapping(value = "updateHot.do",method = RequestMethod.POST)
    public String updateMovie(Hot hot, @RequestParam("file") MultipartFile file, HttpServletRequest request){
        hotService.update(hot,file,request);
        return "forward:findQueryAll.do";
    }
}
