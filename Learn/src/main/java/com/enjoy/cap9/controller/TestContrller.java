package com.enjoy.cap9.controller;

import com.enjoy.cap9.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * @Description
 * @Date 2019/11/25 16:24
 * @Authod ZG
 * @Version 1.0
 */
@Controller
public class TestContrller {
    @Autowired
    private TestService testService;
}
