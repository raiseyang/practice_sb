package com.raise.controller;

import com.raise.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {

    //@Component UserMapper,不然会提示could not autowire
    @Autowired
    private UserMapper userMapper;

    @RequestMapping(value = "/{pro_id}", method = RequestMethod.GET)
    public Object test_android(@PathVariable("pro_id") int pro_id, String data) {

        System.out.println("data = "+data);
        System.out.println("pro_id = " + pro_id);
        return "Hello World!";
    }

    //    public Object createUser(@ModelAttribute User user) {

    //        Map<String, String> result = new HashMap<>();

    //    @RequestMapping(value = "/{userid}", method = RequestMethod.GET)

    //

    //    public User getUser(@PathVariable("userid") int userid) {
    //    }
    //        return this.userMapper.queryUserById(userid);
//    }
    //    @RequestMapping(value = "", method = RequestMethod.GET)
//        int createResult = this.userMapper.createUser(user);
//        if (createResult > 0) {
//            result.put("msg", "success");
//        } else {
//            result.put("msg", "failed");
//        }
//
//        return result;
    @RequestMapping(value = "/test")
    public String test11(ModelMap map) {
        map.put("title_link", "http://www.baidu.com");
        return "/index2";
    }
}
