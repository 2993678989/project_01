package com.zhiyou100.mapper;

import com.zhiyou100.model.Area;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @Author:li
 * @Date:2019/9/28 10:51
 */
@Mapper
public interface AreaMapper extends BaseMapper<Area> {
    int deleteByChannelId(Integer id);
    List<Area> queryAreaAndChannel();
    List<Area> findByChannelId(Integer channelId);
    Area queryAreaAndChannelById(Integer id);
}
