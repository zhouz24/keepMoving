package designPatternDemo.bulidModel.yuanxing.deepClone;

/**
 * @Description
 * @Date 2019/10/24 19:29
 * @Authod ZG
 * @Version 1.0
 */
public class Client {
    public static void main(String[] args) throws CloneNotSupportedException {

        DeepPrototype p = new DeepPrototype();
        p.setAge(12);
        p.setName("武松");
        p.deepClone = new DeepClone("大牛","大马");

        // 方式一完成深拷贝

       // DeepPrototype p2 = (DeepPrototype) p.clone();
        DeepPrototype p2 = (DeepPrototype) p.deepc();

        System.out.println(p.hashCode());
        System.out.println(p2.hashCode());

        System.out.println(p.deepClone.hashCode());
        System.out.println(p2.deepClone.hashCode());

    }
}
