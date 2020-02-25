package designPatternDemo.bulidModel.abstractFactory;

import designPatternDemo.bulidModel.abstractFactory.impl.AnimalInterface;
import designPatternDemo.bulidModel.abstractFactory.impl.Color;
import designPatternDemo.bulidModel.abstractFactory.pojo.*;

/**
 * @Description
 * @Date 2019/10/22 9:46
 * @Authod ZG
 * @Version 1.0
 */
public class FactoryImpl implements FactoryDemo{
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
        if(name == null){
            return null;
        }else if(name.equalsIgnoreCase("blue")){
            return new Blue();
        }else if(name.equalsIgnoreCase("GRAY")){
            return new Gray();
        }else if(name.equalsIgnoreCase("RED")){
            return new Red();
        }
        return null;
    }
}
