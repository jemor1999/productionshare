package com.study.services;

import com.study.model.User;

import java.security.NoSuchAlgorithmException;
import java.util.List;


public interface UserService {
    //在里面写需要用到得mapper
    <user> user enterLoginUser(User user) throws NoSuchAlgorithmException;//这个是登陆得方法

    int regitUser(User user);//这个是注册得方法
}
