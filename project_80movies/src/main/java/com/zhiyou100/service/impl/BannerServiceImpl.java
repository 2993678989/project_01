package com.zhiyou100.service.impl;

import com.zhiyou100.mapper.BannerMapper;
import com.zhiyou100.model.Banner;
import com.zhiyou100.service.BannerService;
import com.zhiyou100.util.Picture;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.IOException;
import java.util.List;

/**
 * @Author:li
 * @Date:2019/10/8 9:21
 */
@Service
public class BannerServiceImpl implements BannerService {
    @Resource
    private BannerMapper bannerMapper;
    @Override
    public List<Banner> queryAll() {
        return bannerMapper.queryAll();
    }

    @Override
    public Banner findById(Integer id) {
        return bannerMapper.findById(id);
    }

    @Override
    public int add(Banner banner,MultipartFile file, HttpServletRequest request) {
        String picture = null;
        try {
            picture = Picture.picture(file, request,"image/banner/");
            banner.setPic(picture);
        } catch (Exception e) {
            e.printStackTrace();
        }
        banner.setPic(picture);
        bannerMapper.add(banner);
        return 0;
    }

    @Override
    public int deleteById(Integer id) {
        bannerMapper.deleteById(id);
        return 0;
    }

    @Override
    public int update(Banner banner,MultipartFile file, HttpServletRequest request) {
        String picture = null;
        try {
            picture = Picture.picture(file, request,"image/banner/");
            banner.setPic(picture);
        } catch (Exception e) {
            e.printStackTrace();
        }
        banner.setPic(picture);
        bannerMapper.update(banner);
        return 0;
    }

    @Override
    public Banner findByName(String name) {
        return null;
    }

    @Override
    public List<Banner> findVideo() {
        return bannerMapper.findVideo();
    }

    @Override
    public Banner findVideoById(Integer id) {
        return bannerMapper.findVideoById(id);
    }

}
