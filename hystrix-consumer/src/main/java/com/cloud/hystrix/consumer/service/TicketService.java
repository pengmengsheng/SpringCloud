package com.cloud.hystrix.consumer.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

@Service
@FeignClient("hystrix-client")
public interface TicketService {

    @GetMapping("/ticket/get")
     String ticket();

    @GetMapping("/ticket/timeout")
     String timeout();
}
