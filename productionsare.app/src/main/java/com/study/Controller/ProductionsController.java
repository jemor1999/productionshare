package com.study.Controller;

import com.study.bean.UserExample;
import com.study.model.UserWithAllProductions;
import com.study.services.impl.ProductionsServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
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
