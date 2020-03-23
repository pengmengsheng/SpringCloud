package com.cloud.config.client.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author pms
 * @date 2020/3/22 11:40
 * @since 1.0
 */
@RestController
@RefreshScope
public class IndexController {

    @Value("config.id")
    String configId;
    @RequestMapping("/config")
    public String config(){
        return configId;
    }
}
