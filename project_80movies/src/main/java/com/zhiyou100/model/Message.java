package com.zhiyou100.model;

import java.util.List;

/**
 * @Author:li
 * @Date:2019/9/28 9:31
 * 留言
 */
public class Message {
    private Integer id;
    private String content;
    private Integer status;
    private Integer userId;
    private User user;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "Message{" +
                "id=" + id +
                ", content='" + content + '\'' +
                ", status=" + status +
                ", userId=" + userId +
                ", user=" + user +
                '}';
    }
}
