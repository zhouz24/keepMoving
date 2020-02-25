package designPatternDemo.behaviorPattern.VisitorPattern;

/**
 * @Description
 * @Date 2019/11/5 9:48
 * @Authod ZG
 * @Version 1.0
 */
public abstract class Person {
    // 提供一个方法，让访问者可以访问
    abstract void accept(Action action);
}
