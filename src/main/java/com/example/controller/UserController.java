package com.example.controller;

import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AutoConfiguration
public class UserController {

    private String result= "SUCCESS";

    @GetMapping("/users/get")
    public String getUserDetails(){
        return result;
    }
}
