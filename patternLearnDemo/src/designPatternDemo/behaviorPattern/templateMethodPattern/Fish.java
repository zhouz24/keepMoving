package designPatternDemo.behaviorPattern.templateMethodPattern;

/**
 * @Description
 * @Date 2019/11/1 16:42
 * @Authod ZG
 * @Version 1.0
 */
public class Fish extends AbstractSoy{
    @Override
    void add() {
        System.out.println("增加香菜");
    }

    @Override
    void needAdd() {
        super.needAdd();
    }
}
