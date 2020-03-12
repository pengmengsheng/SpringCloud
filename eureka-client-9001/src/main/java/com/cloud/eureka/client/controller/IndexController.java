package com.cloud.eureka.client.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@Controller
public class IndexController {

    @RequestMapping("/ticket")
    @ResponseBody
    public Map<String,Object> getTicket(){
        Map<String,Object> ticket = new HashMap<>();
        ticket.put("name","美人鱼");
        return ticket;
    }
}