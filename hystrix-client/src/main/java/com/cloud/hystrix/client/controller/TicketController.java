package com.cloud.hystrix.client.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.TimeUnit;

@RestController
public class TicketController {

    @GetMapping("/ticket/get")
    public String ticket(){
        return "正常调用";
    }
    @GetMapping("/ticket/timeout")
    @HystrixCommand(fallbackMethod="timeout3",commandProperties={
            @HystrixProperty(name="execution.isolation.thread.timeoutInMilliseconds",value="3000")
    })
    public String timeout(){
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "timeout5秒";
    }


    public String timeout3(){
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "系统超时，请稍后再试";
    }
}
