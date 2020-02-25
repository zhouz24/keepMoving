package designPatternDemo.bulidModel.yuanxing;

/**
 * @Description 原型模式实现cloneable接口
 * @Date 2019/10/24 16:33
 * @Authod ZG
 * @Version 1.0
 */
public class Sheep implements Cloneable{
    private String name;
    private Integer age;
    private String color;

    public Sheep(String name, Integer age, String color) {
        super();
        this.name = name;
        this.age = age;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Sheep{ name='" + name + '\'' +
                ", age=" + age + ", color='" + color + '\'' + '}';
    }

    @Override
    protected Object clone() {
        Sheep sheep = null;

        try {
            sheep = (Sheep) super.clone();
        } catch (CloneNotSupportedException e1) {
            System.out.println(e1.getMessage());
        }

        return sheep;
    }
}
