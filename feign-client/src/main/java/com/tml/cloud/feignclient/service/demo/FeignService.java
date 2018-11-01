package com.tml.cloud.feignclient.service.demo;


import com.tml.cloud.feignclient.service.demo.fallback.FeignServiceFallback;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(value = "eureka-client",fallback = FeignServiceFallback.class)
public interface FeignService {

    @RequestMapping(value = "demo",method = RequestMethod.GET)
    String helloFeign(@RequestHeader("name") String name);
}
