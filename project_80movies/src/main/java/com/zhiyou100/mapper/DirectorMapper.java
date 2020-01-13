package com.zhiyou100.mapper;

import com.zhiyou100.model.Actor;
import com.zhiyou100.model.Director;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @Author:li
 * @Date:2019/9/28 10:51
 */
@Mapper
public interface DirectorMapper extends BaseMapper<Director> {
    List<Director> queryAllNot(Integer id);
}
