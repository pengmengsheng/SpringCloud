package cloud.nacos.consumer.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;
import java.util.Map;

/**
 * @author pms
 * @date 2020/3/25 16:27
 * @since 1.0
 */
@RestController
public class EchoController {
    @Resource
    RestTemplate restTemplate;
    private String SERVICE_URL = "http://nacos-provider";

    @GetMapping("/echo/{id}")
    public String echo(@PathVariable String id){
        return restTemplate.getForObject(SERVICE_URL+"/echo/"+id,String.class);
    }
    @PostMapping("/send")
    public void post(Map<String,Object> param){
        System.out.println(param);
    }
}
