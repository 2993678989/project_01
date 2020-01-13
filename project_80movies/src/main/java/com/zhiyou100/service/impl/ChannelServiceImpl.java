package com.zhiyou100.service.impl;

import com.zhiyou100.mapper.AreaMapper;
import com.zhiyou100.mapper.ChannelMapper;
import com.zhiyou100.mapper.MoldMapper;
import com.zhiyou100.model.Channel;
import com.zhiyou100.service.ChannelService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author:li
 * @Date:2019/9/29 10:54
 */
@Service
public class ChannelServiceImpl implements ChannelService {
    @Resource
    private ChannelMapper channelMapper;
    @Resource
    private AreaMapper areaMapper;
    @Resource
    private MoldMapper moldMapper;
    @Override
    public List<Channel> queryAll() {
        return channelMapper.queryAll();
    }

    @Override
    public Channel findById(Integer id) {
        return null;
    }

    @Override
    public int add(Channel channel) {
        return channelMapper.add(channel);
    }

    @Override
    public int deleteById(Integer id) {
        channelMapper.deleteById(id);
        areaMapper.deleteByChannelId(id);
        moldMapper.deleteByChannelId(id);
        return 0;
    }

    @Override
    public int update(Channel channel) {
        return channelMapper.update(channel);
    }

    @Override
    public Channel findByName(String name) {
        return null;
    }

    @Override
    public List<Channel> queryChannelAreaMold() {
        return channelMapper.queryChannelAreaMold();
    }

    @Override
    public Channel queryChannelAreaMoldById(Integer id) {
        return channelMapper.queryChannelAreaMoldById(id);
    }

    @Override
    public List<Channel> findChannelAndMoldAndVideoAndActor() {
        return channelMapper.findChannelAndMoldAndVideoAndActor();
    }

    @Override
    public List<Channel> findChannelAndMoldAndVideoPlay() {
        return channelMapper.findChannelAndMoldAndVideoPlay();
    }

    @Override
    public Channel selectVideoByChannelId(Integer id,Integer moldId,Integer areaId,Integer year) {
        return channelMapper.selectVideoByChannelId(id,moldId,areaId,year);
    }
}
