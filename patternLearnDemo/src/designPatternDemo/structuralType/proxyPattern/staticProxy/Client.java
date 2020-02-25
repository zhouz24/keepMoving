package designPatternDemo.structuralType.proxyPattern.staticProxy;

/**
 * @Description
 * @Date 2019/11/1 9:37
 * @Authod ZG
 * @Version 1.0
 */
public class Client {
    public static void main(String[] args) {
        // 创建目标对象（被代理的对象）
        TeacherDao teacherDao = new TeacherDao();
        // 创建代理对象
        TeacherProxy teacherProxy = new TeacherProxy(teacherDao);
        // 指定代理方法
        teacherProxy.teach();
    }
}
