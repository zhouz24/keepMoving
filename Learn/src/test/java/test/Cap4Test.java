package test;

import com.enjoy.cap3.config.Cap3Mainconfig;
import com.enjoy.cap4.Cap4Mainconfig;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Description
 * @Date 2019/11/19 14:32
 * @Authod ZG
 * @Version 1.0
 */
public class Cap4Test {

    @Test
    public void test01(){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Cap4Mainconfig.class);
        System.out.println("IOC容器创建完成");
        // 执行获取的时候，才执行bean的创建方法
        Object person = context.getBean("person");
    }
}
