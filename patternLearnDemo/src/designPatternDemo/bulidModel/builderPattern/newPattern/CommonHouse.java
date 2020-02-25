package designPatternDemo.bulidModel.builderPattern.newPattern;

/**
 * @Description
 * @Date 2019/10/25 16:25
 * @Authod ZG
 * @Version 1.0
 */
public class CommonHouse extends HouseProduct {
    @Override
    void buildBasic() {
        System.out.println("构建普通房子地基");
    }

    @Override
    void buildWalls() {
        System.out.println("普通房子建墙");
    }

    @Override
    void roofed() {
        System.out.println("普通房子建屋顶");
    }
}
