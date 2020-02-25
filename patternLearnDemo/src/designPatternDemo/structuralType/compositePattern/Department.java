package designPatternDemo.structuralType.compositePattern;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description 系
 * @Date 2019/10/31 9:30
 * @Authod ZG
 * @Version 1.0
 */
public class Department extends OrganizationComposite {
    public Department(String name, String desc) {
        super(name, desc);
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
        System.out.println(getName());
    }
}
