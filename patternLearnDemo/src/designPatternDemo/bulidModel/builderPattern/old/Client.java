package designPatternDemo.bulidModel.builderPattern.old;

/**
 * @Description 客户端
 * @Date 2019/10/25 14:51
 * @Authod ZG
 * @Version 1.0
 */
public class Client {
    public static void main(String[] args) {
        // 传统方式
        CommonHouse commonHouse = new CommonHouse();
        commonHouse.build();


    }
}
