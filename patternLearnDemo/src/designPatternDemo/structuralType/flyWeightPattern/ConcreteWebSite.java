package designPatternDemo.structuralType.flyWeightPattern;

/**
 * @Description 具体网站
 * @Date 2019/10/31 16:38
 * @Authod ZG
 * @Version 1.0
 */
public class ConcreteWebSite extends WebSite {
    // 享元模式中共享的部分，内部状态
    private String type = ""; // 网站的发布形式


    public ConcreteWebSite(String type){
        this.type = type;
    }

    @Override
    public void use(User user) {
        System.out.println("网站的发布形式："+type+",使用者为："+user.getName());
    }
}
