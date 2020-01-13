package com.zhiyou100.mapper;

import com.zhiyou100.model.Video;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @Author:li
 * @Date:2019/9/26 11:26
 */
@Mapper
public interface VideoMapper extends BaseMapper<Video> {
    Video findByName(String name);
    List<Video> queryAllAndOthers();
    Video findActorById(Integer id);
    Video findDirectorId(Integer id);
    List<Video> likeVideo(Video video);
}
