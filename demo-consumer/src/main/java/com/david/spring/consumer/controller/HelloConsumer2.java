package com.david.spring.consumer.controller;

import com.david.spring.api.model.User;
import com.david.spring.consumer.remote.ReactorHelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by junwei on 2018/3/18.
 */
@RestController
public class HelloConsumer2 {
    @Autowired
    private ReactorHelloService reactorHelloService;

    @RequestMapping(value = "feign-consumer", method = RequestMethod.GET)
    public String hello2() {
        StringBuilder sb = new StringBuilder();
        sb.append(reactorHelloService.hello()).append("/n");
        sb.append(reactorHelloService.hello("junwei")).append("/n");
//        sb.append(reactorHelloService.hello("junwei",30)).append("/n");
        sb.append(reactorHelloService.hello(new User("xiaobin",25))).append("/n");
        return sb.toString();
    }
}
