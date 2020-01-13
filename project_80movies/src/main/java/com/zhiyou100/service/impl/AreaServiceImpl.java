package com.zhiyou100.service.impl;

import com.zhiyou100.mapper.AreaMapper;
import com.zhiyou100.model.Area;
import com.zhiyou100.service.AreaService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author:li
 * @Date:2019/10/8 9:28
 */
@Service
public class AreaServiceImpl implements AreaService {
    @Resource
    private AreaMapper areaMapper;
    @Override
    public List<Area> queryAll() {
        return areaMapper.queryAll();
    }

    @Override
    public Area findById(Integer id) {
        return areaMapper.findById(id);
    }

    @Override
    public int add(Area area) {
        return areaMapper.add(area);
    }

    @Override
    public int deleteById(Integer id) {
        return areaMapper.deleteById(id);
    }

    @Override
    public int deleteByChannelId(Integer id) {
        return areaMapper.deleteByChannelId(id);
    }

    @Override
    public int update(Area area) {
        return areaMapper.update(area);
    }

    @Override
    public Area findByName(String name) {
        return null;
    }

    @Override
    public List<Area> queryAreaAndChannel() {
        return areaMapper.queryAreaAndChannel();
    }

    @Override
    public Area queryAreaAndChannelById(Integer id) {
        return areaMapper.queryAreaAndChannelById(id);
    }

    @Override
    public List<Area> findByChannelId(Integer channelId) {
        return areaMapper.findByChannelId(channelId);
    }
}
