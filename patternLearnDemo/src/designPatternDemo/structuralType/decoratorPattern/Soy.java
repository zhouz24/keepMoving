package designPatternDemo.structuralType.decoratorPattern;

/**
 * @Description
 * @Date 2019/10/30 15:34
 * @Authod ZG
 * @Version 1.0
 */
public class Soy extends Decorator{
    public Soy(Drink drink) {
        super(drink);
        setDesc("辅料，豆浆");
        setPrice(2f);
    }
}
