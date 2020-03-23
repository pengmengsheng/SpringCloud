package cloud.stream.rabbitmq.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author pms
 * @date 2020/3/22 23:21
 * @since 1.0
 */
@SpringBootApplication
@EnableEurekaClient
public class RabbitmqProviderApplication {
    public static void main(String[] args) {
        SpringApplication.run(RabbitmqProviderApplication.class, args);
    }
}
