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
    @CrossOrigin//解析路由
    @RequestMapping("user/login")
    public User login(@RequestBody User user) throws NoSuchAlgorithmException {
          //将前端获取到得数据
        String username=user.getUserAccount();
        String userPwd=user.getUserPwd();
        User us=new User(username,userPwd);
        return userService.enterLoginUser(us);//返回user
    }
    @ResponseBody
    @CrossOrigin//解析路由
    @RequestMapping("user/register")
  public User register(@RequestBody User user){
//        String username=user.getUserAccount();
//        String userPwd=user.getUserPwd();
//        String  userNickName=user.getUserNickName();
//        String userSignature=user.getUserSignature();
//        String userSex =user.getUserSex();
//        String userimage=user.getUserHeadImageLocation();
        //将数据全部加入到User实体类中
       int i=userService.regitUser(user);
       if(i<0) {
           return null;
       }
       return user;
  }
}
