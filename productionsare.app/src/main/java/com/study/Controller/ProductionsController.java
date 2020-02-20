package com.study.Controller;

import com.study.bean.UserExample;
import com.study.model.UserWithAllProductions;
import com.study.services.impl.ProductionsServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/file")
public class ProductionsController {

    @Autowired
    ProductionsServiceImpl productionsService;

    @ResponseBody
    @CrossOrigin//解析路由
    @RequestMapping("ALLProductions")
public UserWithAllProductions returnUserWithAllProductions(@RequestBody String UserAccount){
    UserWithAllProductions userWithAllProductions=productionsService.selectProductions(UserAccount);
    return userWithAllProductions;
}
}
