package com.tml.cloud.feignclient.service.demo.fallback;

import com.tml.cloud.feignclient.service.demo.FeignService;
import org.springframework.stereotype.Component;

@Component
public class FeignServiceFallback implements FeignService {
    @Override
    public String helloFeign(String name) {
        return "service error";
    }
}
