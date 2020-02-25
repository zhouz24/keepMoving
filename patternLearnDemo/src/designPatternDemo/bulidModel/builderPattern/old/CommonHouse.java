package designPatternDemo.bulidModel.builderPattern.old;

/**
 * @Description 具体实现子类
 * @Date 2019/10/25 14:50
 * @Authod ZG
 * @Version 1.0
 */
public class CommonHouse extends AbstractHouse {
    @Override
    public void buildBasic() {
        System.out.println("普通房子打地基");
    }

    @Override
    public void buildWalls() {
        System.out.println("普通房子砌墙");
    }

    @Override
    public void buildRoofed() {
        System.out.println("普通房子封顶");
    }
}
