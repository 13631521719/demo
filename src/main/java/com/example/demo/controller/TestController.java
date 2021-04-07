package com.example.demo.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Controller
public class TestController {


    @RequestMapping("/test")
    public @ResponseBody Map test()throws Exception{
        Map<String,String> map=new HashMap<>();
        map.put("code","1001");
        map.put("message","这是返回的消息85544");
        return map;
    }
}
