package test;

import com.enjoy.cap4.Cap4Mainconfig;
import com.enjoy.cap5.Cap5Mainconfig;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Description
 * @Date 2019/11/19 14:32
 * @Authod ZG
 * @Version 1.0
 */
public class Cap5Test {

    @Test
    public void test01(){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Cap5Mainconfig.class);
        System.out.println("IOC容器创建完成");

    }
}
