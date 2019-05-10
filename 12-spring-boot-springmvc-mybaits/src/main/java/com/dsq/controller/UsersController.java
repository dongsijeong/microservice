package com.dsq.controller;

import com.dsq.domain.Users;
import com.dsq.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/users")
public class UsersController {

    @Autowired
    private UsersService usersService;
    /**
     * 页面跳转
     */
    @RequestMapping("/{page}")
    public String showPage(@PathVariable String page){
        return page;
    }
    /**
     * 查询所有用户
     */
    @RequestMapping("/findUsersAll")
    public String findUsersAll(Model model){

        List<Users> list =  this.usersService.findUsersAll();
        model.addAttribute("list", list);
        return "list";
    }
    /**
     * 根据用户id查询用户
     */

    @RequestMapping("/findUserById/{id}")
    public String findUserById( @PathVariable Integer id, Model model){
        Users user = this.usersService.findUserById(id);
        model.addAttribute("user", user);
        return "update";
    }
    /**
     * 添加用户
     */
    @RequestMapping("/addUser")
    public String addUser(Users users){
        this.usersService.addUser(users);
        return "success";
    }
    /**
     * 修改用户
     */
    @RequestMapping("/updateUser")
    public String updateUser(Users users){
        this.usersService.updateUser(users);
        return "success";
    }
    /**
     * 删除用户
     */
    @RequestMapping("/deleteUserById/{id}")
    public String deleteUserById(@PathVariable Integer id){
        this.usersService.deleteUserById(id);
        return "redirect:/users/findUsersAll";
    }
}
