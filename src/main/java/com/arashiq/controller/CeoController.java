package com.arashiq.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author arashiQ
 * @data 2016/06/20
 */
@RestController
@RequestMapping(value="/ceo")
public class CeoController {
    @RequestMapping(method= RequestMethod.GET)
    public String index(Model model){
        model.addAttribute("hello", "HelloHello");
        return "index";
    }

}
