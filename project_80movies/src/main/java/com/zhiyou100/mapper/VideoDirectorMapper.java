package com.zhiyou100.mapper;

import com.zhiyou100.model.Video;
import com.zhiyou100.model.VideoDirector;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @Author:li
 * @Date:2019/9/26 11:26
 */
@Mapper
public interface VideoDirectorMapper extends BaseMapper<VideoDirector> {
    int deleteVideoDirector(VideoDirector videoDirector);
    List<VideoDirector> findByVideoId(Integer videoId);
}
