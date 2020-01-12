package test;

import com.enjoy.cap2.config.Cap2Mainconfig;
import com.enjoy.cap3.config.Cap3Mainconfig;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Description
 * @Date 2019/11/19 14:32
 * @Authod ZG
 * @Version 1.0
 */
public class Cap3Test {

    @Test
    public void test01(){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Cap3Mainconfig.class);
        String[] names = context.getBeanDefinitionNames();
        for (String s : names) {
            System.out.println(s);
        }

        Object person = context.getBean("person");
        Object person1 =context.getBean("person");
        System.out.println(person == person1);
    }
}
