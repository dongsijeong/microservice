package com.dsq.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UsersController {
    @RequestMapping("/show")
    public String showPage(){
        System.out.println("showPage......init");
        return "index";
    }
}
