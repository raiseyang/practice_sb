package com.raise.controller;

import org.json.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TemplateController {

    @RequestMapping(value = "/index")
    public String index(ModelMap map) {
        map.put("title_link", "https://www.baidu.com");
        JSONObject jsonObject = new JSONObject(map);
        System.out.println(jsonObject);
        return "/index";
    }

}
