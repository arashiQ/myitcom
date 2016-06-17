package com.arashiq;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by A13054 on 2016/06/17.
 */
@Controller
public class HelloController {
    @RequestMapping(method= RequestMethod.GET)
    public String index(Model model){
        model.addAttribute("hello", "HelloHello");
        return "index";
    }

}
