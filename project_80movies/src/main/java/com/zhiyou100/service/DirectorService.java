package com.zhiyou100.service;

import com.zhiyou100.model.Actor;
import com.zhiyou100.model.Director;

import java.util.List;

/**
 * @Author:li
 * @Date:2019/9/26 11:32
 */
public interface DirectorService {
    List<Director> queryAll();
    Director findById(Integer id);
    int add(Director director);
    int deleteById(Integer id);
    int update(Director director);
    Director findByName(String name);
    List<Director> queryAllNot(Integer id);
}
