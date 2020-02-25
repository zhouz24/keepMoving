package designPatternDemo.structuralType.decoratorPattern;

/**
 * @Description 装饰者
 * @Date 2019/10/30 14:43
 * @Authod ZG
 * @Version 1.0
 */
public class Decorator extends Drink{
    private Drink obj;

    public Decorator(Drink drink){
        this.obj = drink;
    }

    @Override
    public String getDesc() {
        return super.getDesc() + " && " + super.getPrice();
    }

    @Override
    public float cost() {
        // 拿到自己（调料）的价格 和 咖啡的价格
        return super.getPrice() + obj.cost();
    }

}
