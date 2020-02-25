package designPatternDemo.structuralType.proxyPattern.staticProxy;

/**
 * @Description 代理类（静态代理）
 * 目的：通过teach（）方法调用被代理的类的teach方法，将核心的实现交给被代理的类，公共的处理方法由代理类实现。
 * @Date 2019/11/1 9:35
 * @Authod ZG
 * @Version 1.0
 */
public class TeacherProxy implements ITeacher {
    private ITeacher target; // 目标对象，通过接口来聚合

    public TeacherProxy(ITeacher target){
        this.target = target;
    }
    @Override
    public void teach() {
        System.out.println("开始代理。。。"); // 代理对象实现公共的方法
        target.teach(); // 核心功能是被代理的类实现
        System.out.println("代理结束。。。"); // 代理对象实现公共的方法
    }
}
