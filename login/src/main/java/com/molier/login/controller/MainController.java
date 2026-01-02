package com.molier.login.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping
    public String index(){
        return "index";
    }

    //I am trying to make a login page, but I will do that in a separate controller called AuthController.java
    //main focus will be on communication between AuthController and the frontend (index.html(signup) and login.html)
}
