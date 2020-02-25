package designPatternDemo.bulidModel.builderPattern.old;

/**
 * @Description 房子抽象类
 * @Date 2019/10/25 14:46
 * @Authod ZG
 * @Version 1.0
 */
public abstract class AbstractHouse {

    // 打地基
    public abstract void buildBasic();
    // 砌墙
    public abstract void buildWalls();
    // 封顶
    public abstract void buildRoofed();

    public void  build(){
        buildBasic();
        buildWalls();
        buildRoofed();
    }
}
