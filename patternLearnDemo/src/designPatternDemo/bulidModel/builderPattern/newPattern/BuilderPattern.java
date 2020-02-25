package designPatternDemo.bulidModel.builderPattern.newPattern;

/**
 * @Description 建造者模式
 * @Date 2019/10/25 11:23
 * @Authod ZG
 * @Version 1.0
 */
public class BuilderPattern {
    public BuilderPattern(){}

    private CommonHouse commonHouse;

    public void setCommonHouse(CommonHouse commonHouse) {
        this.commonHouse = commonHouse;
    }

    public House buildHouse(){
        return commonHouse.buildHouse();
    }
}
