package com.raise.controller;

import com.raise.mapper.UserMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {

    //@Component UserMapper,不然会提示could not autowire
    @Autowired
    private UserMapper userMapper;
//
//    @RequestMapping(value = "/test")
//    public String test11(ModelMap map) {
//        map.put("title_link", "http://www.baidu.com");
//        return "/index2";
//    }
}
