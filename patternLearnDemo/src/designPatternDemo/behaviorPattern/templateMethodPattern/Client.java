package designPatternDemo.behaviorPattern.templateMethodPattern;

/**
 * @Description
 * @Date 2019/11/1 16:43
 * @Authod ZG
 * @Version 1.0
 */
public class Client {
    public static void main(String[] args) {
        AbstractSoy cook = new Meet();
        cook.make();

        AbstractSoy cook2 = new Fish();
        cook2.make();
    }
}
