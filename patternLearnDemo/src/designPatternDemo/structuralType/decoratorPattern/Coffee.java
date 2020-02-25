package designPatternDemo.structuralType.decoratorPattern;

/**
 * @Description 咖啡類
 * @Date 2019/10/30 14:38
 * @Authod ZG
 * @Version 1.0
 */
public class Coffee extends Drink {
    @Override
    public float cost() {
        return super.getPrice();
    }
}
