package com.study.model;

import com.study.utils.MD5;

import java.security.NoSuchAlgorithmException;

public class User {
    private Integer userId;

    private String userAccount;

    private String userPwd;

    private String userNickName;

    private String userSignature;

    private String userSex;

    private String userHeadImageLocation;

    public User(String username, String userPwd) {
        this.userAccount=username;
        this.userPwd=userPwd;
    }

    public User(String username, String userPwd, String userNickName,
                String userSignature, String userSex, String userimage) throws NoSuchAlgorithmException {
     this.userAccount=username;
     this.userPwd=MD5.md5(userPwd);
     this.userNickName=userNickName;
     this.userSignature=userSignature;
     this.userSex=userSex;
     this.userHeadImageLocation=userimage;
    }

    public User() {
        super();
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserAccount() {
        return userAccount;
    }

    public void setUserAccount(String userAccount) {
        this.userAccount = userAccount == null ? null : userAccount.trim();
    }

    public String getUserPwd() {
        return userPwd;
    }

    public void setUserPwd(String userPwd) throws NoSuchAlgorithmException {
        this.userPwd = userPwd == null ? null : MD5.md5(userPwd.trim());
    }

    public String getUserNickName() {
        return userNickName;
    }

    public void setUserNickName(String userNickName) {
        this.userNickName = userNickName == null ? null : userNickName.trim();
    }

    public String getUserSignature() {
        return userSignature;
    }

    public void setUserSignature(String userSignature) {
        this.userSignature = userSignature == null ? null : userSignature.trim();
    }

    public String getUserSex() {
        return userSex;
    }

    public void setUserSex(String userSex) {
        this.userSex = userSex == null ? null : userSex.trim();
    }

    public String getUserHeadImageLocation() {
        return userHeadImageLocation;
    }

    public void setUserHeadImageLocation(String userHeadImageLocation) {
        this.userHeadImageLocation = userHeadImageLocation == null ? null : userHeadImageLocation.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", userId=").append(userId);
        sb.append(", userAccount=").append(userAccount);
        sb.append(", userPwd=").append(userPwd);
        sb.append(", userNickName=").append(userNickName);
        sb.append(", userSignature=").append(userSignature);
        sb.append(", userSex=").append(userSex);
        sb.append(", userHeadImageLocation=").append(userHeadImageLocation);
        sb.append("]");
        return sb.toString();
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        User other = (User) that;
        return (this.getUserId() == null ? other.getUserId() == null : this.getUserId().equals(other.getUserId()))
            && (this.getUserAccount() == null ? other.getUserAccount() == null : this.getUserAccount().equals(other.getUserAccount()))
            && (this.getUserPwd() == null ? other.getUserPwd() == null : this.getUserPwd().equals(other.getUserPwd()))
            && (this.getUserNickName() == null ? other.getUserNickName() == null : this.getUserNickName().equals(other.getUserNickName()))
            && (this.getUserSignature() == null ? other.getUserSignature() == null : this.getUserSignature().equals(other.getUserSignature()))
            && (this.getUserSex() == null ? other.getUserSex() == null : this.getUserSex().equals(other.getUserSex()))
            && (this.getUserHeadImageLocation() == null ? other.getUserHeadImageLocation() == null : this.getUserHeadImageLocation().equals(other.getUserHeadImageLocation()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getUserId() == null) ? 0 : getUserId().hashCode());
        result = prime * result + ((getUserAccount() == null) ? 0 : getUserAccount().hashCode());
        result = prime * result + ((getUserPwd() == null) ? 0 : getUserPwd().hashCode());
        result = prime * result + ((getUserNickName() == null) ? 0 : getUserNickName().hashCode());
        result = prime * result + ((getUserSignature() == null) ? 0 : getUserSignature().hashCode());
        result = prime * result + ((getUserSex() == null) ? 0 : getUserSex().hashCode());
        result = prime * result + ((getUserHeadImageLocation() == null) ? 0 : getUserHeadImageLocation().hashCode());
        return result;
    }
}