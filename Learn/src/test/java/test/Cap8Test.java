package test;

import com.enjoy.cap8.bean.Bird;
import com.enjoy.cap8.config.Cap8MainConfig;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;

/**
 * @Description
 * @Date 2019/11/21 15:10
 * @Authod ZG
 * @Version 1.0
 */
public class Cap8Test {

    @Test
    public void test(){
       AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Cap8MainConfig.class);
        System.out.println("IOC容器创建完毕");

        String[] names = context.getBeanDefinitionNames();
        for (String name : names) {
            System.out.println(name);
        }

        Bird bird = (Bird) context.getBean("bird");
        System.out.println(bird.toString());

        ConfigurableEnvironment environment = context.getEnvironment();
        System.out.println(environment.getPropertySources());
        System.out.println(environment.getProperty("bird.color"));

        context.close();

    }
}
