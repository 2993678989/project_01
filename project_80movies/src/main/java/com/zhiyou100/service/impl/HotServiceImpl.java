package com.zhiyou100.service.impl;

import com.zhiyou100.mapper.HotMapper;
import com.zhiyou100.model.Hot;
import com.zhiyou100.service.HotService;
import com.zhiyou100.util.Picture;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * @Author:li
 * @Date:2019/10/10 16:28
 */
@Service
public class HotServiceImpl implements HotService {
    @Resource
    private HotMapper hotMapper;
    @Override
    public List<Hot> queryAll() {
        return hotMapper.queryAll();
    }

    @Override
    public Hot findById(Integer id) {
        return hotMapper.findById(id);
    }

    @Override
    public int add(Hot hot, MultipartFile file, HttpServletRequest request) {
        String picture = null;
        try {
            picture = Picture.picture(file, request, "image/hot/");
        } catch (Exception e) {
            e.printStackTrace();
        }
        hot.setCover(picture);
        return hotMapper.add(hot);
    }

    @Override
    public int deleteById(Integer id) {
        return hotMapper.deleteById(id);
    }

    @Override
    public int update(Hot hot,MultipartFile file, HttpServletRequest request) {
        String picture = null;
        try {
            picture = Picture.picture(file, request, "image/hot/");
        } catch (Exception e) {
            e.printStackTrace();
        }
        hot.setCover(picture);
        return hotMapper.update(hot);
    }

    @Override
    public List<Hot> findQueryAll() {
        return hotMapper.findQueryAll();
    }

    @Override
    public Hot findQueryAllById(Integer id) {
        return hotMapper.findQueryAllById(id);
    }
}
