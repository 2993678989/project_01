package com.zhiyou100.mapper;

import com.zhiyou100.model.Mold;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @Author:li
 * @Date:2019/9/28 10:51
 */
@Mapper
public interface MoldMapper extends BaseMapper<Mold> {
    int deleteByChannelId(Integer id);
    List<Mold> findMoldChannel();
    List<Mold> findByChannelId(Integer channelId);
    Mold findMoldChannelById(Integer id);
}
