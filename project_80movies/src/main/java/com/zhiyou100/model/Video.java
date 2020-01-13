package com.zhiyou100.model;

import java.util.List;

/**
 * @Author:li
 * @Date:2019/9/26 11:24
 * 地区
 */
public class Video {
    private Integer id;
    private String  name;
    private String  desc;
    private Integer  year;
    private Integer  play;
    private Integer  score;
    private String  cover;
    private Integer  moldId;
    private Integer  areaId;
    private List<Speaker> speakers;
    private List<Actor> actors;
    private List<Movie> movies;
    private List<Banner> banners;
    private List<Hot> hots;
    private List<Director> directors;
    private List<Mold> molds;
    private List<Area> areas;
    private List<Theme> themes;


    public List<Movie> getMovies() {
        return movies;
    }

    public void setMovies(List<Movie> movies) {
        this.movies = movies;
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

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public Integer getPlay() {
        return play;
    }

    public void setPlay(Integer play) {
        this.play = play;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public String getCover() {
        return cover;
    }

    public void setCover(String cover) {
        this.cover = cover;
    }

    public Integer getMoldId() {
        return moldId;
    }

    public void setMoldId(Integer moldId) {
        this.moldId = moldId;
    }

    public Integer getAreaId() {
        return areaId;
    }

    public void setAreaId(Integer areaId) {
        this.areaId = areaId;
    }

    public List<Speaker> getSpeakers() {
        return speakers;
    }

    public void setSpeakers(List<Speaker> speakers) {
        this.speakers = speakers;
    }

    public List<Actor> getActors() {
        return actors;
    }

    public void setActors(List<Actor> actors) {
        this.actors = actors;
    }

    public List<Banner> getBanners() {
        return banners;
    }

    public void setBanners(List<Banner> banners) {
        this.banners = banners;
    }

    public List<Hot> getHots() {
        return hots;
    }

    public void setHots(List<Hot> hots) {
        this.hots = hots;
    }

    public List<Director> getDirectors() {
        return directors;
    }

    public void setDirectors(List<Director> directors) {
        this.directors = directors;
    }

    public List<Mold> getMolds() {
        return molds;
    }

    public void setMolds(List<Mold> molds) {
        this.molds = molds;
    }

    public List<Area> getAreas() {
        return areas;
    }

    public void setAreas(List<Area> areas) {
        this.areas = areas;
    }

    public List<Theme> getThemes() {
        return themes;
    }

    public void setThemes(List<Theme> themes) {
        this.themes = themes;
    }

    @Override
    public String toString() {
        return "Video{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", desc='" + desc + '\'' +
                ", year=" + year +
                ", play=" + play +
                ", score=" + score +
                ", cover='" + cover + '\'' +
                ", moldId=" + moldId +
                ", areaId=" + areaId +
                ", speakers=" + speakers +
                ", actors=" + actors +
                ", movies=" + movies +
                ", banners=" + banners +
                ", hots=" + hots +
                ", directors=" + directors +
                ", molds=" + molds +
                ", areas=" + areas +
                ", themes=" + themes +
                '}';
    }
}
