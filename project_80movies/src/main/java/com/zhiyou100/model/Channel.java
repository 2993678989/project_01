package com.zhiyou100.model;

import java.util.List;

/**
 * @Author:li
 * @Date:2019/9/28 9:25
 * 频道
 */
public class Channel {
    private Integer id;
    private String name;
    private Integer year;
    private Integer showCount;
    private List<Area> areas;
    private List<Mold> molds;
    private List<Video> videos;
    private List<Hot> hots;
    private List<Actor> actors;

    @Override
    public String toString() {
        return "Channel{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", year=" + year +
                ", showCount=" + showCount +
                ", areas=" + areas +
                ", molds=" + molds +
                ", videos=" + videos +
                ", hots=" + hots +
                ", actors=" + actors +
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

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public Integer getShowCount() {
        return showCount;
    }

    public void setShowCount(Integer showCount) {
        this.showCount = showCount;
    }

    public List<Area> getAreas() {
        return areas;
    }

    public void setAreas(List<Area> areas) {
        this.areas = areas;
    }

    public List<Mold> getMolds() {
        return molds;
    }

    public void setMolds(List<Mold> molds) {
        this.molds = molds;
    }

    public List<Video> getVideos() {
        return videos;
    }

    public void setVideos(List<Video> videos) {
        this.videos = videos;
    }

    public List<Hot> getHots() {
        return hots;
    }

    public void setHots(List<Hot> hots) {
        this.hots = hots;
    }

    public List<Actor> getActors() {
        return actors;
    }

    public void setActors(List<Actor> actors) {
        this.actors = actors;
    }
}
