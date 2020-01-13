package com.zhiyou100.model;

/**
 * @Author:li
 * @Date:2019/9/28 9:40
 */
public class VideoActor {
    private Integer id;
    private Integer actorId;
    private Integer videoId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getActorId() {
        return actorId;
    }

    public void setActorId(Integer actorId) {
        this.actorId = actorId;
    }

    public Integer getVideoId() {
        return videoId;
    }

    public void setVideoId(Integer videoId) {
        this.videoId = videoId;
    }

    @Override
    public String toString() {
        return "VideoActor{" +
                "id=" + id +
                ", actorId=" + actorId +
                ", videoId=" + videoId +
                '}';
    }
}
