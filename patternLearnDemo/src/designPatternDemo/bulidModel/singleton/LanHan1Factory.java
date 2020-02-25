package designPatternDemo.bulidModel.singleton;

/**
 * @Description 懒汉式
 * 优点：使用再加载（懒加载），避免了饿汉式的内存开销
 *
 * @Date 2019/10/22 10:46
 * @Authod ZG
 * @Version 1.0
 */
public class LanHan1Factory {
    public LanHan1Factory(){}
    private static LanHan1Factory lanHanFactory;

    private static int i = 0;

    public static LanHan1Factory getLanHanFactory(){
        if(null == lanHanFactory){
            lanHanFactory = new LanHan1Factory();
        }
        return lanHanFactory;
    }

    public void eat(){
        System.out.println("當前數字："+i);
    }
}
