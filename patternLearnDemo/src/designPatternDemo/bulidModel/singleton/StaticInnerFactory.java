package designPatternDemo.bulidModel.singleton;

/**
 * @Description 静态内部类实现单例
 * @Date 2019/10/24 9:54
 * @Authod ZG
 * @Version 1.0
 */
public class StaticInnerFactory {
    private StaticInnerFactory(){}

    // StaicInnerFactory加载时，不会装载
    private static class StaticInner{
        public static final StaticInnerFactory INSTANCE = new StaticInnerFactory();
    }

    public StaticInnerFactory getInstance(){
        return StaticInner.INSTANCE;
    }
}
