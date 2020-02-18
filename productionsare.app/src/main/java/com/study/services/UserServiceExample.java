package com.study.services;

import com.study.bean.User;
import com.study.bean.UserExample;
import com.study.dao.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;


//这些是例子，具体逻辑需要具体写
public class UserServiceExample {

    @Autowired
    UserMapper userMapper;

    public int addUser(User user){
        int i = userMapper.insertSelective(user);
        return i;
    }

//    跟新用户数据
    public int updateUser(User user){

//        设置更新条件
        UserExample userExample = new UserExample();
        UserExample.Criteria criteria = userExample.createCriteria();
//        用户账号是123413443
        criteria.andUserAccountEqualTo("123413443");

        int i = userMapper.updateByExampleSelective(user, userExample);
        return i;
    }
}
