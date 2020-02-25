package designPatternDemo.behaviorPattern.observerPattern;

/**
 * @Description
 * @Date 2019/11/6 10:11
 * @Authod ZG
 * @Version 1.0
 */
public class CurrentCoditions {
    // 温度，气压，湿度
    private float temperature;
    private float pressure;
    private float humidity;

    public void update(float temperature,float pressure,float humidity){
        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity = humidity;
        //display();
    }
}
