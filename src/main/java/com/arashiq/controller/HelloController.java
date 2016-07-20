package com.arashiq.controller;

import com.arashiq.model.User;
import com.arashiq.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by A13054 on 2016/06/17.
 */
@Controller
public class HelloController {

    @Autowired
    private UserService userService;

    @RequestMapping(method= RequestMethod.GET)
    public String index(Model model){
        User user = new User(-1, "allen", "7777777", 1, 1, 8);
//        User user = userService.getUser(1L);
        user = userService.createuser(user);
        model.addAttribute("hello", "HelloHello");
        model.addAttribute("user", user);
        return "index";
    }

}
