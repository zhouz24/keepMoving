package designPatternDemo.structuralType.bridgePattern;

/**
 * @Description
 * @Date 2019/10/28 16:58
 * @Authod ZG
 * @Version 1.0
 */
public class Huawei implements Brand {
    @Override
    public void open() {
        System.out.println("华为手机开机");
    }

    @Override
    public void call() {
        System.out.println("华为手机打电话");
    }

    @Override
    public void close() {
        System.out.println("华为手机关机");
    }
}
