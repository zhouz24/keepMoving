package designPatternDemo.bulidModel.factory.pojo;

import designPatternDemo.bulidModel.factory.interfaceDemo.FactoryDemo;

/**
 * @Description
 * @Date 2019/10/21 15:33
 * @Authod ZG
 * @Version 1.0
 */
public class Pig implements FactoryDemo {
    @Override
    public void eat() {
        System.out.println("猪吃杂食！");
    }
}
