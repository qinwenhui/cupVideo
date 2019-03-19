package cn.qinwh.cupVideo.po;

import java.util.Date;

public class User {
    private Integer userId;

    private String userName;

    private String userPassword;

    private String userDesc;

    private String userNickname;

    private String userIcon;

    private Integer userFollow;

    private Integer userFans;

    private Integer userVideoNumber;

    private Integer userFriendNumber;

    private Date userRegisterTime;

    private String userSex;

    private Integer userAge;

    private Integer status;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword == null ? null : userPassword.trim();
    }

    public String getUserDesc() {
        return userDesc;
    }

    public void setUserDesc(String userDesc) {
        this.userDesc = userDesc == null ? null : userDesc.trim();
    }

    public String getUserNickname() {
        return userNickname;
    }

    public void setUserNickname(String userNickname) {
        this.userNickname = userNickname == null ? null : userNickname.trim();
    }

    public String getUserIcon() {
        return userIcon;
    }

    public void setUserIcon(String userIcon) {
        this.userIcon = userIcon == null ? null : userIcon.trim();
    }

    public Integer getUserFollow() {
        return userFollow;
    }

    public void setUserFollow(Integer userFollow) {
        this.userFollow = userFollow;
    }

    public Integer getUserFans() {
        return userFans;
    }

    public void setUserFans(Integer userFans) {
        this.userFans = userFans;
    }

    public Integer getUserVideoNumber() {
        return userVideoNumber;
    }

    public void setUserVideoNumber(Integer userVideoNumber) {
        this.userVideoNumber = userVideoNumber;
    }

    public Integer getUserFriendNumber() {
        return userFriendNumber;
    }

    public void setUserFriendNumber(Integer userFriendNumber) {
        this.userFriendNumber = userFriendNumber;
    }

    public Date getUserRegisterTime() {
        return userRegisterTime;
    }

    public void setUserRegisterTime(Date userRegisterTime) {
        this.userRegisterTime = userRegisterTime;
    }

    public String getUserSex() {
        return userSex;
    }

    public void setUserSex(String userSex) {
        this.userSex = userSex == null ? null : userSex.trim();
    }

    public Integer getUserAge() {
        return userAge;
    }

    public void setUserAge(Integer userAge) {
        this.userAge = userAge;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}