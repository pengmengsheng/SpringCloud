package cloud.rabbitmq.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author pms
 * @date 2020/3/23 8:38
 * @since 1.0
 */
@SpringBootApplication
@EnableEurekaClient
public class RabbitmqClient8081Application {
    public static void main(String[] args) {
        SpringApplication.run(RabbitmqClient8081Application. class,args);
    }
}
