package com.cloud.zk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient//向zookeeper注册中心注册服务
public class ZkClientApplication {
    public static void main(String[] args){
        SpringApplication.run(ZkClientApplication.class,args);
    }


}
