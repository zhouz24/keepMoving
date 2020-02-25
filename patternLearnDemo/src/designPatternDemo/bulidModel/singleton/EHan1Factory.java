package designPatternDemo.bulidModel.singleton;

/**
 * @Description 饿汉式(静态常量)
 *  优点：简单易懂，类装载的时候就初始实例化，不会存在线程安全问题，
 *  缺点：类装载（非调用的时候）的时候就初始化，带来额外的内存开销，非懒加载（lazy）
 * @Date 2019/10/23 15:53
 * @Authod ZG
 * @Version 1.0
 *
 */
public class EHan1Factory {
    private EHan1Factory(){ }

    private final static EHan1Factory eHan1Factory = new EHan1Factory();

    public static EHan1Factory getInstance(){
        return eHan1Factory;
    }
}
