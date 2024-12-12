package org.example;

import io.etcd.jetcd.Client;
import io.etcd.jetcd.KV;
import org.junit.Test;

import java.util.concurrent.ExecutionException;

public class TestEtcd {


    @Test
    public void testEtcd() throws InterruptedException {
        // etcd服务器地址
        String etcdEndpoint = "http://localhost:2379"; // 替换为你的 etcd 服务器地址
        // 创建 etcd 客户端
        Client client = Client.builder().endpoints(etcdEndpoint).build();

        // 获取 KV 操作句柄
        KV kvClient = client.getKVClient();

        try {
            String key="test";
            // 获取键值对
            io.etcd.jetcd.kv.GetResponse response = kvClient.get(io.etcd.jetcd.ByteSequence.from(key.getBytes())).get();

            System.out.println("Value: " + response);
        } catch (ExecutionException | InterruptedException e) {
            e.printStackTrace();
        } finally {
            // 关闭 etcd 客户端
            client.close();
        }
        System.out.println("run etcd ok!");
    }

}
