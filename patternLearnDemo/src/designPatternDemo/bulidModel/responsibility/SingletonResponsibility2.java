package designPatternDemo.bulidModel.responsibility;

/**
 * @Description
 * @Date 2019/10/23 14:53
 * @Authod ZG
 * @Version 1.0
 */
public class SingletonResponsibility2 {
    public static void main(String[] args) {

    }
}

class RoadVehicle{
    public void run(String name){
        System.out.println(name+"公路运行");
    }
}

class AirVehicle{
    public void run(String name){
        System.out.println(name+"在天上跑");
    }
}
