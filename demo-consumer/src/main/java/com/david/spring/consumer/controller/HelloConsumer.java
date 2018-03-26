package com.david.spring.consumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Created by junwei on 18/3/11.
 */
@RestController
public class HelloConsumer {
    @Autowired
    RestTemplate restTemplate;

    @RequestMapping(value = "ribbon-consumer")
    public String helloConsumer() {
        return restTemplate.getForEntity("http://DEMO-PROVIDER/hello", String.class)
                .getBody();
    }
}
