package com.zhiyou100.service.impl;

import com.github.pagehelper.PageHelper;
import com.zhiyou100.mapper.MessageMapper;
import com.zhiyou100.model.Message;
import com.zhiyou100.service.MessageService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author:li
 * @Date:2019/10/8 15:10
 */
@Service
public class MessageServiceImpl implements MessageService {
    @Resource
    private MessageMapper messageMapper;
    @Override
    public List<Message> queryAll() {

        List<Message> messages = messageMapper.queryAll();
        return messages;
    }

    @Override
    public Message findById(Integer id) {
        return messageMapper.findById(id);
    }

    @Override
    public int add(Message message) {
        return messageMapper.add(message);
    }

    @Override
    public int deleteById(Integer id) {
        return messageMapper.deleteById(id);
    }

    @Override
    public int update(Integer id,String state) {
        Message message = messageMapper.findById(id);
        if ("n".equals(state)){
            message.setStatus(2);
        }
        if ("y".equals(state)){
            message.setStatus(1);
        }
        return messageMapper.update(message);
    }

    @Override
    public Message findByName(String name) {
        return null;
    }

    @Override
    public List<Message> queryMessageAndUser(Integer page) {
        if (page == null){
            page=1;
        }
        PageHelper.startPage(page, 10);
        return messageMapper.queryMessageAndUser();
    }
}
