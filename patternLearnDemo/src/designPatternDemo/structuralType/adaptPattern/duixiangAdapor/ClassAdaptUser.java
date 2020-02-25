package designPatternDemo.structuralType.adaptPattern.duixiangAdapor;

/**
 * @Description 使用者（对象适配器）
 * @Date 2019/10/26 15:41
 * @Authod ZG
 * @Version 1.0
 */
public class ClassAdaptUser {

    public void getV(ClassAdaptOut classAdaptOut){
        if(classAdaptOut.getOutV() == 5){
            System.out.println("输出为5v");
        }
    }
}
