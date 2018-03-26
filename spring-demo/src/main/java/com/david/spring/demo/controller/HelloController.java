package com.david.spring.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by junwei on 18/3/4.
 */
@RestController
public class HelloController {
    @Value("${hello.name}")
    private String name;
//    @Autowired
//    private CounterService counterService;
    @RequestMapping("/hello")
    public String hello(){
        return name;
    }
}
