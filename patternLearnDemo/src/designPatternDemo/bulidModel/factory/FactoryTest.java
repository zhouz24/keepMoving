package designPatternDemo.bulidModel.factory;

import designPatternDemo.bulidModel.factory.interfaceDemo.FactoryDemo;

/**
 * @Description
 * @Date 2019/10/21 15:27
 * @Authod ZG
 * @Version 1.0
 */
public class FactoryTest {
    public static void main(String[] args) {
        FactoryBean bean = new FactoryBean();

        FactoryDemo demo = bean.getBean("pig");
        demo.eat();
        demo = bean.getBean("dog");
        demo.eat();
        demo = bean.getBean("cat");
        demo.eat();
    }
}
