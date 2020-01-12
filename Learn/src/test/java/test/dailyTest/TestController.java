package test.dailyTest;

/**
 * @Description
 * @Date 2019/11/21 14:38
 * @Authod ZG
 * @Version 1.0
 */
public class TestController {

    public void method1(){
        try{
            TestService testService = new TestService();
            testService.method2();
        }catch (Exception e){
            System.out.println("======="+e.getMessage());
        }
    }
}
