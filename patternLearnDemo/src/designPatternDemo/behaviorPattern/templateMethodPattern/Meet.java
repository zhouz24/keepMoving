package designPatternDemo.behaviorPattern.templateMethodPattern;

/**
 * @Description
 * @Date 2019/11/1 16:40
 * @Authod ZG
 * @Version 1.0
 */
public class Meet extends AbstractSoy {
    @Override
    void add() {
        System.out.println("添加辣椒");
    }

    @Override
    void needAdd() {
        System.out.println("可以煮");
    }
}
