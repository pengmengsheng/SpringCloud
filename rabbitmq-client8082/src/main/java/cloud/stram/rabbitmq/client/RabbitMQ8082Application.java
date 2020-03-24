package cloud.stram.rabbitmq.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author pms
 * @date 2020/3/24 9:57
 * @since 1.0
 */
@SpringBootApplication
@EnableEurekaClient
public class RabbitMQ8082Application {
    public static void main(String[] args) {
        SpringApplication.run(RabbitMQ8082Application. class,args);
    }
}
