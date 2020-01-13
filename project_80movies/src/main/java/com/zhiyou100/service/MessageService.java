package com.zhiyou100.service;

import com.zhiyou100.model.Area;
import com.zhiyou100.model.Message;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author:li
 * @Date:2019/9/26 11:32
 */

public interface MessageService {
    List<Message> queryAll();
    Message findById(Integer id);
    int add(Message message);
    int deleteById(Integer id);
    int update(Integer id,String state);
    Message findByName(String name);
    List<Message> queryMessageAndUser(Integer page);

}
