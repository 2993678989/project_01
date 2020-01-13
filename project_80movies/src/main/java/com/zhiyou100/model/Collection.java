package com.zhiyou100.model;

/**
 * @Author:li
 * @Date:2019/9/28 9:42
 * 收藏
 */
public class Collection {
    private Integer id;
    private Integer userId;
    private Integer movieId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getMovieId() {
        return movieId;
    }

    public void setMovieId(Integer movieId) {
        this.movieId = movieId;
    }

    @Override
    public String toString() {
        return "Collection{" +
                "id=" + id +
                ", userId=" + userId +
                ", movieId=" + movieId +
                '}';
    }
}
