package designPatternDemo.behaviorPattern.VisitorPattern;

import java.util.LinkedList;
import java.util.List;

/**
 * @Description 数据结构，管理很多人
 * @Date 2019/11/5 10:01
 * @Authod ZG
 * @Version 1.0
 */

public class ObjectStructure {
    // 维护了一个集合
    private List<Person> persons = new LinkedList<>();

    // 增加人员到list
    public void attach(Person p){
        persons.add(p);
    }

    // 移除人员
    public void delete(Person p){
        persons.remove(p);
    }

    // 显示测评情况
    public void display(Action action){
        for(Person p : persons){
            p.accept(action);
        }
    }
}
