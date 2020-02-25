package designPatternDemo.bulidModel.abstractFactory;

import designPatternDemo.bulidModel.abstractFactory.impl.AnimalInterface;
import designPatternDemo.bulidModel.abstractFactory.impl.Color;

/**
 * @Description
 * @Date 2019/10/22 9:34
 * @Authod ZG
 * @Version 1.0
 */
public interface FactoryDemo {
    AnimalInterface getAnimal(String name);
    Color getColor(String name);
}
