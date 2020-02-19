package com.study.services.impl;


import com.study.bean.User;
import com.study.dao.UserMapper;
import com.study.services.UserService;
import com.study.utils.MD5;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.security.NoSuchAlgorithmException;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;

    //这个登陆
    @Override
    public int enterLoginUser(User user) throws NoSuchAlgorithmException {
        //获取前端传来的数据
        String username=user.getUserAccount();//用户账户
        String userpwd= MD5.md5(user.getUserPwd());//用户密码、由于使用了MD5加密、这里加密后与数据库中数据匹配
        int i=userMapper.selectByUsernameandPwd(username,userpwd);//自己写的数据库语句、有可能会报错
        return i;
    }


    //这个注册
    @Override
    public int regitUser(User user) {
        int i=userMapper.insert(user);
        return i;
    }
}
