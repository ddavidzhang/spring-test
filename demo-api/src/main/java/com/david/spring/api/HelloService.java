package com.david.spring.api;

import com.david.spring.api.model.User;
import org.springframework.web.bind.annotation.*;

/**
 * Created by junwei on 2018/3/18.
 */
public interface HelloService {
    @RequestMapping("/hello")
    String hello();
    @RequestMapping(value = "/hello1",method = RequestMethod.GET)
    String hello(@RequestParam("name") String name);
    @RequestMapping(value = "hello2",method = RequestMethod.GET)
//    @ResponseBody
    User hello (@RequestHeader("name") String name, @RequestHeader("age") int age);
    @RequestMapping(value = "hello3",method = RequestMethod.POST)
    String hello (@RequestBody User user);
}
