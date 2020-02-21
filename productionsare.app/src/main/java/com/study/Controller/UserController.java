package com.study.Controller;

import com.study.model.User;
import com.study.services.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.security.NoSuchAlgorithmException;
import java.util.Map;


@RestController
public class UserController {
    @Autowired
    UserServiceImpl userService;

    @ResponseBody
    @RequestMapping("user/login")
    public User login(@RequestBody User user) throws NoSuchAlgorithmException {
          //将前端获取到得数据
        return userService.enterLoginUser(user);//返回user
    }

    @ResponseBody
    @RequestMapping("user/register")
  public User register(@RequestBody User user) throws NoSuchAlgorithmException {
        String username=user.getUserAccount();
        String userPwd=user.getUserPwd();
        String  userNickName=user.getUserNickName();
        String userSignature=user.getUserSignature();
        String userSex =user.getUserSex();
        String userimage=user.getUserHeadImageLocation();
        //将数据全部加入到User实体类中
       User users=new User(username,userPwd,userNickName,userSignature,userSex,userimage);
       int i=userService.regitUser(users);
       if(i<0) {
           return null;
       }
       return user;
  }
}
