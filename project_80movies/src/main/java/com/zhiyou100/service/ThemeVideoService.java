package com.zhiyou100.service;

import com.zhiyou100.model.ThemeVideo;

import java.util.List;

/**
 * @Author:li
 * @Date:2019/10/11 9:09
 */
public interface ThemeVideoService {
    List<ThemeVideo> queryAll();
    ThemeVideo findById(Integer id);
    int add(ThemeVideo themeVideo);
    int deleteById(Integer id);
    int update(ThemeVideo themeVideo);
    int deleteByThemeVideo(ThemeVideo themeVideo);
    List<ThemeVideo> findByThemeId(Integer themeId);
    int deleteByVideoId(Integer videoId);
}
