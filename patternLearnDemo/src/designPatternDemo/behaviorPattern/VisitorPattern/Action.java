package designPatternDemo.behaviorPattern.VisitorPattern;

/**
 * @Description 抽象访问者
 * @Date 2019/11/5 9:47
 * @Authod ZG
 * @Version 1.0
 */
public abstract class Action {

    // 得到男性的测评结果
    public abstract void getManResult(Man man);

    // 得到女性的测评结果
    public abstract void getWomanResult(Woman woman);
}
