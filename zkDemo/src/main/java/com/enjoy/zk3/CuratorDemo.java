package com.enjoy.zk3;

import org.apache.curator.framework.CuratorFramework;
import org.apache.curator.framework.recipes.cache.NodeCache;
import org.apache.curator.framework.recipes.cache.PathChildrenCache;

/**
 * @Description Curator客户端
 * @Date 2019/12/25 11:21
 * @Authod ZG
 * @Version 1.0
 */
public class CuratorDemo {
    // 连接地址
    private final static String CONN = "127.0.0.1:2181";

    /**
     * 三种watcher 来做节点监听器
     * pathcache 监听一个路径下子节点的创建、删除、节点数据更新
     * NodeCache 监听一个节点的创建、更新、删除
     * TreeCache pathcache+NodeCache的合体，（监听路径下的创建、更新、删除），缓存路径下所有的节点数据
     *
     * @param args
     */
    public static void main(String[] args) throws Exception {
        CuratorFramework curatorFramework = CuratorClientUtils.getInStance();

        /**
         * 监听节点数据变化
         */
        NodeCache ncache = new NodeCache(curatorFramework, "/curator", false);
        ncache.start(true);
        ncache.getListenable().addListener(() ->
                System.out.println("节点数据发生了变化，变化后的结果" + new String(ncache.getCurrentData().getData()))
        );
        curatorFramework.setData().forPath("/curator", "测试".getBytes());

        /**
         * 监听子节点的变化
         */
        PathChildrenCache paCache = new PathChildrenCache(curatorFramework, "/event", true);
        paCache.start(PathChildrenCache.StartMode.POST_INITIALIZED_EVENT);
        paCache.getListenable().addListener((curatorFramework1, pathChildrenCacheEvent) -> {
            switch (pathChildrenCacheEvent.getType()) {
                case CHILD_ADDED:
                    System.out.println("增加子节点");
                    break;
                case CHILD_REMOVED:
                    System.out.println("删除子节点");
                    break;
                case CHILD_UPDATED:
                    System.out.println("修改子节点");
                    break;
                default:
                    break;
            }
        });

    }
}
