package designPatternDemo.structuralType.proxyPattern.dyniticProxy;

/**
 * @Description
 * @Date 2019/11/1 10:44
 * @Authod ZG
 * @Version 1.0
 */
public class Client {
    public static void main(String[] args) {
        /*// 创建目标对象
        ITeacher teacherDao = new TeacherDao();

        // 给目标对象创建动态代理对象, 可以转成ITeacher
        ITeacher proxyInstance = (ITeacher)new ProxyFactory(teacherDao).getProxyInstance();

        // class com.sun.proxy.$Proxy0内存中动态生成了代理对象
        System.out.println(proxyInstance.getClass());

        // 通过代理对象，调用目标方法
        proxyInstance.teach();*/

        TeacherDao teacherDao1 = new TeacherDao();
        ITeacher proxyInstance1 = (ITeacher)new ProxyFactory(teacherDao1).getProxyInstance();
        proxyInstance1.teach();



    }
}
