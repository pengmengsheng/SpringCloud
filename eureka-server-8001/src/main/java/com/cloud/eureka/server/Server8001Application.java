package com.cloud.eureka.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class Server8001Application {

    public static void main(String[] args) {
        SpringApplication.run(Server8001Application.class, args);
    }

}