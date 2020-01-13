package com.zhiyou100.controller;

import com.zhiyou100.mapper.ThemeVideoMapper;
import com.zhiyou100.model.Theme;
import com.zhiyou100.model.ThemeVideo;
import com.zhiyou100.model.Video;
import com.zhiyou100.service.MoldService;
import com.zhiyou100.service.ThemeService;
import com.zhiyou100.service.ThemeVideoService;
import com.zhiyou100.service.VideoService;
import org.omg.IOP.TAG_JAVA_CODEBASE;
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
 * @Date:2019/10/10 21:00
 */
@Controller
@RequestMapping("themeController")
public class ThemeController {
    @Resource
    private ThemeService themeService;
    @Resource
    private ThemeVideoService themeVideoService;
    @Resource
    private MoldService moldService;
    @Resource
    private VideoService videoService;
    @RequestMapping("findQueryAll.do")
    public String findQueryAll(Model model){
        model.addAttribute("themes",themeService.findQueryAll());
        return "theme/themeShow";
    }
    @RequestMapping("goAdd.do")
    public String goAdd(){
        return "theme/themeAdd";
    }
    @RequestMapping(value = "addTheme.do",method = RequestMethod.POST)
    public String addTheme(Theme theme, @RequestParam("file") MultipartFile file, HttpServletRequest request){
        themeService.add(theme,file,request);
        return "forward:findQueryAll.do";
    }
    @RequestMapping("deleteTheme.do")
    public String deleteTheme(Integer id){
        themeService.deleteById(id);
        return "forward:findQueryAll.do";
    }
    @RequestMapping("goUpdate.do")
    public String goUpdate(Integer id,Model model){
        model.addAttribute("theme",themeService.findQueryAllById(id));
        return "theme/themeUpdate";
    }
    @RequestMapping(value = "updateTheme.do",method = RequestMethod.POST)
    public String updateTheme(Theme theme, @RequestParam("file") MultipartFile file, HttpServletRequest request){
        if (theme.getCount()==null|| "".equals(theme.getCount())){
            theme.setCount(0);
        }
        themeService.update(theme,file,request);
        return "forward:findQueryAll.do";
    }
    @RequestMapping("themeVideoShow.do")
    public String themeVideoShow(Model model,Integer id){
        model.addAttribute("themeVideos",themeService.findQueryAllById(id));
        return "theme/themeVideoShow";
    }
    @RequestMapping("deleteThemeVideo.do")
    public String deleteThemeVideo(Integer videoId,Integer themeId,Model model){
        themeVideoService.deleteByThemeVideo(new ThemeVideo(null,themeId,videoId));
        Theme count = themeService.findCount(themeId);
        count.setId(themeId);
        themeService.updateCount(count);
        model.addAttribute("themeVideos",themeService.findQueryAllById(themeId));
        return "theme/themeVideoShow";
    }
    @RequestMapping("goThemeVideoAdd.do")
    public String goThemeVideoAdd(Model model,Integer themeId){
        model.addAttribute("molds",moldService.queryAll());
        model.addAttribute("themeId",themeId);
        return "theme/themeVideoAdd";
    }
    @RequestMapping("selectVideo.do")
    public String selectVideo(Model model, Video video,Integer themeId){
        model.addAttribute("videos",videoService.likeVideo(video));
        model.addAttribute("molds",moldService.queryAll());
        model.addAttribute("themeId",themeId);
        return "theme/themeVideoAdd";
    }
    @RequestMapping("addThemeVideo.do")
    public String addThemeVideo(Model model, ThemeVideo themeVideo){
        themeVideoService.add(themeVideo);
        Theme count = themeService.findCount(themeVideo.getThemeId());
        count.setId(themeVideo.getThemeId());
        themeService.updateCount(count);
        model.addAttribute("themeVideos",themeService.findQueryAllById(themeVideo.getThemeId()));
        return "theme/themeVideoShow";
    }
}
