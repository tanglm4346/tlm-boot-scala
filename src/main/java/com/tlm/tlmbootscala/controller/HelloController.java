package com.tlm.tlmbootscala.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author tanglm
 * @date 2019-03-19 16:07
 * @Description:
 */
@RestController
public class HelloController {
    @GetMapping("/hello")
    public String sayHello(){
        return "hello Spring boot";
    }
}
