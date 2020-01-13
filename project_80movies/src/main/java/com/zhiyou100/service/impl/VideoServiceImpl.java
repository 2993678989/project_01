package com.zhiyou100.service.impl;

import com.zhiyou100.mapper.ActorMapper;
import com.zhiyou100.mapper.VideoMapper;
import com.zhiyou100.model.Actor;
import com.zhiyou100.model.User;
import com.zhiyou100.model.Video;
import com.zhiyou100.service.ActorService;
import com.zhiyou100.service.VideoService;
import com.zhiyou100.util.Picture;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.IOException;
import java.util.List;

/**
 * @Author:li
 * @Date:2019/9/27 10:13
 */
@Service
public class VideoServiceImpl implements VideoService {
    @Resource
    private VideoMapper videoMapper;

    @Override
    public List<Video> queryAll() {
        return videoMapper.queryAll();
    }

    @Override
    public Video findById(Integer id) {
        return videoMapper.findById(id);
    }

    @Override
    public int add(Video video,MultipartFile file,HttpServletRequest request) {
        String picture = null;
        try {
            picture = Picture.picture(file, request,"image/video/");
            video.setCover(picture);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return videoMapper.add(video);
    }

    @Override
    public int deleteById(Integer id) {
        return videoMapper.deleteById(id);
    }

    @Override
    public int update(Video video,MultipartFile file,HttpServletRequest request) {
        String picture = null;
        try {
            picture = Picture.picture(file, request,"image/video/");
            video.setCover(picture);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return videoMapper.update(video);
    }

    @Override
    public Video findByName(String name) {
        return null;
    }

    @Override
    public List<Video> queryAllAndOthers() {
        return videoMapper.queryAllAndOthers();
    }

    @Override
    public Video findActorById(Integer id) {
        return videoMapper.findActorById(id);
    }

    @Override
    public Video findDirectorId(Integer id) {
        return videoMapper.findDirectorId(id);
    }

    @Override
    public List<Video> likeVideo(Video video) {
        return videoMapper.likeVideo(video);
    }

}
