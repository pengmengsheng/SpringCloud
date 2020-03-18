package com.cloud.hystrix.consumer.controller;

import com.cloud.hystrix.consumer.service.TicketService;
import com.netflix.hystrix.contrib.javanica.annotation.DefaultProperties;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@DefaultProperties(defaultFallback="timeout2")
@RestController
public class TicketController {
    @Resource
    TicketService ticketService;

    @GetMapping("/consumer/ticket/timeout")
   /* @HystrixCommand(fallbackMethod="timeout2",commandProperties={
            @HystrixProperty(name="execution.isolation.thread.timeoutInMilliseconds",value="2000")
    })*/
    @HystrixCommand(commandProperties={
            @HystrixProperty(name="execution.isolation.thread.timeoutInMilliseconds",value="2000")
    })
    String timeout() {
        return ticketService.timeout();
    }

    @GetMapping("/consumer/ticket/buy")
    String ticket() {
        return ticketService.getTicket();
    }
    String timeout2() {
        return "响应超时";
    }
}
