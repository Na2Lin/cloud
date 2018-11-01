package com.tml.cloud.eurekaclient.controller.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "demo")
public class DemoController {

    @Value("${server.port}")
    private int port;

    @RequestMapping(method = RequestMethod.GET)
    public String helloWorld(@RequestHeader("name") String name) {
        return "hello, " + name + "this is " + port;
    }
}
