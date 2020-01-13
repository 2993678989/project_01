package com.zhiyou100.model;

import java.util.List;

/**
 * @Author:li
 * @Date:2019/9/28 9:23
 * 首页轮播图
 */
public class Banner {
    private Integer id;
    private String pic;
    private Integer videoId;
    private Video video;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic;
    }

    public Integer getVideoId() {
        return videoId;
    }

    public void setVideoId(Integer videoId) {
        this.videoId = videoId;
    }

    public Video getVideo() {
        return video;
    }

    public void setVideo(Video video) {
        this.video = video;
    }

    @Override
    public String toString() {
        return "Banner{" +
                "id=" + id +
                ", pic='" + pic + '\'' +
                ", videoId=" + videoId +
                ", video=" + video +
                '}';
    }
}
