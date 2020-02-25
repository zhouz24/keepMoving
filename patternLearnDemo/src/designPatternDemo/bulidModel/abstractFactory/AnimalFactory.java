package designPatternDemo.bulidModel.abstractFactory;

import designPatternDemo.bulidModel.abstractFactory.impl.AnimalInterface;
import designPatternDemo.bulidModel.abstractFactory.impl.Color;
import designPatternDemo.bulidModel.abstractFactory.pojo.Cat;
import designPatternDemo.bulidModel.abstractFactory.pojo.Dog;
import designPatternDemo.bulidModel.abstractFactory.pojo.Pig;

/**
 * @Description
 * @Date 2019/10/22 9:35
 * @Authod ZG
 * @Version 1.0
 */
public class AnimalFactory implements FactoryDemo {
    @Override
    public AnimalInterface getAnimal(String name) {
        if(name == null){
            return null;
        }else if(name.equalsIgnoreCase("pig")){
            return new Pig();
        }else if(name.equalsIgnoreCase("dog")){
            return new Dog();
        }else if(name.equalsIgnoreCase("cat")){
            return new Cat();
        }
        return null;
    }

    @Override
    public Color getColor(String name) {
        return null;
    }
}
