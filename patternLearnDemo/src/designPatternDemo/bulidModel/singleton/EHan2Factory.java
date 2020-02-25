package designPatternDemo.bulidModel.singleton;

/**
 * @Description 饿汉式（静态代码块）
 * 与饿汉式的静态成员一样，初始化就加载
 * @Date 2019/10/23 15:55
 * @Authod ZG
 * @Version 1.0
 */
public class EHan2Factory {
    // 构造器私有化，外部不能new
    private EHan2Factory(){ }

    private static EHan2Factory eHan2Factory;

    static {
        eHan2Factory = new EHan2Factory();
    }

    public static EHan2Factory getInstance(){
        return eHan2Factory;
    }
}
