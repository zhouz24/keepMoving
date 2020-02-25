package designPatternDemo.structuralType.flyWeightPattern;

/**
 * @Description
 * @Date 2019/10/31 16:46
 * @Authod ZG
 * @Version 1.0
 */
public class Client {
    public static void main(String[] args) {
        // 创建一个工厂类
        WebSiteFactory factory = new WebSiteFactory();

        // 创建一个以新闻形式发布的网站
        WebSite webSite = factory.getWebSiteCategory("新闻");
        webSite.use(new User("tom"));

        // 创建一个以博客形式发布的网站
        WebSite webSite2 = factory.getWebSiteCategory("博客");
        webSite2.use(new User("cat"));

        // 创建一个以主页形式发布的网站
        WebSite webSite3 = factory.getWebSiteCategory("主页");
        webSite3.use(new User("jame"));

        // 创建一个以主页形式发布的网站
        WebSite webSite4 = factory.getWebSiteCategory("主页");
        webSite4.use(new User("kobe"));

        System.out.println(factory.getPoolCount());

    }
}
