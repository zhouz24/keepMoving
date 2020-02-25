package designPatternDemo.bulidModel.abstractFactory;

import designPatternDemo.bulidModel.abstractFactory.impl.AnimalInterface;
import designPatternDemo.bulidModel.abstractFactory.impl.Color;

/**
 * @Description
 * @Date 2019/10/22 9:40
 * @Authod ZG
 * @Version 1.0
 */
public class FactoryTest {
    public static void main(String[] args) {
        AnimalFactory animalFactory = new AnimalFactory();
        AnimalInterface bean = animalFactory.getAnimal("dog");
        bean.eat();
        bean = animalFactory.getAnimal("pig");
        bean.eat();
        bean = animalFactory.getAnimal("cat");
        bean.eat();

        ColorFactory colorFactory = new ColorFactory();
        Color color = colorFactory.getColor("red");
        color.getColor();
        color = colorFactory.getColor("blue");
        color.getColor();
        color = colorFactory.getColor("gray");
        color.getColor();

        FactoryImpl factory = new FactoryImpl();
        AnimalInterface bean1 = factory.getAnimal("pig");
        bean1.eat();

        Color color1 = factory.getColor("RED");
        color1.getColor();

    }
}
