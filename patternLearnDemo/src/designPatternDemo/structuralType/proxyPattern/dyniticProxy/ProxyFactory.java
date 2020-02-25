package designPatternDemo.structuralType.proxyPattern.dyniticProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @Description 动态代理类
 * @Date 2019/11/1 9:55
 * @Authod ZG
 * @Version 1.0
 */
public class ProxyFactory {
    // 1、维护一个目标对象
    private Object target;

    // 2、构造器，传入对象
    public ProxyFactory(Object target){
        this.target = target;
    }

    // 3、给目标对象生成一个代理对象
    public Object getProxyInstance(){
        // 4、public static Object newProxyInstance(ClassLoader loader, Class<?>[] interfaces, InvocationHandler h)
        // 第一个参数ClassLoader loader：指定当前目标对象使用的类加载器，获取加载器的方法固定
        // 第二个参数Class<?>[] interfaces：目标对象实现的接口类型，使用泛型方法确认类型
        // 第三个参数InvocationHandler h : 事情处理，执行目标对象的方法时，会触发事情处理器方法，会把当前执行的目标对象方法作为参数传入
        return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), new InvocationHandler() {

            // proxy---designPatternDemo.structuralType.proxyPattern.dyniticProxy.TeacherDao@6fdb1f78
            // method----public abstract void designPatternDemo.structuralType.proxyPattern.dyniticProxy.ITeacher.teach()
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                System.out.println("动态代理开始。。。。");
                // 5、使用反射机制调用目标对象方法
                Object result = method.invoke(target, args);
                System.out.println("动态代理结束。。。。");
                return result;
            }
        });
    }
}
