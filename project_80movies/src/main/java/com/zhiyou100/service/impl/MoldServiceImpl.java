package com.zhiyou100.service.impl;

import com.zhiyou100.mapper.MoldMapper;
import com.zhiyou100.model.Mold;
import com.zhiyou100.service.MoldService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author:li
 * @Date:2019/9/29 16:05
 */
@Service
public class MoldServiceImpl implements MoldService {
    @Resource
    private MoldMapper moldMapper;
    @Override
    public List<Mold> queryAll() {
        return moldMapper.queryAll();
    }

    @Override
    public Mold findById(Integer id) {
        return moldMapper.findById(id);
    }

    @Override
    public int add(Mold mold) {
        moldMapper.add(mold);
        return 0;
    }

    @Override
    public int deleteById(Integer id) {
        moldMapper.deleteById(id);
        return 0;
    }

    @Override
    public int deleteByChannelId(Integer id) {
        return moldMapper.deleteByChannelId(id);
    }

    @Override
    public int update(Mold mold) {
        moldMapper.update(mold);
        return 0;
    }

    @Override
    public Mold findByName(String name) {
        return null;
    }

    @Override
    public List<Mold> findMoldChannel() {
        return moldMapper.findMoldChannel();
    }

    @Override
    public Mold findMoldChannelById(Integer id) {
        return moldMapper.findMoldChannelById(id);
    }

    @Override
    public List<Mold> findByChannelId(Integer channelId) {
        return moldMapper.findByChannelId(channelId);
    }
}
