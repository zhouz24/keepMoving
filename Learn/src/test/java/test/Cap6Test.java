package test;

import com.enjoy.cap5.Cap5Mainconfig;
import com.enjoy.cap6.Cap6Mainconfig;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Description
 * @Date 2019/11/19 14:32
 * @Authod ZG
 * @Version 1.0
 */
public class Cap6Test {

    @Test
    public void test01(){
        System.out.println(new String[0]);
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Cap6Mainconfig.class);
        System.out.println("IOC容器创建完成");

        Object o = context.getBean("&myFactoryBean");
        System.out.println("BeanFactory注册的bean："+o.getClass());

        String[] names = context.getBeanDefinitionNames();
        for (String name : names) {
            System.out.println(name);
        }
    }
}
