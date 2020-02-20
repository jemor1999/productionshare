package com.study.services;

import java.security.NoSuchAlgorithmException;


public interface UserService {
    //在里面写需要用到得mapper
    int enterLoginUser(User user) throws NoSuchAlgorithmException;//这个是登陆得方法

    int regitUser(User user);//这个是注册得方法
}
