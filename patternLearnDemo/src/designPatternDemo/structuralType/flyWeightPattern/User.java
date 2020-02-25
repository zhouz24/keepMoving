package designPatternDemo.structuralType.flyWeightPattern;

/**
 * @Description 网站用户（享元模式中的可变部分）
 * @Date 2019/10/31 16:53
 * @Authod ZG
 * @Version 1.0
 */
public class User {
    private String name;

    public User(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
