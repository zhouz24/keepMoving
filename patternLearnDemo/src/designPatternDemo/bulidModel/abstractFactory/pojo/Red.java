package designPatternDemo.bulidModel.abstractFactory.pojo;

import designPatternDemo.bulidModel.abstractFactory.impl.Color;

/**
 * @Description
 * @Date 2019/10/22 9:32
 * @Authod ZG
 * @Version 1.0
 */
public class Red implements Color {
    @Override
    public void getColor() {
        System.out.println("紅色");
    }
}
