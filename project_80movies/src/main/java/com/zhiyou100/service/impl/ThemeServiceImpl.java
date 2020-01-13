package com.zhiyou100.service.impl;

import com.zhiyou100.mapper.ThemeMapper;
import com.zhiyou100.mapper.ThemeVideoMapper;
import com.zhiyou100.model.Theme;
import com.zhiyou100.model.ThemeVideo;
import com.zhiyou100.service.ThemeService;
import com.zhiyou100.util.Picture;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * @Author:li
 * @Date:2019/10/10 20:50
 */
@Service
public class ThemeServiceImpl implements ThemeService {
    @Resource
    private ThemeMapper themeMapper;
    @Resource
    private ThemeVideoMapper themeVideoMapper;
    @Override
    public List<Theme> queryAll() {
        return themeMapper.queryAll();
    }

    @Override
    public Theme findById(Integer id) {
        return themeMapper.findById(id);
    }

    @Override
    public int add(Theme theme, MultipartFile file, HttpServletRequest request) {
        String picture = null;
        try {
            picture = Picture.picture(file, request, "image/theme/");
        } catch (Exception e) {
            e.printStackTrace();
        }
        theme.setCover(picture);
        return themeMapper.add(theme);
    }

    @Override
    public int deleteById(Integer id) {
        themeVideoMapper.deleteByVideoId(id);
        themeMapper.deleteById(id);
        return 0;
    }

    @Override
    public int update(Theme theme, MultipartFile file, HttpServletRequest request) {
        String picture = null;
        try {
            picture = Picture.picture(file, request, "image/theme/");
        } catch (Exception e) {
            e.printStackTrace();
        }
        theme.setCover(picture);
        System.out.println(theme.getName());
        return themeMapper.update(theme);
    }

    @Override
    public List<Theme> findQueryAll() {
        return themeMapper.findQueryAll();
    }

    @Override
    public Theme findQueryAllById(Integer id) {
        return themeMapper.findQueryAllById(id);
    }

    @Override
    public Theme findCount(Integer id) {
        return themeMapper.findCount(id);
    }

    @Override
    public int updateCount(Theme theme) {
        return themeMapper.updateCount(theme);
    }

}
