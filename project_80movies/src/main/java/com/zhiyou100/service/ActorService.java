package com.zhiyou100.service;

import com.zhiyou100.model.Actor;

import java.util.List;

/**
 * @Author:li
 * @Date:2019/9/26 11:32
 */
public interface ActorService {
    List<Actor> queryAll();
    Actor findById(Integer id);
    int add(Actor actor);
    int deleteById(Integer id);
    int update(Actor actor);
    Actor findByName(String name);
    List<Actor> queryAllNot(Integer id);
}
