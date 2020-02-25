package designPatternDemo.structuralType.adaptPattern.classAdaptor;

/**
 * @Description 转换器
 * @Date 2019/10/26 15:39
 * @Authod ZG
 * @Version 1.0
 */
public class ClassAdapt extends ClassAdaptorSrc implements ClassAdaptOut{

    @Override
    public int getOutV() {
        int srcV = super.outClass();
        return srcV/44;
    }
}
