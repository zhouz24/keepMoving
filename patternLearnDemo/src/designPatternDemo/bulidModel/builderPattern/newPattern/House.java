package designPatternDemo.bulidModel.builderPattern.newPattern;

/**
 * @Description pojo实体类
 * @Date 2019/10/25 16:21
 * @Authod ZG
 * @Version 1.0
 */
public class House {
    public House(){}
    private String name;
    private Integer cleer;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getCleer() {
        return cleer;
    }

    public void setCleer(Integer cleer) {
        this.cleer = cleer;
    }


}
