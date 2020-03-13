package com.cloud.eureka.client.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class IndexController {

    @Autowired
    DiscoveryClient discoveryClient;

    @RequestMapping("/ticket")
    @ResponseBody
    public Map<String, Object> getTicket() {
        Map<String, Object> ticket = new HashMap<>();
        ticket.put("name", "美人鱼");
        ticket.put("port", "9002");
        return ticket;
    }

    @GetMapping(value="/discovery")
    @ResponseBody
    public List<String> discovery() {
        //1.
        List<String> services = discoveryClient.getServices();
        for (String service:services) {
            System.out.println(service);
        }
        //2.
        List<ServiceInstance> instances = discoveryClient.getInstances("EUREKA-CLIENT");
        for (ServiceInstance instance : instances) {
            System.out.println(instance.getServiceId());
            System.out.println(instance.getHost());
            System.out.println(instance.getPort());
            System.out.println(instance.getUri());
        }
        return services;
    }
}
