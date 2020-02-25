package designPatternDemo.bulidModel.abstractFactory.pojo;

import designPatternDemo.bulidModel.abstractFactory.impl.Color;

/**
 * @Description
 * @Date 2019/10/22 9:33
 * @Authod ZG
 * @Version 1.0
 */
public class Gray implements Color {
    @Override
    public void getColor() {
        System.out.println("顔色");
    }
}
