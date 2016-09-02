package com.arashiq.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author arashiQ
 * @data 2016/06/20
 */
@Controller
public class IndexController {
    @RequestMapping(value="/", method= RequestMethod.GET)
    public String index(Model model){
        model.addAttribute("hello", "user");
        return "index";
    }

}
