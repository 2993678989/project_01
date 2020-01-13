package com.zhiyou100.service.impl;

import com.zhiyou100.mapper.ActorMapper;
import com.zhiyou100.model.Actor;
import com.zhiyou100.model.ResponseVo;
import com.zhiyou100.service.ActorService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author:li
 * @Date:2019/9/27 10:13
 */
@Service
public class ActorServiceImpl implements ActorService {
    @Resource
    private ActorMapper actorMapper;
    @Override
    public List<Actor> queryAll() {
        return actorMapper.queryAll();
    }

    @Override
    public Actor findById(Integer id) {
        return actorMapper.findById(id);
    }

    @Override
    public int add(Actor actor) {
        return actorMapper.add(actor);
    }

    @Override
    public int deleteById(Integer id) {
        return actorMapper.deleteById(id);
    }

    @Override
    public int update(Actor actor) {
        return actorMapper.update(actor);
    }

    @Override
    public Actor findByName(String name) {
        return null;
    }

    @Override
    public List<Actor> queryAllNot(Integer id) {
        return actorMapper.queryAllNot(id);
    }


}
