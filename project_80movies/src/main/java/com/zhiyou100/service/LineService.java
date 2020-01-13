package com.zhiyou100.service;

import com.zhiyou100.model.Director;
import com.zhiyou100.model.Line;

import java.util.List;

/**
 * @Author:li
 * @Date:2019/9/26 11:32
 */
public interface LineService {
    List<Line> queryAll();
    Line findById(Integer id);
    int add(Line line);
    int deleteById(Integer id);
    int update(Line line);
    Line findByName(String name);
}
