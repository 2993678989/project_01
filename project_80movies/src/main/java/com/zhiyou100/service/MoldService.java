package com.zhiyou100.service;

import com.zhiyou100.model.Actor;
import com.zhiyou100.model.Mold;

import java.util.List;

/**
 * @Author:li
 * @Date:2019/9/26 11:32
 */

public interface MoldService {
    List<Mold> queryAll();
    Mold findById(Integer id);
    int add(Mold mold);
    int deleteById(Integer id);
    int deleteByChannelId(Integer id);
    int update(Mold mold);
    Mold findByName(String name);
    List<Mold> findMoldChannel();
    Mold findMoldChannelById(Integer id);
    List<Mold> findByChannelId(Integer channelId);
}
