package com.clound.eureka.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class Server8002Application {

    public static void main(String[] args) {
        SpringApplication.run(Server8002Application.class, args);
    }

}