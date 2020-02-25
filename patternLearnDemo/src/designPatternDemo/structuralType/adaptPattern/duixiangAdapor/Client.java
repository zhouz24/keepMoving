package designPatternDemo.structuralType.adaptPattern.duixiangAdapor;

/**
 * @Description
 * @Date 2019/10/26 15:48
 * @Authod ZG
 * @Version 1.0
 */
public class Client {
    public static void main(String[] args) {

        ClassAdaptUser cau = new ClassAdaptUser();
        cau.getV(new ClassAdapt(new ClassAdaptorSrc()));
    }
}
