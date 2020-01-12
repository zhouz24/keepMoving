package com.enjoy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Description jsp继承调用示例
 * @Date 2020/1/3 11:36
 * @Authod ZG
 * @Version 1.0
 */
@Controller
@RequestMapping("/jsp")
public class JspController {
    @RequestMapping("/hi")
    public String sayHello() {
        return "index";
    }
}
