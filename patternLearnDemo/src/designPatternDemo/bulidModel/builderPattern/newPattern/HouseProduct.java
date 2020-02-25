package designPatternDemo.bulidModel.builderPattern.newPattern;

/**
 * @Description
 * @Date 2019/10/25 16:23
 * @Authod ZG
 * @Version 1.0
 */
public abstract class HouseProduct {
    protected House house = new House();

    abstract void buildBasic();
    abstract void buildWalls();
    abstract void roofed();

    public House buildHouse(){
        buildBasic();
        buildWalls();
        roofed();
        return house;
    }
}
