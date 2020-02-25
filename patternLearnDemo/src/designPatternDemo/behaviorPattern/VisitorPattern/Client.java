package designPatternDemo.behaviorPattern.VisitorPattern;

/**
 * @Description
 * @Date 2019/11/5 10:08
 * @Authod ZG
 * @Version 1.0
 */
public class Client {
    public static void main(String[] args) {
        ObjectStructure os = new ObjectStructure();

        os.attach(new Man());
        os.attach(new Man());
        os.attach(new Man());

        Success success = new Success();
        os.display(success);
        Fail fail = new Fail();
        os.display(fail);

        os.attach(new Woman());
        os.attach(new Woman());
        os.attach(new Woman());

        os.display(fail);
    }
}
