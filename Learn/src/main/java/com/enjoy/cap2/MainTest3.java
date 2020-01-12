package com.enjoy.cap2;

import com.enjoy.cap2.config.Cap2Mainconfig;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Description  测试扫描组件的用例
 * @Date 2019/11/19 14:32
 * @Authod ZG
 * @Version 1.0
 */
public class MainTest3 {

    @Test
    public void test01(){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Cap2Mainconfig.class);
        String[] names = context.getBeanDefinitionNames();
        for (String s : names) {
            System.out.println(s);
        }
    }
}
