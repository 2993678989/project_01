package com.zhiyou100.service;

import com.zhiyou100.model.ResponseVo;
import com.zhiyou100.model.User;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * @Author:li
 * @Date:2019/9/26 11:32
 */

public interface UserService {
    ResponseVo<List<User>> queryAll();
    ResponseVo<User> findById(Integer id);
    ResponseVo<Object> add(User user, MultipartFile file, HttpServletRequest request);
    ResponseVo<Object> deleteById(Integer id);
    ResponseVo<Object> update(User user, MultipartFile file, HttpServletRequest request);
    ResponseVo<User> findByAccount(String account);
    ResponseVo<User> login(User user);
}
