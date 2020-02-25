package designPatternDemo.structuralType.decoratorPattern;

/**
 * @Description 牛奶（调味品）
 * @Date 2019/10/30 14:50
 * @Authod ZG
 * @Version 1.0
 */
public class Milk extends Decorator {
    public Milk(Drink drink) {
        super(drink);
        setDesc("牛奶");
        setPrice(3f);
    }
}
