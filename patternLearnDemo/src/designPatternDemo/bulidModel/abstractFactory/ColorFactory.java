package designPatternDemo.bulidModel.abstractFactory;

import designPatternDemo.bulidModel.abstractFactory.impl.AnimalInterface;
import designPatternDemo.bulidModel.abstractFactory.impl.Color;
import designPatternDemo.bulidModel.abstractFactory.pojo.*;

/**
 * @Description
 * @Date 2019/10/22 9:39
 * @Authod ZG
 * @Version 1.0
 */
public class ColorFactory implements FactoryDemo {
    @Override
    public AnimalInterface getAnimal(String name) {
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
