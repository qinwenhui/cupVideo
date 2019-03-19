package cn.qinwh.cupVideo.po;

import java.util.Date;

public class Follow {
    private Integer followId;

    private Integer userId;

    private Integer followedUser;

    private Integer status;

    private Date createdTime;

    private Date updatedTime;

    public Integer getFollowId() {
        return followId;
    }

    public void setFollowId(Integer followId) {
        this.followId = followId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getFollowedUser() {
        return followedUser;
    }

    public void setFollowedUser(Integer followedUser) {
        this.followedUser = followedUser;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
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
}