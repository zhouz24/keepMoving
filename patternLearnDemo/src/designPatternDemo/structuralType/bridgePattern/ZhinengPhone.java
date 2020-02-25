package designPatternDemo.structuralType.bridgePattern;

/**
 * @Description
 * @Date 2019/10/28 17:03
 * @Authod ZG
 * @Version 1.0
 */
public class ZhinengPhone extends Phone {
    public ZhinengPhone(Brand brand) {
        super(brand);
    }

    public void open(){
        System.out.print("智能手机");
        super.open();
    }

    public void call(){
        System.out.print("智能手机");
        super.call();
    }

    public void close(){
        System.out.print("智能手机");
        super.close();
    }
}
