package com.study.bean;

import java.util.ArrayList;

public class UserWithAllProductions {
    //    用户id
    private Integer userId;
    //    用户帐号
    private String userAccount;
    //    用户密码
    private String userPwd;
    //    用户昵称
    private String userNickName;
    //    用户个性签名
    private String userSignature;
    //    用户性别
    private String userSex;
    //    用户头像（路径）
    private String userHeadImageLocation;
    //用户作品集合
    private ArrayList<String>  pfiles;

    public UserWithAllProductions(Integer userId, String userAccount, String userPwd, String userNickName, String userSignature, String userSex, String userHeadImageLocation, ArrayList<String> pfileArrayList) {
        this.userId=userId;
        this.userAccount=userAccount;
        this.userPwd=userPwd;
        this.userNickName=userNickName;
        this.userSignature=userSignature;
        this.userSex=userSex;
        this.userHeadImageLocation=userHeadImageLocation;
        this.pfiles=pfileArrayList;
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
        this.userAccount = userAccount;
    }

    public String getUserPwd() {
        return userPwd;
    }

    public void setUserPwd(String userPwd) {
        this.userPwd = userPwd;
    }

    public String getUserNickName() {
        return userNickName;
    }

    public void setUserNickName(String userNickName) {
        this.userNickName = userNickName;
    }

    public String getUserSignature() {
        return userSignature;
    }

    public void setUserSignature(String userSignature) {
        this.userSignature = userSignature;
    }

    public String getUserSex() {
        return userSex;
    }

    public void setUserSex(String userSex) {
        this.userSex = userSex;
    }

    public String getUserHeadImageLocation() {
        return userHeadImageLocation;
    }

    public void setUserHeadImageLocation(String userHeadImageLocation) {
        this.userHeadImageLocation = userHeadImageLocation;
    }

    public ArrayList<String> getPfiles() {
        return pfiles;
    }

    public void setPfiles(ArrayList<String> pfiles) {
        this.pfiles = pfiles;
    }
}
