package com.study.Controller;

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
    public int enterLogin(@RequestBody Map<String ,String> user) throws NoSuchAlgorithmException {
          //将前端获取到得数据
        String username=user.get("账户");
        String userPwd=user.get("密码");
        User us=new User(username,userPwd);
        return userService.enterLoginUser(us);//如果不成功返回-1
    }
    @ResponseBody
    @CrossOrigin//解析路由
    @RequestMapping("regit")
  public int regitUser(@RequestBody User user){
        String username=user.getUserAccount();
        String userPwd=user.getUserPwd();
        String  userNickName=user.getUserNickName();
        String userSignature=user.getUserSignature();
        String userSex =user.getUserSex();
        String userimage=user.getUserHeadImageLocation();
        //将数据全部加入到User实体类中
        User us=new User(username,userPwd,userNickName,userSignature,userSex,userimage);
        return userService.regitUser(us);
  }
}
