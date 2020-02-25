package designPatternDemo.behaviorPattern.VisitorPattern;

/**
 * @Description
 * @Date 2019/11/5 9:49
 * @Authod ZG
 * @Version 1.0
 */
public class Man extends Person {
    @Override
    void accept(Action action) {
        action.getManResult(this);
    }
}
