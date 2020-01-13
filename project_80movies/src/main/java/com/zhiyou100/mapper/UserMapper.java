package com.zhiyou100.mapper;

import com.zhiyou100.model.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * @Author:li
 * @Date:2019/9/26 11:26
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {
    User findByAccount(String account);
}
