package com.jwt.example.controller;

import com.jwt.example.models.User;
import com.jwt.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/hoo")
public class HomeController {

    @Autowired
    private UserService userService;
    //http://localhost:8082/home/users
    @GetMapping("/user")
    public List<User> getUser(){
        System.out.println("getting users");
        return userService.getUsers();
    }
}
