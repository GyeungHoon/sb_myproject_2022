package com.ghp.myproject.user.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/api/users")
public class Usercontroller {

    @RequestMapping("")
    public String users(){

        return "users";
    }
}
