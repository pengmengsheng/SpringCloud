package cloud.nacos.provider.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author pms
 * @date 2020/3/25 15:51
 * @since 1.0
 */
@RestController
public class ProviderController {

    @Value("${server.port}")
    private String port;

    @GetMapping(value = "/echo/{id}")
    public String echo(@PathVariable String id) {
        return "Hello Nacos Discovery "+port + id;
    }
}
