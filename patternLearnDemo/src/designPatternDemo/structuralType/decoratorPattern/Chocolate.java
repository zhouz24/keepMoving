package designPatternDemo.structuralType.decoratorPattern;

/**
 * @Description 巧克力（调味品）
 * @Date 2019/10/30 14:48
 * @Authod ZG
 * @Version 1.0
 */
public class Chocolate extends Decorator {
    public Chocolate(Drink drink) {
        super(drink);
        setDesc("巧克力调味品");
        setPrice(4f);
    }


}
