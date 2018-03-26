package com.david.spring.consumer.remote;

import com.david.spring.api.HelloService;
import org.springframework.cloud.openfeign.FeignClient;

/**
 * Created by junwei on 2018/3/18.
 */
@FeignClient(value = "DEMO-PROVIDER")
public interface ReactorHelloService extends HelloService {
}
