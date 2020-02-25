package designPatternDemo.bulidModel.yuanxing;

/**
 * @Description
 * @Date 2019/10/24 16:40
 * @Authod ZG
 * @Version 1.0
 */
public class Client {
    public static void main(String[] args) {
        Sheep sheep = new Sheep("tom",12,"白色");
        Sheep sheep2 = (Sheep) sheep.clone();

        System.out.println(sheep.toString());
        System.out.println(sheep2.toString());
    }
}
