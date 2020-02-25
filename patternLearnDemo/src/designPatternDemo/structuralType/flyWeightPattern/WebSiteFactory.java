package designPatternDemo.structuralType.flyWeightPattern;

import java.util.HashMap;
import java.util.Map;

/**
 * @Description 网站工厂类
 * @Date 2019/10/31 16:41
 * @Authod ZG
 * @Version 1.0
 */
public class WebSiteFactory {
    // 网站的集合，池
    private Map<String,ConcreteWebSite> pool = new HashMap<>();

    // 根据网站类型，返回一个网站，如果没有就创建一个网站，并放入到池中。
    public WebSite getWebSiteCategory(String type){
        if(!pool.containsKey(type)){
            // 创建一个并存入池中
            pool.put(type,new ConcreteWebSite(type));
        }
        return pool.get(type);
    }

    // 获取池中总数
    public int getPoolCount(){
        return pool.size();
    }
}
