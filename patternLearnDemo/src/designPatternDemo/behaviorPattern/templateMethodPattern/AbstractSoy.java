package designPatternDemo.behaviorPattern.templateMethodPattern;

/**
 * @Description 抽象类(定义模板)
 * @Date 2019/11/1 16:35
 * @Authod ZG
 * @Version 1.0
 */
public abstract class AbstractSoy {

    // 使用一个方法make定义执行步骤，final修饰表示子类不能被覆盖
    final void make(){
        // 按步骤来进行
        select();
        add();
        flush();
        cook();
        needAdd();
    }

    void select(){
        System.out.println("选材");
    }

    // 具体的变化方法交给子类来实现
    abstract void add();

    void flush(){
        System.out.println("清洗");
    }

    void cook(){
        System.out.println("炒菜");
    }

    // 钩子方法，子类可以实现可不实现
    void needAdd(){

    }
}
