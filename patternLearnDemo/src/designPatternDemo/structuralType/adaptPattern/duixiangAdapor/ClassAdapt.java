package designPatternDemo.structuralType.adaptPattern.duixiangAdapor;

/**
 * @Description 转换器（对象适配器不能继承，使用聚合）
 * @Date 2019/10/26 15:39
 * @Authod ZG
 * @Version 1.0
 */
public class ClassAdapt implements ClassAdaptOut {
    private ClassAdaptorSrc src ;

    public ClassAdapt(ClassAdaptorSrc src){
        this.src = src;
    }

    @Override
    public int getOutV() {
        int out = 0;
        if(null != src){
            out = src.outClass()/44;
        }
        return out;
    }
}
