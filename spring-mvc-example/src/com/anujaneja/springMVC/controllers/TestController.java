package com.anujaneja.springMVC.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestController {

    @GetMapping("/test/index")
    public String index(Model model) {

        model.addAttribute("test","testValue");

        return "index";
    }
}
