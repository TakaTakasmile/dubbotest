package com.bjpowernode.controller;

import com.bjpowernode.entity.User;
import com.bjpowernode.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/detail")
    public String userDetail(Model model, Integer id){
        User user = userService.queryUser(id);
        int res = userService.countUser();
        model.addAttribute("user",user);
        model.addAttribute("res",res);
        return "result";
    }

}
