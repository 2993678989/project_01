package com.zhiyou100.service.impl;

import com.zhiyou100.mapper.ThemeVideoMapper;
import com.zhiyou100.model.ThemeVideo;
import com.zhiyou100.service.ThemeVideoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author:li
 * @Date:2019/10/11 9:12
 */
@Service
public class ThemeVideoServiceImpl implements ThemeVideoService {
    @Resource
    private ThemeVideoMapper themeVideoMapper;
    @Override
    public List<ThemeVideo> queryAll() {
        return themeVideoMapper.queryAll();
    }

    @Override
    public ThemeVideo findById(Integer id) {
        return themeVideoMapper.findById(id);
    }

    @Override
    public int add(ThemeVideo themeVideo) {
        return themeVideoMapper.add(themeVideo);
    }

    @Override
    public int deleteById(Integer id) {
        return themeVideoMapper.deleteById(id);
    }

    @Override
    public int update(ThemeVideo themeVideo) {
        return themeVideoMapper.update(themeVideo);
    }

    @Override
    public int deleteByThemeVideo(ThemeVideo themeVideo) {
        return themeVideoMapper.deleteByThemeVideo(themeVideo);
    }


    @Override
    public List<ThemeVideo> findByThemeId(Integer themeId) {
        return themeVideoMapper.findByThemeId(themeId);
    }

    @Override
    public int deleteByVideoId(Integer videoId) {
        return themeVideoMapper.deleteByVideoId(videoId);
    }
}
