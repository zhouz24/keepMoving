package designPatternDemo.structuralType.compositePattern;

/**
 * @Description 客户端（测试）
 * @Date 2019/10/31 9:48
 * @Authod ZG
 * @Version 1.0
 */
public class Client {
    public static void main(String[] args) {
        // 从大到小创建对象 学校
        OrganizationComposite university = new University("清华大学", "全国顶级大学");

        // 学院
        OrganizationComposite computerCollege = new College("计算机学院","计算机学院");
        OrganizationComposite infoEngineerCollege = new College("信息工程学院","信息工程学院");

        university.add(computerCollege);
        university.add(infoEngineerCollege);

        // 添加系
        computerCollege.add(new Department("计算机科学","专注于计算机"));
        computerCollege.add(new Department("计算机原理","专注于底层"));

        infoEngineerCollege.add(new Department("软件工程","专注于软件开发"));
        infoEngineerCollege.add(new Department("信息工程","专注于通信基础"));

        university.print();
        computerCollege.print();
        infoEngineerCollege.print();
    }

}
