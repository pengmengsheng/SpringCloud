package cloud.nacos.consumer.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @author pms
 * @date 2020/3/25 16:27
 * @since 1.0
 */
@RestController
public class EchoController {
    @Resource
    RestTemplate restTemplate;
    @Value("${ service.nacos-service}")
    private String SERVICE_URL;

    @GetMapping("/echo/{id}")
    public String echo(@PathVariable String id){
        return restTemplate.getForObject(SERVICE_URL+"/echo/"+id,String.class);
    }
}
