package com.arashiq.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author arashiQ
 * @data 2016/06/20
 */
@Controller
public class LoginController {
    @RequestMapping(value="/login")
    public String login(){
        return "login";
    }

}
