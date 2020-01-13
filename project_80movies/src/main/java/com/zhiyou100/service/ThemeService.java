package com.zhiyou100.service;

import com.zhiyou100.model.Hot;
import com.zhiyou100.model.Theme;
import com.zhiyou100.model.ThemeVideo;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * @Author:li
 * @Date:2019/9/26 11:32
 */

public interface ThemeService {
    List<Theme> queryAll();
    Theme findById(Integer id);
    int add(Theme theme, MultipartFile file, HttpServletRequest request);
    int deleteById(Integer id);
    int update(Theme theme, MultipartFile file, HttpServletRequest request);
    List<Theme> findQueryAll();
    Theme findQueryAllById(Integer id);
    Theme findCount(Integer id);
    int updateCount(Theme theme);
}
