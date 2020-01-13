package com.zhiyou100.mapper;

import com.zhiyou100.model.Hot;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @Author:li
 * @Date:2019/9/28 10:51
 */
@Mapper
public interface HotMapper extends BaseMapper<Hot> {
    List<Hot> findQueryAll();
    Hot findQueryAllById(Integer id);
}
