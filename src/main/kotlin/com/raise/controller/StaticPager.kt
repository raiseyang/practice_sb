package com.raise.controller

import org.springframework.stereotype.Controller
import org.springframework.ui.ModelMap
import org.springframework.web.bind.annotation.RequestMapping

/**
 * 加载模板中的html
 */
@Controller
class StaticPager {

    @RequestMapping("index")
    fun index(map: ModelMap): String {
        map.put("link", "https://www.baidu.com")
        return "/index"
    }
}