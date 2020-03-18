package com.cloud.hystrix.consumer.service;

import org.springframework.stereotype.Component;

@Component
public class FallBackServiceImpl implements TicketService {
    @Override
    public String ticket() {
        return "ticket fallback";
    }

    @Override
    public String getTicket() {
        return null;
    }

    @Override
    public String timeout() {
        return "timeout fallback";
    }
}
