package com.ghp.myproject.user.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/api/users")
public class Usercontroller {

    @RequestMapping("")
    @ResponseBody
    public String users(){

        return "usawdeaw";
    }
}
