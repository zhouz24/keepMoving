package com.enjoy.zk1;

import org.apache.zookeeper.*;
import org.apache.zookeeper.data.Stat;

import java.io.IOException;
import java.util.EventListener;
import java.util.List;
import java.util.concurrent.CountDownLatch;

/**
 * @Description 原生zk客户端
 * @Date 2019/12/25 10:08
 * @Authod ZG
 * @Version 1.0
 */
public class JavaApiZookeeperDemo {
    // 连接地址
    private final static String CONN = "127.0.0.1:2181";
    // 发令枪(线程计数器) //参数count为计数值
    private static CountDownLatch countDownLatch = new CountDownLatch(1);

    public static void main(String[] args) throws Exception {
        // 创建会话
        ZooKeeper zooKeeper = new ZooKeeper(CONN, 5000, new Watcher() {
            @Override
            public void process(WatchedEvent watchedEvent) {
                // 连接成功后再执行下面的代码
                if(watchedEvent.getState() == Event.KeeperState.SyncConnected){
                    // 计数器减一
                    countDownLatch.countDown();
                }
            }
        });

        //调用await()方法的线程会被挂起，它会等待直到count值为0才继续执行
        countDownLatch.await();
        System.out.println(zooKeeper.getState());

        // 创建节点，（节点名称，节点数据，节点权限，节点类型）
        /*String s = zooKeeper.create("/enjoy2", "enjoy1".getBytes(), ZooDefs.Ids.OPEN_ACL_UNSAFE, CreateMode.PERSISTENT);
        System.out.println("创建成功，" + s);
        */

        // 获取节点数据
        /*
        Stat stat = new Stat();
        byte[] result = zooKeeper.getData("/enjoy2", true, stat);
        String data = new String(result);
        System.out.println("节点数据：" + data);*/

        // 修改数据
        /*zooKeeper.setData("/enjoy2","enjoy2".getBytes(),-1);
        Stat stat = new Stat();
        byte[] result = zooKeeper.getData("/enjoy2", true, stat);
        String data = new String(result);
        System.out.println("节点数据：" + data);*/

        // 删除节点
        // zooKeeper.delete("/enjoy2",-1);

        // 获取子节点
        List<String> children = zooKeeper.getChildren("/", true);
        System.out.println(children);
    }
}
