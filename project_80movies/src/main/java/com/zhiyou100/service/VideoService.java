package com.zhiyou100.service;

import com.zhiyou100.model.Video;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * @Author:li
 * @Date:2019/9/26 11:32
 */

public interface VideoService {
    List<Video> queryAll();
    Video findById(Integer id);
    int add(Video video, MultipartFile file, HttpServletRequest request);
    int deleteById(Integer id);
    int update(Video video, MultipartFile file,HttpServletRequest request);
    Video findByName(String name);
    List<Video> queryAllAndOthers();
    Video findActorById(Integer id);
    Video findDirectorId(Integer id);
    List<Video> likeVideo(Video video);

}
