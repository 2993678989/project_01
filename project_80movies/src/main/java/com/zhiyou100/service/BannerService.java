package com.zhiyou100.service;

import com.zhiyou100.model.Banner;
import com.zhiyou100.model.Video;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * @Author:li
 * @Date:2019/9/26 11:32
 */

public interface BannerService {
    List<Banner> queryAll();
    Banner findById(Integer id);
    int add(Banner banner,MultipartFile file, HttpServletRequest request);
    int deleteById(Integer id);
    int update(Banner banner,MultipartFile file, HttpServletRequest request);
    Banner findByName(String name);
    List<Banner> findVideo();
    Banner findVideoById(Integer id);
}
