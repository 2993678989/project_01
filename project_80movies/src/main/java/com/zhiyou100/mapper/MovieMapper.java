package com.zhiyou100.mapper;

import com.zhiyou100.model.Movie;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @Author:li
 * @Date:2019/9/28 10:51
 */
@Mapper
public interface MovieMapper extends BaseMapper<Movie> {
        List<Movie> findQueryAll();
        Movie findQueryAllById(Integer id);
}
