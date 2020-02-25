package designPatternDemo.structuralType.flyWeightPattern;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

/**
 * @Description
 * @Date 2019/10/31 17:01
 * @Authod ZG
 * @Version 1.0
 */
public class Test {
    public static void main(String[] args) {
        Integer x = Integer.valueOf(127);
        Integer y = new Integer(127);
        Integer z = Integer.valueOf(127);
        Integer h = new Integer(127);

        System.out.println(x.equals(y)); // true
        System.out.println(x == y); // false
        System.out.println(x == z); // true
        System.out.println(y == h); // false

        System.out.println(x.hashCode());
        System.out.println(y.hashCode());
        System.out.println(z.hashCode());
        System.out.println(h.hashCode());


        System.out.println(x == 127);
        x = new Integer(128);
        System.out.println(x == 128);
        Integer i1 = 127;
        Integer i2 = 127;
        System.out.println(i1 == i2);
    }
}
