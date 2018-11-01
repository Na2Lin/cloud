package com.tml.cloud.feignclient2.service.demo.fallback;

import com.tml.cloud.feignclient2.service.demo.FeignService;
import org.springframework.stereotype.Component;

@Component
public class FeignServiceFallback implements FeignService {
    @Override
    public String demo(String name) {
        return "service error2";
    }
}
