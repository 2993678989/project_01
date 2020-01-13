package com.zhiyou100.controller;

import com.zhiyou100.model.Banner;
import com.zhiyou100.model.Video;
import com.zhiyou100.service.BannerService;
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
 * @Date:2019/10/8 9:19
 */
@Controller
@RequestMapping("bannerController")
public class BannerController {
    @Resource
    private BannerService bannerService;
    @Resource
    private MoldService moldService;
    @Resource
    private VideoService videoService;
    @RequestMapping("queryBannerVideo.do")
    public String queryBannerVideo(Model model){
        model.addAttribute("bannerVideos",bannerService.findVideo());
        return "banner/bannerShow";
    }
    @RequestMapping("goAdd.do")
    public String goAdd(Model model){
        model.addAttribute("molds",moldService.queryAll());
        return "banner/bannerAdd";
    }
    @RequestMapping("selectVideo.do")
    public String selectVideo(Model model, Video video){
        model.addAttribute("videos",videoService.likeVideo(video));
        model.addAttribute("molds",moldService.queryAll());
        return "banner/bannerAdd";
    }
    @RequestMapping(value = "addBanner.do",method = RequestMethod.POST)
    public String addBanner(Banner banner, @RequestParam("file") MultipartFile file, HttpServletRequest request){
        bannerService.add(banner,file,request);
        return "forward:queryBannerVideo.do";
    }
    @RequestMapping("deleteBanner.do")
    public String deleteBanner(Integer id){
        bannerService.deleteById(id);
        return "forward:queryBannerVideo.do";
    }
    @RequestMapping("goUpdate.do")
    public String goUpdate(Model model,Integer id,Integer videoId){
        model.addAttribute("molds",moldService.queryAll());
        model.addAttribute("bannerId",id);
        model.addAttribute("videoId",videoId);
        model.addAttribute("banner",bannerService.findVideoById(id));
        return "banner/bannerUpdate";
    }
    @RequestMapping("selectVideoUpdate.do")
    public String selectVideoUpdate(Model model, Video video,Integer videoId){
        model.addAttribute("videos",videoService.likeVideo(video));
        model.addAttribute("molds",moldService.queryAll());
        model.addAttribute("bannerId",video.getId());
        model.addAttribute("videoId",videoId);
        model.addAttribute("banner",bannerService.findVideoById(video.getId()));
        return "banner/bannerUpdate";
    }
    @RequestMapping(value = "updateBanner.do",method = RequestMethod.POST)
    public String updateBanner(Banner banner, @RequestParam("file") MultipartFile file, HttpServletRequest request){
        bannerService.update(banner,file,request);
        return "forward:queryBannerVideo.do";
    }
}
