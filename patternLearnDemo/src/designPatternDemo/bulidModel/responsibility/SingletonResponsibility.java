package designPatternDemo.bulidModel.responsibility;

/**
 * @Description 单一职责
 * @Date 2019/10/23 14:49
 * @Authod ZG
 * @Version 1.0
 */
public class SingletonResponsibility {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.run("汽车");
        vehicle.run("飞机");
    }
}

// 交通工具类
class Vehicle{
    public void run(String name){
        System.out.println(name+"在公路上跑");
    }
}