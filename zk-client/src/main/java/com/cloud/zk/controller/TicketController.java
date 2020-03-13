package com.cloud.zk.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class TicketController {
    @RequestMapping("/ticket")
    @ResponseBody
    public Map<String, Object> getTicket() {
        Map<String, Object> ticket = new HashMap<>();
        ticket.put("name", "《美人鱼》");
        return ticket;
    }
}
