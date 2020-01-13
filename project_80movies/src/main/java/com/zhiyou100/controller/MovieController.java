package com.zhiyou100.controller;

import com.zhiyou100.model.Movie;
import com.zhiyou100.model.Video;
import com.zhiyou100.service.LineService;
import com.zhiyou100.service.MoldService;
import com.zhiyou100.service.MovieService;
import com.zhiyou100.service.VideoService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

/**
 * @Author:li
 * @Date:2019/10/9 21:24
 */
@Controller
@RequestMapping("movieController")
public class MovieController {
    @Resource
    private MovieService movieService;
    @Resource
    private VideoService videoService;
    @Resource
    private LineService lineService;
    @Resource
    private MoldService moldService;
    @RequestMapping("findQueryAll.do")
    public String findQueryAll(Model model){
        model.addAttribute("movies",movieService.findQueryAll());
        return "movie/movieShow";
    }
    @RequestMapping("goAdd.do")
    public String goAdd(Model model){
        model.addAttribute("lines",lineService.queryAll());
        model.addAttribute("molds",moldService.queryAll());
        return "movie/movieAdd";
    }
    @RequestMapping("selectVideo.do")
    public String selectVideo(Model model, Video video){
        model.addAttribute("videos",videoService.likeVideo(video));
        model.addAttribute("lines",lineService.queryAll());
        model.addAttribute("molds",moldService.queryAll());
        return "movie/movieAdd";
    }
    @RequestMapping("addMovie.do")
    public String addMovie(Movie movie){
        movieService.add(movie);
        return "forward:findQueryAll.do";
    }
    @RequestMapping("deleteMovie.do")
    public String deleteMovie(Integer id){
        movieService.deleteById(id);
        return "forward:findQueryAll.do";
    }
    @RequestMapping("goUpdate.do")
    public String goUpdate(Model model,Integer id){
        model.addAttribute("lines",lineService.queryAll());
        model.addAttribute("molds",moldService.queryAll());
        model.addAttribute("movie",movieService.findQueryAllById(id));
        return "movie/movieUpdate";
    }
    @RequestMapping("selectVideoUpdate.do")
    public String selectVideoUpdate(Model model, Video video,Integer movieId){
        model.addAttribute("videos",videoService.likeVideo(video));
        model.addAttribute("lines",lineService.queryAll());
        model.addAttribute("molds",moldService.queryAll());
        model.addAttribute("movie",movieService.findQueryAllById(movieId));
        return "movie/movieUpdate";
    }
    @RequestMapping("updateMovie.do")
    public String updateMovie(Movie movie){
        movieService.update(movie);
        return "forward:findQueryAll.do";
    }

}
