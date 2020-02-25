package designPatternDemo.behaviorPattern.observerPattern;


import designPatternDemo.behaviorPattern.VisitorPattern.ObjectStructure;

/**
 * @Description 主体接口
 * @Date 2019/11/6 10:05
 * @Authod ZG
 * @Version 1.0
 */
public interface Subject {
    // 注册
    void registObserver(Observer observer);
    // 移除
    void removeObserver(Observer observer);
    // 更新观察者
    void notifyObservers();
}
