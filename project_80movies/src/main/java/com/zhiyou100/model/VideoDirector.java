package com.zhiyou100.model;

/**
 * @Author:li
 * @Date:2019/9/28 9:41
 */
public class VideoDirector {
    private Integer id;
    private Integer videoId;
    private Integer directorId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getVideoId() {
        return videoId;
    }

    public void setVideoId(Integer videoId) {
        this.videoId = videoId;
    }

    public Integer getDirectorId() {
        return directorId;
    }

    public void setDirectorId(Integer directorId) {
        this.directorId = directorId;
    }

    @Override
    public String toString() {
        return "VideoDirector{" +
                "id=" + id +
                ", videoId=" + videoId +
                ", directorId=" + directorId +
                '}';
    }
}
