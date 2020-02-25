package designPatternDemo.bulidModel.builderPattern;

/**
 * @Description 常用的建造者模式
 *  給定一個实体，无法确定哪个属性为必须，哪个为可选，给调用者带来使用的困惑，建造者模式可以解决这种不确定的接口调用
 * @Date 2019/10/28 9:23
 * @Authod ZG
 * @Version 1.0
 */
public class User {
    private final String fristName;
    private final String lastName;
    private final int age;
    private final String phone;

    public String getFristName() {
        return fristName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public String getPhone() {
        return phone;
    }

    // 通过构造者模式传入一个具有相同属性参数的静态内部类
    private User(UserBuilder builder){
        this.fristName = builder.fristName;
        this.lastName = builder.lastName;
        this.age = builder.age;
        this.phone = builder.phone;
    }

    public static class UserBuilder{
        private final String fristName;
        private final String lastName;
        private int age;
        private String phone;

        public UserBuilder(String fristName,String lastName){
            this.fristName = fristName;
            this.lastName = lastName;
        }

        public UserBuilder age(int age){
            this.age = age;
            return this;
        }

        public UserBuilder phone(String phone){
            this.phone = phone;
            return this;
        }

        public User build(){
            return new User(this);
        }
    }

    @Override
    public String toString() {
        return "User{" +
                "fristName='" + fristName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", phone='" + phone + '\'' +
                '}';
    }
}
