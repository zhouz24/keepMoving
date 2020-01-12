package test;

import com.enjoy.cap7.bean.Plane;
import com.enjoy.cap7.config.Cap7MainConfigOfLifecycle;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Description
 * @Date 2019/11/21 15:10
 * @Authod ZG
 * @Version 1.0
 */
public class Cap7Test {

    @Test
    public void test(){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Cap7MainConfigOfLifecycle.class);
        System.out.println("IOC容器创建完毕");
       /* String[] names = context.getBeanDefinitionNames();
        for (String name : names) {
            System.out.println(name);
        }
        */

        /**
         * 当对象为多实例时，需要getbean才能得到contruction获取对象的实例，以及init方法初始化
         * IOC容器不会自动创建对象实例。
         * 容器销毁时也不会销毁实例？
         */
        Plane plane = (Plane) context.getBean("plane");
        plane.test();

        context.close();
    }

    @Test
    public void test1(){
        Plane p = new Plane();
        p.test();
    }

}
