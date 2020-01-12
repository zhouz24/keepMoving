package com.enjoy.zk2;

import org.I0Itec.zkclient.IZkChildListener;
import org.I0Itec.zkclient.IZkDataListener;
import org.I0Itec.zkclient.ZkClient;
import org.I0Itec.zkclient.exception.ZkMarshallingError;
import org.I0Itec.zkclient.serialize.ZkSerializer;

import java.io.UnsupportedEncodingException;
import java.util.List;

/**
 * @Description zkclient客户端
 * @Date 2019/12/25 10:34
 * @Authod ZG
 * @Version 1.0
 */
public class ZkClientDemo {

    // 连接地址
    private final static String CONN = "127.0.0.1:2181";

    public static void main(String[] args) {
        // 创建会话
        ZkClient zkClient = new ZkClient(CONN, 5000, 5000, new ZkSerializer() {
            @Override
            public byte[] serialize(Object o) throws ZkMarshallingError {
                byte[] bytes = new byte[0];
                try {
                    bytes = String.valueOf(0).getBytes("UTF-8");
                } catch (UnsupportedEncodingException e) {
                    e.printStackTrace();
                }
                return bytes;
            }

            @Override
            public Object deserialize(byte[] bytes) throws ZkMarshallingError {
                String result = null;
                try {
                    result = new String(bytes,"UTF-8");
                } catch (UnsupportedEncodingException e) {
                    throw new ZkMarshallingError("Wrong Charset:" + "UTF-8");
                }
                return result;
            }
        });
        System.out.println("success");
        // 节点路径，createParents设置为true，即创建级联节点
        //zkClient.createPersistent("/enjoy2/zkclient1/zkclient1-1",true);

        // 级联删除（删除节点下的所有数据，包括子节点）
        //zkClient.deleteRecursive("/enjoy2/zkclient1");
//        System.out.println("删除成功");
//        List<String> children = zkClient.getChildren("/");
//        System.out.println(children);

        // zkClient.delete("/enjoy2/zkclient1");

        zkClient.createPersistent("/node1/node1-1/node1-1-1",true);

        // 监听事件（监听节点数据变化数据）
        zkClient.subscribeDataChanges("/node1", new IZkDataListener() {
            @Override
            public void handleDataChange(String s, Object o) throws Exception {
                System.out.println("节点名称："+ s +"节点修改后的值，" + o);
            }

            @Override
            public void handleDataDeleted(String s) throws Exception {

            }
        });

        // 监听事件（监听节点子列表变化数据）
        zkClient.subscribeChildChanges("/node1", new IZkChildListener() {
            @Override
            public void handleChildChange(String s, List<String> list) throws Exception {
                System.out.println("节点名称："+ s +"，修改后的子节点列表，" + list);
            }
        });

        Object o = zkClient.readData("/node1");
        System.out.println("node1的值："+o);
    }
}
