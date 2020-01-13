package com.zhiyou100.controller;

import com.zhiyou100.mapper.VideoActorMapper;
import com.zhiyou100.mapper.VideoDirectorMapper;
import com.zhiyou100.model.*;
import com.zhiyou100.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * @Author:li
 * @Date:2019/9/26 11:40
 */
@Controller
@RequestMapping("videoController")
public class VideoController {
    @Resource
    private VideoService videoService;
    @Resource
    private MoldService moldService;
    @Resource
    private ActorService actorService;
    @Resource
    private DirectorService directorService;
    @Resource
    private AreaService areaService;
    @Resource
    private VideoActorMapper videoActorMapper;
    @Resource
    private VideoDirectorMapper videoDirectorMapper;
    @RequestMapping(value = "queryAllAndOthers.do",method = RequestMethod.GET)
    public String queryAllAndOthers(Model model){
        model.addAttribute("videos",videoService.queryAllAndOthers());
        return "video/videoShow";
    }
    @RequestMapping(value = "goAdd.do",method = RequestMethod.GET)
    public String goAdd(Model model){
        model.addAttribute("molds",moldService.queryAll());
        model.addAttribute("areas",areaService.queryAll());
        return "video/videoAdd";
    }
    @RequestMapping(value = "add.do",method = RequestMethod.POST)
    public String add(Model model, Video video, @RequestParam("file")MultipartFile file, HttpServletRequest request){
        videoService.add(video,file,request);
        model.addAttribute("videos",videoService.queryAllAndOthers());
        return "video/videoShow";
    }
    @RequestMapping(value = "delete.do")
    public String add(Model model, Integer id){
        videoService.deleteById(id);
        model.addAttribute("videos",videoService.queryAllAndOthers());
        return "video/videoShow";
    }
    @RequestMapping(value = "goUpdateActor.do")
    public String goUpdateActor(Model model, Integer id){
        model.addAttribute("videoActors",videoService.findActorById(id));
        List<VideoActor> byVideoId = videoActorMapper.findByVideoId(id);
        List<Actor> actors = null;
        if (byVideoId.size()==0){
            actors = actorService.queryAll();
        }else {
            actors = actorService.queryAllNot(id);
        }
        model.addAttribute("actors",actors);
        return "video/videoUpdateActor";
    }
    @RequestMapping(value = "deleteVideoActor.do")
    public String deleteVideoActor(Model model, VideoActor videoActor){
        videoActorMapper.deleteVideoActor(videoActor);
        model.addAttribute("videoActors",videoService.findActorById(videoActor.getVideoId()));
        List<VideoActor> byVideoId = videoActorMapper.findByVideoId(videoActor.getVideoId());
        List<Actor> actors = null;
        if (byVideoId.size()==0){
            actors = actorService.queryAll();
        }else {
            actors = actorService.queryAllNot(videoActor.getVideoId());
        }
        model.addAttribute("actors",actors);
        return "video/videoUpdateActor";
    }
    @RequestMapping(value = "addVideoActor.do")
    public String addVideoActor(Model model, VideoActor videoActor){
        videoActorMapper.add(videoActor);
        model.addAttribute("videoActors",videoService.findActorById(videoActor.getVideoId()));
        List<VideoActor> byVideoId = videoActorMapper.findByVideoId(videoActor.getVideoId());
        List<Actor> actors = null;
        if (byVideoId.size()==0){
            actors = actorService.queryAll();
        }else {
            actors = actorService.queryAllNot(videoActor.getVideoId());
        }
        model.addAttribute("actors",actors);
        return "video/videoUpdateActor";
    }
    @RequestMapping(value = "goUpdateDirector.do")
    public String goUpdateDirector(Model model, Integer id) {
        model.addAttribute("videoDirectors", videoService.findDirectorId(id));
        List<VideoDirector> byVideoId = videoDirectorMapper.findByVideoId(id);
        List<Director> directors = null;
        if (byVideoId.size()==0){
            directors= directorService.queryAll();
        }else {
            directors= directorService.queryAllNot(id);
        }
        model.addAttribute("directors",directors );
        return "video/videoUpdateDirectors";
    }
    @RequestMapping(value = "deleteVideoDirector.do")
    public String deleteVideoDirector(Model model, VideoDirector videoDirector){
        videoDirectorMapper.deleteVideoDirector(videoDirector);
        model.addAttribute("videoDirectors", videoService.findDirectorId(videoDirector.getVideoId()));
        List<VideoDirector> byVideoId = videoDirectorMapper.findByVideoId(videoDirector.getVideoId());
        List<Director> directors = null;
        if (byVideoId.size()==0){
            directors= directorService.queryAll();
        }else {
            directors= directorService.queryAllNot(videoDirector.getVideoId());
        }
        model.addAttribute("directors",directors );
        return "video/videoUpdateDirectors";
    }
    @RequestMapping(value = "addVideoDirector.do")
    public String addVideoDirector(Model model, VideoDirector videoDirector){
        videoDirectorMapper.add(videoDirector);
        model.addAttribute("videoDirectors", videoService.findDirectorId(videoDirector.getVideoId()));
        List<VideoDirector> byVideoId = videoDirectorMapper.findByVideoId(videoDirector.getVideoId());
        List<Director> directors = null;
        if (byVideoId.size()==0){
            directors= directorService.queryAll();
        }else {
            directors= directorService.queryAllNot(videoDirector.getVideoId());
        }
        model.addAttribute("directors",directors );
        return "video/videoUpdateDirectors";
    }
    @RequestMapping(value = "goUpdate.do")
    public String goUpdate(Model model, Integer id){
        model.addAttribute("video",videoService.findById(id));
        model.addAttribute("molds",moldService.queryAll());
        model.addAttribute("areas",areaService.queryAll());
        return "video/videoUpdate";
    }
    @RequestMapping(value = "update.do",method = RequestMethod.POST)
    public String update(Model model, Video video, @RequestParam("file")MultipartFile file,HttpServletRequest request){
        videoService.update(video,file,request);
        model.addAttribute("videos",videoService.queryAllAndOthers());
        return "video/videoShow";
    }

}
