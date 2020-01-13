package com.zhiyou100.service;

import com.zhiyou100.model.Area;
import com.zhiyou100.model.Video;

import java.util.List;

/**
 * @Author:li
 * @Date:2019/9/26 11:32
 */

public interface AreaService {
    List<Area> queryAll();
    Area findById(Integer id);
    int add(Area area);
    int deleteById(Integer id);
    int deleteByChannelId(Integer id);
    int update(Area area);
    Area findByName(String name);
    List<Area> queryAreaAndChannel();
    Area queryAreaAndChannelById(Integer id);
    List<Area> findByChannelId(Integer channelId);

}
