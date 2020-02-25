package designPatternDemo.structuralType.proxyPattern.cglibProxy;

/**
 * @Description 被代理的对象
 * @Date 2019/11/1 11:19
 * @Authod ZG
 * @Version 1.0
 */
public class TeacherDao {
    public void teach(){
        System.out.println("老师正在上课中，cglib代理");
    }
}
