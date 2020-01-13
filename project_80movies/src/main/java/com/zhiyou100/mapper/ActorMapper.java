package com.zhiyou100.mapper;

import com.zhiyou100.model.Actor;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @Author:li
 * @Date:2019/9/26 11:26
 */
@Mapper
public interface ActorMapper extends BaseMapper<Actor> {
    Actor findByname(String account);
    List<Actor> queryAllNot(Integer id);
}
