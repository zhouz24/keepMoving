package designPatternDemo.bulidModel.singleton;

/**
 * @Description 同步方法 懒汉式，锁住整个类，效率有问题
 * @Date 2019/10/22 15:04
 * @Authod ZG
 * @Version 1.0
 */
public class LanHan3Factory {
    private static LanHan3Factory lanHan3Factory;

    public static synchronized LanHan3Factory getLanHan3Factory(){
        if(null == lanHan3Factory){
            lanHan3Factory = new LanHan3Factory();
        }
        return lanHan3Factory;
    }
}
