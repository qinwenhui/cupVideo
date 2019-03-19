package cn.qinwh.cupVideo.po;

import java.util.Date;

public class Likevideo {
    private Integer id;

    private Integer userId;

    private Integer likeVideoId;

    private Date createdTime;

    private Date updatedTime;

    private Integer status;

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

    public Integer getLikeVideoId() {
        return likeVideoId;
    }

    public void setLikeVideoId(Integer likeVideoId) {
        this.likeVideoId = likeVideoId;
    }

    public Date getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    public Date getUpdatedTime() {
        return updatedTime;
    }

    public void setUpdatedTime(Date updatedTime) {
        this.updatedTime = updatedTime;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}