package com.study.services;

import com.study.bean.UserWithAllProductions;

import java.util.List;

public interface ProductionsService {
    //查询相关用户的所有信息
    List<UserWithAllProductions> selectProductions(Integer userid);
}
