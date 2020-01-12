package com.enjoy.cap9.service;

import com.enjoy.cap9.dao.TestDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @Description
 * @Date 2019/11/25 16:25
 * @Authod ZG
 * @Version 1.0
 */
@Service
public class TestService {
    //@Qualifier("testDao2")
    //@Autowired
    //@Resource
    @Autowired
    private TestDao testDao;

    public void printDao(){
        System.out.println(testDao.toString());
    }
}
