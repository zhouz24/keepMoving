package designPatternDemo.behaviorPattern.observerPattern;

/**
 * @Description 观察者接口
 * @Date 2019/11/6 10:06
 * @Authod ZG
 * @Version 1.0
 */
public interface Observer {

    void update(float temperature,float pressure,float humidity);

}
