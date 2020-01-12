package com.enjoy.cap6;

import com.enjoy.cap1.Person;
import com.enjoy.cap5.LinuxCondition;
import com.enjoy.cap5.WinCondition;
import com.enjoy.cap6.Bean.Cat;
import com.enjoy.cap6.Bean.Dog;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @Description
 * @Date 2019/11/19 14:32
 * @Authod ZG
 * @Version 1.0
 */
@Configuration
@Import(value = {Dog.class,Cat.class,MyImportSelector.class,MyImportBeanDefinitionRegistrar.class})
public class Cap6Mainconfig {
    /**
     *给容器中注册一个bean，类型为返回值的类型
     * 四种方式：
     *      1、@Bean [导入第三方的类或者包时]，比如person为第三方的类，需要在我们的IOC容器中使用
     *      2、包扫描+组件 的标注注解（@ComponentScan）一般是针对我们自己写的类
     *      3、@Import：快速给容器中导入一个组件， 注意：@Bean稍显简单
     *          1、@Import :要导入到容器中的组件，容器会自动注册这个组件，缺点：注册的bean的id为全类名
     *          2、importSelector：是一个接口，是导入到容器中全类名的字符数组,缺点是数组元素必须是全类名。
     *          3、importBeanDefinitionRegistrar: 可以手动添加bean实例（组件）到IOC容器中，所有Bean的注册可以使用BeanDifinitionRegistry
     *              例如：MyImportBeanDefinitionRegistrar中重写registerBeanDefinitions方法
     *      4、使用Spring提供的FactoryBean（工厂bean）注册
     * @return
     */


    @Bean("person")
    public Person person(){
        System.out.println("创建person，并添加到IOC容器中");
        return new Person("lisi",19);
    }

    @Bean
    public MyFactoryBean myFactoryBean(){
        return new MyFactoryBean();
    }
}
