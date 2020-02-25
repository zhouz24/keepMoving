package designPatternDemo.bulidModel.singleton;

/**
 * @Description 双重校验锁（比较推荐）
 * 同时实现了懒加载，和多线程的线程安全
 * @Date 2019/10/22 14:45
 * @Authod ZG
 * @Version 1.0
 */
public class DoubleCheckSingleton {
    // 使用volatile可以防止多个线程在初始化的时候可能出现问题，
    // 例如线程A发现该变量lanHan2Factory没有实例化，然后他获取锁并开始变量的初始化，
    // 有可能存在这样一种情况，A正在执行初始化之前就更新lanHan2Factory并将其指向正在初始化的对象，
    // 此时线程B发现lanHan2Factory的状态是已经被初始化，直接获取lanHan2Factory的值，发现还没有初始化完，就可能造成程序崩溃
    // jdk5之后,这一个问题被修正
    private static volatile DoubleCheckSingleton lanHan2Factory;

    public static DoubleCheckSingleton getInstance(){
        if(null == lanHan2Factory){
            synchronized (DoubleCheckSingleton.class){
                if(null == lanHan2Factory){
                    lanHan2Factory = new DoubleCheckSingleton();
                }
            }
        }
        return lanHan2Factory;
    }

    private Object readResolve() {
        return lanHan2Factory;
    }
}
