package cloud.sentinel.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author pms
 * @date 2020/3/28 9:47
 * @since 1.0
 */
@SpringBootApplication
@EnableDiscoveryClient
public class SentinelServiceImplApplication {
    public static void main(String[] args) {
        SpringApplication.run(SentinelServiceImplApplication.class, args);
    }
}
