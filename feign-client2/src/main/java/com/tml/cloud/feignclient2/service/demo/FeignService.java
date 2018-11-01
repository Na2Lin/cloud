package com.tml.cloud.feignclient2.service.demo;

import com.tml.cloud.feignclient2.service.demo.fallback.FeignServiceFallback;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(value = "eureka-client",fallback = FeignServiceFallback.class)
public interface FeignService {

    @RequestMapping(value = "demo",method = RequestMethod.GET)
    String demo(@RequestHeader("name") String name);
}
