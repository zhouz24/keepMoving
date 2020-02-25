package designPatternDemo.bulidModel.singleton;

/**
 * @Description 双重校验锁（比较推荐）
 * 同时实现了懒加载，和多线程的线程安全
 * @Date 2019/10/22 14:45
 * @Authod ZG
 * @Version 1.0
 */
public class LanHan2Factory {
    private static LanHan2Factory lanHan2Factory;

    public static LanHan2Factory getInstance(){
        if(null == lanHan2Factory){
            synchronized (LanHan2Factory.class){
                if(null == lanHan2Factory){
                    lanHan2Factory = new LanHan2Factory();
                }
            }
        }
        return lanHan2Factory;
    }
}
