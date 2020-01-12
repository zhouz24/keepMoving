package test;

import com.enjoy.cap10.aop.Calcuator;
import com.enjoy.cap10.config.Cap10MainConfig;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Description
 * @Date 2019/11/26 16:21
 * @Authod ZG
 * @Version 1.0
 */
public class Cap10Test {

    @Test
    public void test(){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Cap10MainConfig.class);
        System.out.println("IOC容器创建完成");
        Calcuator bean = (Calcuator)context.getBean("calcuator");
        System.out.println(bean);
        bean.div(10,2);
    }
}
