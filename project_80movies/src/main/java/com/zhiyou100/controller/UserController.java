package com.zhiyou100.controller;

import com.zhiyou100.model.ResponseVo;
import com.zhiyou100.model.User;
import com.zhiyou100.service.UserService;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * @Author:li
 * @Date:2019/9/26 11:40
 */
@RestController
@RequestMapping("userController")
public class UserController {
    @Resource
    private UserService userService;
    @RequestMapping(value = "queryAll.do",method = RequestMethod.GET)
    public ResponseVo<List<User>> queryAll(){
        ResponseVo<List<User>> queryAll = userService.queryAll();
        return queryAll;
    }
    @RequestMapping(value = "findById.do",method = RequestMethod.POST)
    public ResponseVo<User> findById(Integer id){
        ResponseVo<User> byId = userService.findById(id);
        return byId;
    }
    @RequestMapping(value = "findByName.do",method = RequestMethod.POST)
    public ResponseVo<User> findByName(String name){
        ResponseVo<User> byName = userService.findByAccount(name);
        return byName;
    }
    @RequestMapping(value = "add.do",method = RequestMethod.POST)
    public ResponseVo<Object> add(User user, @RequestParam("file")MultipartFile file, HttpServletRequest request){
        ResponseVo<Object> add = userService.add(user,file,request);
        return add;
    }
    @RequestMapping(value = "deleteById.do",method = RequestMethod.POST)
    public ResponseVo<Object> deleteById(Integer id){
        ResponseVo<Object> deleteById = userService.deleteById(id);
        return deleteById;
    }
    @RequestMapping(value = "update.do",method = RequestMethod.POST)
    public ResponseVo<Object> update(User user,@RequestParam("file")MultipartFile file, HttpServletRequest request){
        ResponseVo<Object> update = userService.update(user,file,request);
        return update;
    }
    @RequestMapping(value = "login.do",method = RequestMethod.POST)
    public ResponseVo<User> login(User user){
        ResponseVo<User> login = userService.login(user);
        return login;
    }
}
