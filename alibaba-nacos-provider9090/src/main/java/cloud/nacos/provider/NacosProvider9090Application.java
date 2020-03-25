package cloud.nacos.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author pms
 * @date 2020/3/25 15:50
 * @since 1.0
 */
@SpringBootApplication
@EnableDiscoveryClient
public class NacosProvider9090Application {
    public static void main(String[] args) {
        SpringApplication.run(NacosProvider9090Application. class,args);
    }
}
