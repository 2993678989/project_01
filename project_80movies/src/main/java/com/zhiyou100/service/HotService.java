package com.zhiyou100.service;

import com.zhiyou100.model.Hot;
import com.zhiyou100.model.Movie;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * @Author:li
 * @Date:2019/9/26 11:32
 */

public interface HotService {
    List<Hot> queryAll();
    Hot findById(Integer id);
    int add(Hot hot, MultipartFile file, HttpServletRequest request);
    int deleteById(Integer id);
    int update(Hot hot,MultipartFile file, HttpServletRequest request);
    List<Hot> findQueryAll();
    Hot findQueryAllById(Integer id);
}
