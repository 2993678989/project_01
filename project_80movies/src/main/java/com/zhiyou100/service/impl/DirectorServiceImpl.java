package com.zhiyou100.service.impl;

import com.zhiyou100.mapper.ActorMapper;
import com.zhiyou100.mapper.DirectorMapper;
import com.zhiyou100.model.Actor;
import com.zhiyou100.model.Director;
import com.zhiyou100.service.ActorService;
import com.zhiyou100.service.DirectorService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author:li
 * @Date:2019/9/27 10:13
 */
@Service
public class DirectorServiceImpl implements DirectorService {
    @Resource
    private DirectorMapper directorMapper;

    @Override
    public List<Director> queryAll() {
        return directorMapper.queryAll();
    }

    @Override
    public Director findById(Integer id) {
        return directorMapper.findById(id);
    }

    @Override
    public int add(Director director) {
        return directorMapper.add(director);
    }

    @Override
    public int deleteById(Integer id) {
        return directorMapper.deleteById(id);
    }

    @Override
    public int update(Director director) {
        return directorMapper.update(director);
    }

    @Override
    public Director findByName(String name) {
        return null;
    }

    @Override
    public List<Director> queryAllNot(Integer id) {
        return directorMapper.queryAllNot(id);
    }
}
