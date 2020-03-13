package com.cloud.zkconsumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class TicketController {
    private static final String CLEINT_URL = "http://zookeeper-client";
    @Autowired
    RestTemplate restTemplate;

    @GetMapping("/ticket")
    public String getTicket(){
        System.out.println("开始调用");
        return restTemplate.getForObject(CLEINT_URL+"/ticket",String.class);
    }
}
