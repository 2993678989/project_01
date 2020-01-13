package com.zhiyou100.service.impl;

import com.zhiyou100.mapper.SpeakerMapper;
import com.zhiyou100.model.Speaker;
import com.zhiyou100.service.SpeakerService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author:li
 * @Date:2019/10/10 15:50
 */
@Service
public class SpeakerServiceImpl implements SpeakerService {
    @Resource
    private SpeakerMapper speakerMapper;
    @Override
    public List<Speaker> queryAll() {
        return speakerMapper.queryAll();
    }

    @Override
    public Speaker findById(Integer id) {
        return speakerMapper.findById(id);
    }

    @Override
    public int add(Speaker speaker) {
        return speakerMapper.add(speaker);
    }

    @Override
    public int deleteById(Integer id) {
        return speakerMapper.deleteById(id);
    }

    @Override
    public int update(Integer id, String state) {
        Speaker byId = speakerMapper.findById(id);
        if ("n".equals(state)) {
            byId.setStatus(2);
        }
        if ("y".equals(state)) {
            byId.setStatus(1);
        }
        return speakerMapper.update(byId);
    }

    @Override
    public List<Speaker> findQueryAll() {
        return speakerMapper.findQueryAll();
    }
}
