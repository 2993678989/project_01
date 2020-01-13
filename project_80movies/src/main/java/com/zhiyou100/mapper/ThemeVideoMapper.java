package com.zhiyou100.mapper;

import com.zhiyou100.model.ThemeVideo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @Author:li
 * @Date:2019/9/28 10:51
 */
@Mapper
public interface ThemeVideoMapper extends BaseMapper<ThemeVideo> {
    int deleteByThemeVideo(ThemeVideo themeVideo);
    int deleteByVideoId(Integer videoId);
    List<ThemeVideo> findByThemeId(Integer themeId);
}
