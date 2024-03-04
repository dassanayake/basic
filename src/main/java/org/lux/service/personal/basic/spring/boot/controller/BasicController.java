package org.lux.service.personal.basic.spring.boot.controller;

import org.lux.service.personal.basic.spring.boot.dto.UserBean;
import org.lux.service.personal.basic.spring.boot.entity.User;
import org.lux.service.personal.basic.spring.boot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/users")
public class BasicController {
    @Autowired
    private UserService userService;

    @GetMapping(value="/loans/")
    public String hello(){
        return "Hello World!!";
    }

    @GetMapping(value="/")
    public List<UserBean> getAllUsers(){
        return userService.getAllUsers();
    }
}
