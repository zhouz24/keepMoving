package designPatternDemo.bulidModel.builderPattern;

/**
 * @Description
 * @Date 2019/10/25 16:07
 * @Authod ZG
 * @Version 1.0
 */
public class Test {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("helloWorld");

        // 类似于stringbuilder的链式编程
        User user = new User.UserBuilder("james","caps")
                        .age(10)
                        .phone("321432")
                        .build();
        System.out.println(user.toString());
    }
}
