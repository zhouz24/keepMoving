package designPatternDemo.behaviorPattern.VisitorPattern;

/**
 * @Description 具体访问者（失败）
 * @Date 2019/11/5 9:48
 * @Authod ZG
 * @Version 1.0
 */
public class Fail extends Action {

    @Override
    public void getManResult(Man man) {
        System.out.println("男人给的评价是失败");
    }

    @Override
    public void getWomanResult(Woman woman) {
        System.out.println("女人给的评价是失败");
    }
}
