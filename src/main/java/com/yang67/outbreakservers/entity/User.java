package com.yang67.outbreakservers.entity;

import com.baomidou.mybatisplus.annotation.*;

@TableName(value = "user_info")
public class User {
    @TableId(value = "user_id")
    private String userId;
    private String userName;
    private String userPwd;
    private int userSex;
    private String userEmail;
    private String userAddress;
    private String createTime;
    private String userUrl;
    private String classId;
    private int identity;
    private int deleteFlag;
//    @TableField(exist = false)
//    private String className;

    public User() {
    }

    public User(String userId, String userName, String userPwd, int userSex, String userEmail, String userAddress, String createTime, String userUrl, String classId, int identity, int deleteFlag) {
        this.userId = userId;
        this.userName = userName;
        this.userPwd = userPwd;
        this.userSex = userSex;
        this.userEmail = userEmail;
        this.userAddress = userAddress;
        this.createTime = createTime;
        this.userUrl = userUrl;
        this.classId = classId;
        this.identity = identity;
        this.deleteFlag = deleteFlag;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPwd() {
        return userPwd;
    }

    public void setUserPwd(String userPwd) {
        this.userPwd = userPwd;
    }

    public int getUserSex() {
        return userSex;
    }

    public void setUserSex(int userSex) {
        this.userSex = userSex;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getUserAddress() {
        return userAddress;
    }

    public void setUserAddress(String userAddress) {
        this.userAddress = userAddress;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getUserUrl() {
        return userUrl;
    }

    public void setUserUrl(String userUrl) {
        this.userUrl = userUrl;
    }

    public String getClassId() {
        return classId;
    }

    public void setClassId(String classId) {
        this.classId = classId;
    }

    public int getIdentity() {
        return identity;
    }

    public void setIdentity(int identity) {
        this.identity = identity;
    }

    public int getDeleteFlag() {
        return deleteFlag;
    }

    public void setDeleteFlag(int deleteFlag) {
        this.deleteFlag = deleteFlag;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId='" + userId + '\'' +
                ", userName='" + userName + '\'' +
                ", userPwd='" + userPwd + '\'' +
                ", userSex=" + userSex +
                ", userEmail='" + userEmail + '\'' +
                ", userAddress='" + userAddress + '\'' +
                ", createTime='" + createTime + '\'' +
                ", userUrl='" + userUrl + '\'' +
                ", classId=" + classId +
                ", identity=" + identity +
                ", deleteFlag=" + deleteFlag +
                '}';
    }
}
