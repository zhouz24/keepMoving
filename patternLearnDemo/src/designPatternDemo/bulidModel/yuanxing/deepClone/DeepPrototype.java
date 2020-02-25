package designPatternDemo.bulidModel.yuanxing.deepClone;

import java.io.*;

/**
 * @Description
 * @Date 2019/10/24 19:22
 * @Authod ZG
 * @Version 1.0
 */
public class DeepPrototype implements Serializable, Cloneable {
    private String name;
    private Integer age;

    public DeepClone deepClone;

    public DeepPrototype() {
        super();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    // 深拷贝 方式1、重写克隆方法，每个引用单个处理
    @Override
    protected Object clone() throws CloneNotSupportedException {
        Object deep = null;
        // 完成对基本数据类型和String的克隆
        deep = super.clone();

        // 对引用类型的属性，进行单独的处理
        DeepPrototype deepPrototype = (DeepPrototype) deep;
        deepPrototype.deepClone = (DeepClone) deepClone.clone();

        return deepPrototype;
    }

    // 深拷贝，方法二：通过对象的序列化实现（推荐方式） 一次处理多个引用对象
    public Object deepc() {
        // 创建流对象
        ByteArrayOutputStream bos = null;  // 字节数组
        ObjectOutputStream oos = null; // 对象
        ByteArrayInputStream bis = null;
        ObjectInputStream ois = null;

        try {
            // 序列化
            bos = new ByteArrayOutputStream();
            oos = new ObjectOutputStream(bos);
            // 当前对象以对象流的方式输出
            oos.writeObject(this);

            // 反序列化
            bis = new ByteArrayInputStream(bos.toByteArray());
            ois = new ObjectInputStream(bis);

            DeepPrototype deepPrototype = (DeepPrototype) ois.readObject();
            return deepPrototype;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        } finally {
            try {
                bos.close();
                oos.close();
                bis.close();
                ois.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
