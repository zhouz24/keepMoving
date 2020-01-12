package com.enjoy.zk3;

import org.apache.curator.framework.CuratorFramework;
import org.apache.curator.framework.CuratorFrameworkFactory;
import org.apache.curator.retry.ExponentialBackoffRetry;

/**
 * @Description 创建curator实例
 * @Date 2019/12/25 11:34
 * @Authod ZG
 * @Version 1.0
 */
public class CuratorClientUtils {
    private static CuratorFramework curatorFramework;
    // 连接地址
    private final static String CONN = "127.0.0.1:2181";

    public static CuratorFramework getInStance() {
        curatorFramework = CuratorFrameworkFactory.newClient(CONN, 5000,
                5000, new ExponentialBackoffRetry(1000, 3));
        curatorFramework.start();
        return curatorFramework;
    }
}
