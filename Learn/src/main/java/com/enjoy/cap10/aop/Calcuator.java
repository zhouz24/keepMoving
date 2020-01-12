package com.enjoy.cap10.aop;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import org.springframework.stereotype.Component;

/**
 * @Description 业务逻辑类
 * @Date 2019/11/26 15:43
 * @Authod ZG
 * @Version 1.0
 */

@Component
public class Calcuator {

    // 业务逻辑方法
    public int div(int i,int j){
        System.out.println("-----------");
        return i/j;
    }
}
