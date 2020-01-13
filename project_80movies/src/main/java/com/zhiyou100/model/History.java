package com.zhiyou100.model;

/**
 * @Author:li
 * @Date:2019/9/28 9:44
 * 历史记录
 */
public class History {
    private Integer id;
    private Integer userId;
    private Integer movieId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserid() {
        return userId;
    }

    public void setUserid(Integer userid) {
        this.userId = userid;
    }

    public Integer getMovieId() {
        return movieId;
    }

    public void setMovieId(Integer movieId) {
        this.movieId = movieId;
    }

    @Override
    public String toString() {
        return "History{" +
                "id=" + id +
                ", userId=" + userId +
                ", movieId=" + movieId +
                '}';
    }
}
