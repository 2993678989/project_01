package com.zhiyou100.model;

/**
 * @Author:li
 * @Date:2019/9/28 9:39
 */
public class ThemeVideo {
    private Integer id;
    private Integer themeId;
    private Integer videoId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getThemeId() {
        return themeId;
    }

    public void setThemeId(Integer themeId) {
        this.themeId = themeId;
    }

    public Integer getVideoId() {
        return videoId;
    }

    public void setVideoId(Integer videoId) {
        this.videoId = videoId;
    }

    public ThemeVideo(Integer id, Integer themeId, Integer videoId) {
        this.id = id;
        this.themeId = themeId;
        this.videoId = videoId;
    }

    public ThemeVideo() {
        super();
    }

    @Override
    public String toString() {
        return "ThemeVideo{" +
                "id=" + id +
                ", themeId=" + themeId +
                ", videoId=" + videoId +
                '}';
    }
}
