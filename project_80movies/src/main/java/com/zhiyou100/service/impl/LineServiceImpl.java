package com.zhiyou100.service.impl;

import com.zhiyou100.mapper.DirectorMapper;
import com.zhiyou100.mapper.LineMapper;
import com.zhiyou100.model.Director;
import com.zhiyou100.model.Line;
import com.zhiyou100.service.DirectorService;
import com.zhiyou100.service.LineService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author:li
 * @Date:2019/9/27 10:13
 */
@Service
public class LineServiceImpl implements LineService {
    @Resource
    private LineMapper lineMapper;

    @Override
    public List<Line> queryAll() {
        return lineMapper.queryAll();
    }

    @Override
    public Line findById(Integer id) {
        return lineMapper.findById(id);
    }

    @Override
    public int add(Line line) {
        return lineMapper.add(line);
    }

    @Override
    public int deleteById(Integer id) {
        return lineMapper.deleteById(id);
    }

    @Override
    public int update(Line line) {
        return lineMapper.update(line);
    }

    @Override
    public Line findByName(String name) {
        return null;
    }
}
