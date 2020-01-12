package com.enjoy.cap7.bean;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

/**
 * @Description  实现接口来查看bean的生命周期
 * @Date 2019/11/24 10:08
 * @Authod ZG
 * @Version 1.0
 */
@Component
public class Train implements InitializingBean,DisposableBean {
    public Train() {
        System.out.println("train .......constructor.......");
    }

    // 当我们的bean销毁时调用此方法
    @Override
    public void destroy() throws Exception {
        System.out.println("train........destory........");
    }

    // 当我们的bean属性赋值和初始化完成时调用
    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("train.......afterPropertiseSet.......");
    }

}
