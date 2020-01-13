package com.zhiyou100.service;

import com.zhiyou100.model.Message;
import com.zhiyou100.model.Speaker;

import java.util.List;

/**
 * @Author:li
 * @Date:2019/9/26 11:32
 */

public interface SpeakerService {
    List<Speaker> queryAll();
    Speaker findById(Integer id);
    int add(Speaker speaker);
    int deleteById(Integer id);
    int update(Integer id, String state);
    List<Speaker> findQueryAll();

}
