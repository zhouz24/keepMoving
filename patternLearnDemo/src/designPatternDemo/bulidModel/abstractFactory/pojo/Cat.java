package designPatternDemo.bulidModel.abstractFactory.pojo;

import designPatternDemo.bulidModel.abstractFactory.impl.AnimalInterface;

/**
 * @Description
 * @Date 2019/10/22 9:28
 * @Authod ZG
 * @Version 1.0
 */
public class Cat implements AnimalInterface {
    @Override
    public void eat() {
        System.out.println("貓吃魚");
    }
}
