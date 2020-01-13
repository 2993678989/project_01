package com.zhiyou100.mapper;

import com.zhiyou100.model.VideoActor;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @Author:li
 * @Date:2019/9/28 10:51
 */
@Mapper
public interface VideoActorMapper extends BaseMapper<VideoActor> {
    int deleteVideoActor(VideoActor videoActor);
    List<VideoActor> findByVideoId(Integer videoId);
}
