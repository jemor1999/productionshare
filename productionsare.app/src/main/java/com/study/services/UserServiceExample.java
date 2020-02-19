package com.study.services;

import com.study.bean.User;
import com.study.bean.UserExample;
import com.study.dao.UserMapper;
import com.study.utils.MD5;
import org.springframework.beans.factory.annotation.Autowired;

import java.security.NoSuchAlgorithmException;


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
    //这里是登陆
    public int enterLoginUser(User user) throws NoSuchAlgorithmException {
        //获取前端传来的数据
        String username=user.getUserAccount();//用户账户
        String userpwd=MD5.md5(user.getUserPwd());//用户密码、由于使用了MD5加密、这里加密后与数据库中数据匹配

        int i=userMapper.selectByUsernameandPwd(username,userpwd);//自己写的数据库语句、有可能会报错
        return i;
    }
    //这里是注册   假设user为前端传回的数据
    public int regitUser(User user) throws NoSuchAlgorithmException {
        String username=user.getUserAccount();
        String userPwd=MD5.md5(user.getUserPwd());
        String  userNickName=user.getUserNickName();
        String userSignature=user.getUserSignature();
        String userSex =user.getUserSex();
        String userimage=user.getUserHeadImageLocation();
        //将数据全部加入到User实体类中
       User us=new User(username,userPwd,userNickName,userSignature,userSex,userimage);
        int i=userMapper.insert(us);
        return i;
    }
}
