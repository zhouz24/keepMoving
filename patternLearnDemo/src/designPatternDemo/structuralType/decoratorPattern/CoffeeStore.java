package designPatternDemo.structuralType.decoratorPattern;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

/**
 * @Description 客户端
 * @Date 2019/10/30 14:52
 * @Authod ZG
 * @Version 1.0
 */
public class CoffeeStore  {
    public static void main(String[] args) {

        // 装饰者模式下点单，2份巧克力+一份牛奶的longBlack
        // 1、点一份LongBlack
        Drink order = new LongBrack();
        System.out.println("费用："+order.cost());
        System.out.println(order.getPrice());

        // 2、加入一份牛奶
        order = new Milk(order);
        System.out.println("费用："+order.cost());
        System.out.println(order.getDesc());

        // 3、加入一份巧克力
        order = new Chocolate(order);
        System.out.println("费用："+order.cost());
        System.out.println(order.getDesc());

        // 4、再加上一份巧克力
        order = new Chocolate(order);
        System.out.println("费用："+order.cost());
        System.out.println(order.getDesc());

        System.out.println("++++++++++++++++++++");

        Drink drink = new Espresso();
        System.out.println(drink.cost());
        drink = new Milk(drink);
        System.out.println(drink.cost());
        drink = new Soy(drink);
        System.out.println(drink.cost());
    }
}
