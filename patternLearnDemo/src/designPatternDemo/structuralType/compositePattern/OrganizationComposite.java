package designPatternDemo.structuralType.compositePattern;

/**
 * @Description
 * @Date 2019/10/31 9:25
 * @Authod ZG
 * @Version 1.0
 */
public abstract class OrganizationComposite {
    private String name; // 名字
    private String desc; // 描述

    public OrganizationComposite(String name ,String desc){
        super();
        this.name = name;
        this.desc = desc;
    }

    protected void add(OrganizationComposite organizationComposite){
        // 默认实现
        throw new UnsupportedOperationException();
    }
    protected void remove(OrganizationComposite organizationComposite){
        // 默认实现
        throw new UnsupportedOperationException();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        desc = desc;
    }

    // 打印方法，做成抽象的
    protected abstract void print();
}
