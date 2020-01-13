package com.zhiyou100.mapper;

import com.zhiyou100.model.Theme;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @Author:li
 * @Date:2019/9/28 10:51
 */
@Mapper
public interface ThemeMapper extends BaseMapper<Theme>{
    List<Theme> findQueryAll();
    Theme findQueryAllById(Integer id);
    Theme findCount(Integer id);
    int updateCount(Theme theme);
}
