package test.dailyTest;

/**
 * @Description
 * @Date 2019/11/21 14:39
 * @Authod ZG
 * @Version 1.0
 */
public class TestService {
    public void method2() throws Exception{
        try{
        int i =  10/0;
        System.out.println("===========");
        System.out.println(i);}catch (Exception e){
            throw e;
        }
    }
}
