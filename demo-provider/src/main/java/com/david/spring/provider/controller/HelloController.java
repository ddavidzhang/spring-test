package com.david.spring.provider.controller;

import com.david.spring.api.HelloService;
import com.david.spring.api.model.User;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by junwei on 18/3/4.
 */
@RestController
public class HelloController implements HelloService {
    @Override
    public String hello() {
        return "world";
    }

    @Override
    public String hello(@RequestParam("name") String name) {
        return "hello " + name;
    }

    @Override
    public User hello(@RequestHeader("name") String name, @RequestHeader("age") int age) {
        return new User(name, age);
    }

    @Override
    public String hello(@RequestBody User user) {
        return user.toString();
    }
}
