package com.raise.controller;

import com.raise.bean.User;
import com.raise.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/users")
public class UserController {

    //@Component UserMapper,不然会提示could not autowire
    @Autowired
    private UserMapper userMapper;

    @RequestMapping(value = "", method = RequestMethod.GET)
    public Object createUser(@ModelAttribute User user) {
        Map<String, String> result = new HashMap<>();
        int createResult = this.userMapper.createUser(user);
        if (createResult > 0) {
            result.put("msg", "success");
        } else {
            result.put("msg", "failed");
        }

        return result;
    }

    @RequestMapping(value = "/{userid}", method = RequestMethod.GET)
    public User getUser(@PathVariable("userid") int userid) {
        return this.userMapper.queryUserById(userid);
    }
}
