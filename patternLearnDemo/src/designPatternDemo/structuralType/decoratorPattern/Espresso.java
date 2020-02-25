package designPatternDemo.structuralType.decoratorPattern;

/**
 * @Description 意大利咖啡
 * @Date 2019/10/30 14:40
 * @Authod ZG
 * @Version 1.0
 */
public class Espresso extends Coffee {
    public Espresso(){
        setDesc("意大利咖啡");
        setPrice(25f);
    }
}
