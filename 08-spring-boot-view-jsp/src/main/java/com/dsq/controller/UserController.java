package com.dsq.controller;

import com.dsq.domain.Users;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class UserController {

    @RequestMapping("/showUser")
    public String showUser(Model model){
        List<Users> list = new ArrayList<>();
        list.add(new Users(1,"aa",10));
        list.add(new Users(2,"bb",11));
        list.add(new Users(3,"cc",12));

        model.addAttribute("list", list);

        return "userList";
    }
}
