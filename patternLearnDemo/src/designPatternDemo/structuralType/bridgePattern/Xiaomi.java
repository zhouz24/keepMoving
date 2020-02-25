package designPatternDemo.structuralType.bridgePattern;

/**
 * @Description
 * @Date 2019/10/28 16:57
 * @Authod ZG
 * @Version 1.0
 */
public class Xiaomi implements Brand {
    @Override
    public void open() {
        System.out.println("小米手机开机");
    }

    @Override
    public void call() {
        System.out.println("小米手机打电话");
    }

    @Override
    public void close() {
        System.out.println("小米手机关机");
    }
}
