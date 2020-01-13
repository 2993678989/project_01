package com.zhiyou100.service.impl;

import com.zhiyou100.mapper.AdminMapper;
import com.zhiyou100.model.Admin;
import com.zhiyou100.model.ResponseVo;
import com.zhiyou100.service.AdminService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @Author:li
 * @Date:2019/9/27 19:23
 */
@Service
public class AdminServiceImpl implements AdminService {
    @Resource
    private AdminMapper adminMapper;

    @Override
    public Admin findById(Integer id) {
        return null;
    }

    @Override
    public int add(Admin admin) {
        int add = adminMapper.add(admin);
        return add;
    }

    @Override
    public int deleteById(Integer id) {
        int i = adminMapper.deleteById(id);
        return i;
    }

    @Override
    public int update(Admin admin) {
        int update = adminMapper.update(admin);
        return update;
    }

    @Override
    public Admin findByName(String name) {
        Admin byAccount = adminMapper.findByAccount(name);
        return byAccount;
    }

    @Override
    public ResponseVo<Admin> login(Admin admin) {
        ResponseVo<Admin> responseVo = new ResponseVo<>();
        Admin byAccount = adminMapper.findByAccount(admin.getAccount());
        if (byAccount!=null){
            if (admin.getPassword().equals(byAccount.getPassword())){
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
