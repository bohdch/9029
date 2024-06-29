package com.demo.demoproject.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class WebController {

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("name", "Main page");
        return "home";
    }

}