package com.study.Controller;

import com.study.model.User;
import com.study.services.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.security.NoSuchAlgorithmException;
import java.util.Map;

@Controller
@RequestMapping("/")
public class UserCollection {
    @Autowired
    UserServiceImpl userService;

    @ResponseBody
    @CrossOrigin//解析路由
    @RequestMapping("login")
    public User enterLogin(@RequestBody User user) throws NoSuchAlgorithmException {
          //将前端获取到得数据
        String username=user.getUserAccount();
        String userPwd=user.getUserPwd();
        User us=new User(username,userPwd);
        return userService.enterLoginUser(us);//返回user
    }
    @ResponseBody
    @CrossOrigin//解析路由
    @RequestMapping("regit")
  public User regitUser(@RequestBody User user){
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
