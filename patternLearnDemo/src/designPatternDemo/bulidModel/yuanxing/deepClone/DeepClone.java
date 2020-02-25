package designPatternDemo.bulidModel.yuanxing.deepClone;

import java.io.Serializable;

/**
 * @Description 深拷贝
 * @Date 2019/10/24 19:19
 * @Authod ZG
 * @Version 1.0
 */
public class DeepClone implements Serializable,Cloneable {

    private String cloneName;
    private String cloneClass;

    public DeepClone(String cloneName,String cloneClass){
        this.cloneName = cloneName;
        this.cloneClass = cloneClass;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
