package designPatternDemo.structuralType.proxyPattern.cglibProxy;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @Description 代理类
 * 实现MethodInterceptor
 * @Date 2019/11/1 11:20
 * @Authod ZG
 * @Version 1.0
 */
public class ProxyFactory implements MethodInterceptor {
    // 维护一个目标对象
    private Object target;

    // 构造器，传入被代理的对象
    public ProxyFactory(Object target){
        this.target = target;
    }

    // 返回一个代理对象: 是target对象的代理对象
    public Object getProxyInstance(){
        // 1、创建一个工具类
        Enhancer enhancer = new Enhancer();
        // 2、设置父类
        enhancer.setSuperclass(target.getClass());
        // 3、设置回调函数
        enhancer.setCallback(this);
        // 4、创建子类，即代理对象
        return enhancer.create();
    }

    // 重写intercept方法，会调用目标对象的方法
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("cglib代理模式开始");
        Object result = method.invoke(target, objects);
        System.out.println("cglib代理模式结束");
        return result;
    }
}
