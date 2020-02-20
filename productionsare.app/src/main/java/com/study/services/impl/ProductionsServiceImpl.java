package com.study.services.impl;

import com.study.bean.Pfile;
import com.study.bean.UserWithAllProductions;
import com.study.dao.PfileMapper;
import com.study.services.ProductionsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductionsServiceImpl implements ProductionsService {
    @Autowired
    UserMapper userMapper;

    @Autowired
    PfileMapper pfileMapper;

    public List<UserWithAllProductions> selectProductions(Integer userid){
        //查询相关用户的相关信息
        User UserArr=userMapper.selectByPrimaryKey(userid);
        //查询相关用户所有的文件信息
        Pfile pfiles=pfileMapper.selectByUserId(userid);//这个是自己写的mybatis语句、有可能出错
        //将Pfile的信息传入数组
        ArrayList<String> pfileArrayList=new ArrayList<String>();
        pfileArrayList.add(pfiles.getPfileName());
        pfileArrayList.add(pfiles.getPfilePath());
        pfileArrayList.add(pfiles.getPfileInfo());
        //全部存人模型UserWithAllProductions中
        UserWithAllProductions userWithAllProductions=new UserWithAllProductions(UserArr.getUserId(),UserArr.getUserAccount()
        ,UserArr.getUserPwd(),UserArr.getUserNickName(),UserArr.getUserSignature(),UserArr.getUserSex(),UserArr.getUserHeadImageLocation(),pfileArrayList);

        //将userWithAllProductions添加进数组
        ArrayList<UserWithAllProductions> userArraylist=new ArrayList<UserWithAllProductions>();
        userArraylist.add(userWithAllProductions);
        return userArraylist;
    }
}
