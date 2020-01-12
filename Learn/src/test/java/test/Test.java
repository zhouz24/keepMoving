package test;

import test.dailyTest.TestController;

/**
 * @Description
 * @Date 2019/11/21 14:36
 * @Authod ZG
 * @Version 1.0
 */
public class Test {

    @org.junit.Test
    public void test(){
        TestController t = new TestController();
        t.method1();
    }
}
