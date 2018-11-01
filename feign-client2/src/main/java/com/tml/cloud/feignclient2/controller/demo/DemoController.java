package com.tml.cloud.feignclient2.controller.demo;

import com.tml.cloud.feignclient2.service.demo.FeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/demo")
public class DemoController {

    @Autowired
    FeignService feignService;

    @RequestMapping(method = RequestMethod.GET)
    public String demo(@RequestHeader("name") String name) {
        return 2+feignService.demo(name);
    }
}
