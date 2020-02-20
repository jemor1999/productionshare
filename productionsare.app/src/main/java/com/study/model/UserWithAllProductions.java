package com.study.model;

import java.util.ArrayList;
import java.util.List;

public class UserWithAllProductions {
    //    用户id
    private Integer userId;
    //    用户帐号
    private String userAccount;
    //    用户昵称
    private String userNickName;
    //    用户个性签名
    private String userSignature;
    //    用户性别
    private String userSex;
    //    用户头像（路径）
    private String userHeadImageLocation;
    //用户作品信息
    private Integer pfileId;

    private String pfileName;

    private String pfilePath;

    private String pfileInfo;

    public UserWithAllProductions(int userid, String userAccounts,
                                  String userNickName, String userSignature, String userSex, String userHeadImageLocation,
                                  Integer pfileId, String pfileName, String pfilePath, String pfileInfo) {
        this.userId=userid;
        this.userAccount=userAccounts;
        this.userNickName=userNickName;
        this.userSignature=userSignature;
        this.userSex=userSex;
        this.userHeadImageLocation=userHeadImageLocation;
        this.pfileId=pfileId;
        this.pfileName=pfileName;
        this.pfilePath=pfilePath;
        this.pfileInfo=pfileInfo;
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

    public Integer getPfileId() {
        return pfileId;
    }

    public void setPfileId(Integer pfileId) {
        this.pfileId = pfileId;
    }

    public String getPfileName() {
        return pfileName;
    }

    public void setPfileName(String pfileName) {
        this.pfileName = pfileName;
    }

    public String getPfilePath() {
        return pfilePath;
    }

    public void setPfilePath(String pfilePath) {
        this.pfilePath = pfilePath;
    }

    public String getPfileInfo() {
        return pfileInfo;
    }

    public void setPfileInfo(String pfileInfo) {
        this.pfileInfo = pfileInfo;
    }

}
