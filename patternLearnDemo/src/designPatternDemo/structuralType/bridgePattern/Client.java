package designPatternDemo.structuralType.bridgePattern;

/**
 * @Description 测试用户
 * @Date 2019/10/28 17:07
 * @Authod ZG
 * @Version 1.0
 */
public class Client {
    public static void main(String[] args) {
        Phone phone = new ZhinengPhone(new Huawei());
        phone.open();
        phone.call();
        phone.close();
    }
}
