package designPatternDemo.bulidModel.builderPattern.newPattern;

/**
 * @Description
 * @Date 2019/10/25 16:29
 * @Authod ZG
 * @Version 1.0
 */
public class Client {
    public static void main(String[] args) {
        CommonHouse commonHouse = new CommonHouse();
        BuilderPattern builderPattern = new BuilderPattern();
        builderPattern.setCommonHouse(commonHouse);
        builderPattern.buildHouse();
    }
}
