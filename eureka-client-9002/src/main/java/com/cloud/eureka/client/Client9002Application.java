package com.cloud.eureka.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class Client9002Application {
    public static void main(String[] args){
        SpringApplication.run(Client9002Application.class,args);
    }
}
