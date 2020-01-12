package com.enjoy.controller;


 import org.springframework.web.bind.annotation.RequestMapping;
 import org.springframework.web.bind.annotation.RestController;

/**
 * 全局异常处理控制器示例
 */
@RestController
public class BaseController {

    @RequestMapping("/404.do")
    public Object error_404() {
        return "你要找的页面，被lison偷吃了！";
    }
}
