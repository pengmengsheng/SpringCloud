package cloud.nacos.config.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author pms
 * @date 2020/3/25 17:27
 * @since 1.0
 */
@RestController
@RefreshScope
@RequestMapping("/config")
public class ConfigController {

    @Value("${config.id}")
    private String id;

    @GetMapping("/get")
    public String get(){
        return id;
    }
}
