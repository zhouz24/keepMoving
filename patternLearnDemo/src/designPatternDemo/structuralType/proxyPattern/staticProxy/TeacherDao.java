package designPatternDemo.structuralType.proxyPattern.staticProxy;

/**
 * @Description 实际被代理类
 * @Date 2019/11/1 9:34
 * @Authod ZG
 * @Version 1.0
 */
public class TeacherDao implements ITeacher {
    @Override
    public void teach() {
        System.out.println("老师正在上课");
    }
}
