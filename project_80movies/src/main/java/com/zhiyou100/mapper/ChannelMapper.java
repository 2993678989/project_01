package com.zhiyou100.mapper;

import com.zhiyou100.model.Channel;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Author:li
 * @Date:2019/9/28 10:51
 */
@Mapper
public interface ChannelMapper extends BaseMapper<Channel> {
        List<Channel> queryChannelAreaMold();
        Channel selectVideoByChannelId(@Param("id")Integer id,@Param("moldId")Integer moldId,@Param("areaId")Integer areaId,@Param("year")Integer year);
        List<Channel> findChannelAndMoldAndVideoPlay();
        List<Channel> findChannelAndMoldAndVideoAndActor();
        Channel queryChannelAreaMoldById(Integer id);
}
