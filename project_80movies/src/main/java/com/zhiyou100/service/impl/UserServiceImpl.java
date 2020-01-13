package com.zhiyou100.service.impl;

import com.zhiyou100.mapper.UserMapper;
import com.zhiyou100.model.ResponseVo;
import com.zhiyou100.model.User;
import com.zhiyou100.service.UserService;
import com.zhiyou100.util.Picture;
import org.springframework.stereotype.Service;
import org.springframework.util.DigestUtils;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.IOException;
import java.util.List;

/**
 * @Author:li
 * @Date:2019/9/27 15:58
 */
@Service
public class UserServiceImpl implements UserService {
    private final int length = 5;
    private final String salt = "80movies";
    @Resource
    private UserMapper userMapper;

    @Override
    public ResponseVo<List<User>> queryAll() {
        ResponseVo<List<User>> responseVo = new ResponseVo<>();
        List<User> users = null;
        try {
            users = userMapper.queryAll();
        } catch (Exception e) {
            responseVo.setCode(400);
            responseVo.setMsg("查询失败");
            return responseVo;
        }
        responseVo.setCode(200);
        responseVo.setMsg("查询成功");
        responseVo.setData(users);
        return responseVo;
    }

    @Override
    public ResponseVo<User> findById(Integer id) {
        ResponseVo<User> responseVo = new ResponseVo<>();
        if (id==null){
            responseVo.setCode(400);
            responseVo.setMsg("查询失败,id为空");
            return responseVo;
        }
        User byId = null;
        try {
            byId = userMapper.findById(id);
        } catch (Exception e) {
            responseVo.setCode(400);
            responseVo.setMsg("查询失败");
            return responseVo;
        }
        if (byId!=null){
            responseVo.setCode(200);
            responseVo.setMsg("查询成功");
            responseVo.setData(byId);
            return responseVo;
        }
        responseVo.setCode(400);
        responseVo.setMsg("查询失败,id不存在");
        return responseVo;
    }

    @Override
    public ResponseVo<Object> add(User user, MultipartFile file, HttpServletRequest request) {
        ResponseVo<Object> responseVo = new ResponseVo<>();
        if (user.getAccount()==null||user.getAccount().length()<length){
            responseVo.setCode(400);
            responseVo.setMsg("添加失败,账号长度不能小于5");
            return responseVo;
        }
        if (user.getPassword()==null||user.getPassword().length()<length){
            responseVo.setCode(400);
            responseVo.setMsg("添加失败,密码长度不能小于5");
            return responseVo;
        }
        user.setHeader(Picture.picture(file,request,"image/"));
        String pass = user.getPassword()+salt;
        user.setPassword(DigestUtils.md5DigestAsHex(pass.getBytes()));
        int add = 0;
        try {
            add = userMapper.add(user);
        } catch (Exception e) {
            responseVo.setCode(400);
            responseVo.setMsg("添加失败,账号已存在");
            return responseVo;
        }
        if (add==1){
            responseVo.setCode(200);
            responseVo.setMsg("添加成功");
            return responseVo;
        }
        responseVo.setCode(400);
        responseVo.setMsg("添加失败,未知错误2");
        return responseVo;
    }

    @Override
    public ResponseVo<Object> deleteById(Integer id) {
        ResponseVo<Object> responseVo = new ResponseVo<>();
        if (id==null){
            responseVo.setCode(400);
            responseVo.setMsg("删除失败,id为空");
            return responseVo;
        }
        int i = 0;
        try {
            i = userMapper.deleteById(id);
        } catch (Exception e) {
            responseVo.setCode(400);
            responseVo.setMsg("删除失败,未知错误1");
            return responseVo;
        }
        if (i==1){
            responseVo.setCode(200);
            responseVo.setMsg("删除成功");
            return responseVo;
        }
        responseVo.setCode(400);
        responseVo.setMsg("添加失败,未知错误2");
        return responseVo;
    }

    @Override
    public ResponseVo<Object> update(User user, MultipartFile file, HttpServletRequest request) {
        ResponseVo<Object> responseVo = new ResponseVo<>();
        if(user.getId()==null){
            responseVo.setCode(400);
            responseVo.setMsg("修改失败,id为空");
            return responseVo;
        }
        if(user.getPassword()==null||user.getPassword().length()<length){
            responseVo.setCode(400);
            responseVo.setMsg("修改失败,密码长度不能小于5");
            return responseVo;
        }
        user.setHeader(Picture.picture(file,request,"image/"));
        String pass = user.getPassword()+salt;
        user.setPassword(DigestUtils.md5DigestAsHex(pass.getBytes()));
        int update = 0;
        try {
            update = userMapper.update(user);
        } catch (Exception e) {
            responseVo.setCode(400);
            responseVo.setMsg("修改失败,未知错误1");
            return responseVo;
        }
        if (update==1){
            responseVo.setCode(200);
            responseVo.setMsg("修改成功");
            return responseVo;
        }
        responseVo.setCode(400);
        responseVo.setMsg("修改失败,未知错误2");
        return responseVo;
    }

    @Override
    public ResponseVo<User> findByAccount(String account) {
        ResponseVo<User> responseVo = new ResponseVo<>();
        if (account==null||account.length()==0){
            responseVo.setCode(400);
            responseVo.setMsg("查询失败,name为空");
            return responseVo;
        }
        User byName = null;
        try {
            byName = userMapper.findByAccount(account);
        } catch (Exception e) {
            responseVo.setCode(400);
            responseVo.setMsg("查询失败");
            return responseVo;
        }
        if (byName!=null){
            responseVo.setCode(200);
            responseVo.setMsg("查询成功");
            responseVo.setData(byName);
            return responseVo;
        }
        responseVo.setCode(400);
        responseVo.setMsg("查询失败,name不存在");
        return responseVo;
    }

    @Override
    public ResponseVo<User> login(User user) {
        ResponseVo<User> responseVo = new ResponseVo<>();
        User byAccount = userMapper.findByAccount(user.getAccount());
        if (byAccount!=null){
            String pass = user.getPassword()+salt;
            user.setPassword(DigestUtils.md5DigestAsHex(pass.getBytes()));
            System.out.println(user.getPassword());
            if (user.getPassword().equals(byAccount.getPassword())){
                responseVo.setCode(200);
                responseVo.setMsg("登陆成功");
                responseVo.setData(byAccount);
                return responseVo;
            }
            responseVo.setCode(400);
            responseVo.setMsg("密码错误");
            return responseVo;
        }
        responseVo.setCode(400);
        responseVo.setMsg("账号不存在");
        return responseVo;
    }

}
