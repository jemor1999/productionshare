package com.study.services;

import com.study.model.UserWithAllProductions;

import java.util.List;

public interface ProductionsService {
    //查询相关用户的所有信息
    UserWithAllProductions selectProductions(String  userAccount);
}
