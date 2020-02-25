package designPatternDemo.structuralType.decoratorPattern;

/**
 * @Description 飲料類
 * @Date 2019/10/30 14:36
 * @Authod ZG
 * @Version 1.0
 */
public abstract class Drink {
    private  String desc;// 描述
    private float price = 0.0f; //

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    // 計算費用的抽象方法
    public abstract float cost();
}
