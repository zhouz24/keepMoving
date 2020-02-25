package designPatternDemo.bulidModel.factory;

import designPatternDemo.bulidModel.factory.interfaceDemo.FactoryDemo;
import designPatternDemo.bulidModel.factory.pojo.Cat;
import designPatternDemo.bulidModel.factory.pojo.Dog;
import designPatternDemo.bulidModel.factory.pojo.Pig;

/**
 * @Description
 * @Date 2019/10/21 15:35
 * @Authod ZG
 * @Version 1.0
 */
public class FactoryBean {

    public FactoryDemo getBean(String beanName) {
        if (beanName == null) {
            return null;
        }
        if (beanName.equalsIgnoreCase("dog")) {
            return new Dog();
        } else if (beanName.equalsIgnoreCase("cat")) {
            return new Cat();
        } else if (beanName.equalsIgnoreCase("pig")) {
            return new Pig();
        }

        return null;
    }
}
