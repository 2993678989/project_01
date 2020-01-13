package com.zhiyou100.model;

import java.util.List;

/**
 * @Author:li
 * @Date:2019/9/28 9:22
 * 地区
 */
public class Area {
    private Integer id;
    private String name;
    private Integer channelId;
    private List<Video> videos;
    private Channel channel;

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

    public List<Video> getVideos() {
        return videos;
    }

    public void setVideos(List<Video> videos) {
        this.videos = videos;
    }

    public Channel getChannel() {
        return channel;
    }

    public void setChannel(Channel channel) {
        this.channel = channel;
    }

    @Override
    public String toString() {
        return "Area{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", channelId=" + channelId +
                ", videos=" + videos +
                ", channel=" + channel +
                '}';
    }
}
