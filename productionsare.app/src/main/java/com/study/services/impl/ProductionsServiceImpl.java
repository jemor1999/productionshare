package com.study.services.impl;

import com.study.bean.PfileExample;
import com.study.bean.UserExample;
import com.study.model.Pfile;
import com.study.model.User;
import com.study.model.UserWithAllProductions;
import com.study.dao.PfileMapper;
import com.study.dao.UserMapper;
import com.study.services.ProductionsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
@Resource
public class ProductionsServiceImpl implements ProductionsService {
    @Autowired
    UserMapper userMapper;
    @Autowired
    PfileMapper pfileMapper;


    @Override
    public UserWithAllProductions selectProductions(String userAccount) {
        //通过姓名查找相关信息
        UserExample userExample=new UserExample();
        UserExample.Criteria criteria=userExample.createCriteria();
        criteria.andUserAccountEqualTo(userAccount);
        List<User> user=userMapper.selectByExample(userExample);
        //通过获得的信息查询pfile的相关信息
        PfileExample pfileExample=new PfileExample();
        PfileExample.Criteria criteria1=pfileExample.createCriteria();
        int userid=user.get(0).getUserId();
        criteria1.andUserIdEqualTo(userid);
        List<Pfile> pfiles=pfileMapper.selectByExample(pfileExample);
        //取到两个实体类的值放入UserWithAllProductions中
        String userAccounts=user.get(0).getUserAccount();
        String userNickName=user.get(0).getUserNickName();
        String userSignature=user.get(0).getUserSignature();
        String userSex=user.get(0).getUserSex();
        String userHeadImageLocation=user.get(0).getUserHeadImageLocation();
        Integer pfileId=pfiles.get(0).getPfileId();
        String pfileName=pfiles.get(0).getPfileName();
        String pfilePath=pfiles.get(0).getPfilePath();
        String pfileInfo=pfiles.get(0).getPfileInfo();
     UserWithAllProductions  userWithAllProductions=new UserWithAllProductions(userid,userAccounts,userNickName,userSignature,userSex,
             userHeadImageLocation,pfileId,pfileName,pfilePath,pfileInfo);
        return userWithAllProductions;
    }
}
