package org.lux.service.personal.basic.spring.boot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BasicController {
    @GetMapping(value="/loans/")
    public String hello(){
        return "Hello World!!";
    }
}
