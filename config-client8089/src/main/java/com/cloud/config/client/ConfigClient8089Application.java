package com.cloud.config.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author pms
 * @date 2020/3/22 13:39
 * @since 1.0
 */
@SpringBootApplication
@EnableEurekaClient
public class ConfigClient8089Application {
    public static void main(String[] args) {
        SpringApplication.run(ConfigClient8089Application.class, args);
    }
}
