package com.study.services.impl;


import com.study.bean.UserExample;
import com.study.dao.UserMapper;
import com.study.model.User;
import com.study.services.UserService;
import com.study.utils.MD5;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.security.NoSuchAlgorithmException;
import java.util.List;

@Service
@Resource
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;

    //这个登陆
    @Override
    public User enterLoginUser(User user) throws NoSuchAlgorithmException {
        //获取前端传来的数据
        String username=user.getUserAccount();//用户账户
        String userpwd= MD5.md5(user.getUserPwd());//用户密码、由于使用了MD5加密、这里加密后与数据库中数据匹配
        UserExample userExample=new UserExample();
        UserExample.Criteria  criteria=userExample.createCriteria();
        criteria.andUserAccountEqualTo(username);
        criteria.andUserPwdEqualTo(userpwd);
        int i=0;
        List<User> userList=userMapper.selectByExample(userExample);
        User users=new User(String.valueOf(userList.get(0).getUserId()),userList.get(0).getUserAccount(),userList.get(0).getUserNickName(),
                userList.get(0).getUserSignature(),userList.get(0).getUserSex(),userList.get(0).getUserHeadImageLocation());
        if(userList==null){
           return null;
        }
        return users;
    }


    //这个注册
    @Override
    public int regitUser(User user) {

        int i=userMapper.insert(user);
        return i;
    }
}
