package com.zhiyou100.service;

import com.zhiyou100.model.Actor;
import com.zhiyou100.model.Channel;

import java.util.List;

/**
 * @Author:li
 * @Date:2019/9/26 11:32
 */
public interface ChannelService {
    List<Channel> queryAll();
    Channel findById(Integer id);
    int add(Channel channel);
    int deleteById(Integer id);
    int update(Channel channel);
    Channel findByName(String name);
    List<Channel> queryChannelAreaMold();
    Channel queryChannelAreaMoldById(Integer id);
    List<Channel> findChannelAndMoldAndVideoAndActor();
    List<Channel> findChannelAndMoldAndVideoPlay();
    Channel selectVideoByChannelId(Integer id,Integer moldId,Integer areaId,Integer year);
}
