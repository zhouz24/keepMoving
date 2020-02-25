package designPatternDemo.behaviorPattern.VisitorPattern;

/**
 * @Description
 *
 * @Date 2019/11/5 9:50
 * @Authod ZG
 * @Version 1.0
 */
public class Woman extends Person {
    @Override
    void accept(Action action) {
        action.getWomanResult(this);
    }
}
