package designPatternDemo.structuralType.compositePattern;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description 学院类，可以管理depaerment
 * @Date 2019/10/31 9:30
 * @Authod ZG
 * @Version 1.0
 */
public class College extends OrganizationComposite {
    // Department的集合
    List<OrganizationComposite> organizationComposites = new ArrayList<>();

    public College(String name, String desc) {
        super(name, desc);
    }

    @Override
    protected void add(OrganizationComposite organizationComposite) {
        organizationComposites.add(organizationComposite);
    }

    @Override
    protected void remove(OrganizationComposite organizationComposite) {
        organizationComposites.remove(organizationComposite);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public String getDesc() {
        return super.getDesc();
    }

    @Override
    protected void print() {
        System.out.println("============"+getName()+"==============");
        for (OrganizationComposite organizationComposite : organizationComposites) {
            organizationComposite.print();
        }
    }
}
