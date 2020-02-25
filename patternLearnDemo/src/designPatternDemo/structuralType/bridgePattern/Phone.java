package designPatternDemo.structuralType.bridgePattern;

/**
 * @Description 手机类
 * @Date 2019/10/28 16:54
 * @Authod ZG
 * @Version 1.0
 */
public abstract class Phone{
    // 聚合手机品牌
    private Brand brand;

    public Phone(Brand brand){
        super();
        this.brand = brand;
    }

    protected void open(){
        brand.open();
    }

    protected void call(){
        brand.call();
    }

    protected void close(){
        brand.close();
    }
}
