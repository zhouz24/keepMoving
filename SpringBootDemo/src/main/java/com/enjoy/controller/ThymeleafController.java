package com.enjoy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Description 模板引擎控制器
 * @Date 2020/1/3 14:41
 * @Authod ZG
 * @Version 1.0
 */
@Controller
@RequestMapping("/tp1")
public class ThymeleafController {
    @RequestMapping("/testThymeleaf")
    public String testThymeleaf(ModelMap map){
        return "testThymeleaf";
    }
}
