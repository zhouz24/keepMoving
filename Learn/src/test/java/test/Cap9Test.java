package test;

import com.enjoy.cap8.bean.Bird;
import com.enjoy.cap8.config.Cap8MainConfig;
import com.enjoy.cap9.config.Cap9MainConfig;
import com.enjoy.cap9.dao.TestDao;
import com.enjoy.cap9.service.TestService;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;

/**
 * @Description
 * @Date 2019/11/21 15:10
 * @Authod ZG
 * @Version 1.0
 */
public class Cap9Test {

    @Test
    public void test(){
       AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Cap9MainConfig.class);
        System.out.println("IOC容器创建完毕");

        /*TestService testService = context.getBean(TestService.class);
        testService.printDao();
        // 直接从容器中去和使用@Autowired注解取值相同
        TestDao testDao = context.getBean(TestDao.class);
        System.out.println(testDao);*/

        context.close();

    }
}
