package designPatternDemo.bulidModel.simpleFactory.interfaces;

/**
 * @Description 父类
 * @Date 2019/10/24 10:44
 * @Authod ZG
 * @Version 1.0
 */
public abstract class Pizza {
    private String name;
    // 准备
    public abstract void prepare();

    public void cut(){
        System.out.println(name+"cut >>>");
    }

    public void setName(String name){
        this.name = name;
    }
}
