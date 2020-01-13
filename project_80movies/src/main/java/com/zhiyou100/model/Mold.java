package com.zhiyou100.model;

import java.util.List;

/**
 * @Author:li
 * @Date:2019/9/28 9:32
 * 分类
 */
public class Mold {
    private Integer id;
    private String name;
    private Integer channelId;
    private Channel channels;
    private List<Video> videos;

    @Override
    public String toString() {
        return "Mold{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", channelId=" + channelId +
                ", channels=" + channels +
                ", videos=" + videos +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getChannelId() {
        return channelId;
    }

    public void setChannelId(Integer channelId) {
        this.channelId = channelId;
    }

    public Channel getChannels() {
        return channels;
    }

    public void setChannels(Channel channels) {
        this.channels = channels;
    }

    public List<Video> getVideos() {
        return videos;
    }

    public void setVideos(List<Video> videos) {
        this.videos = videos;
    }
}
