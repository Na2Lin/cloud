package com.tml.cloud.feignclient.controller.demo;

import com.tml.cloud.feignclient.service.demo.FeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping(value = "/demo")
@RestController
@RefreshScope
public class DemoController {


    @Value("${profile-name}")
    String profileName;

    @Autowired
    FeignService feignService;


    @RequestMapping(method = RequestMethod.GET)
    public String helloFeign(@RequestHeader("name") String name) {
        return profileName + feignService.helloFeign(name);
    }

}
