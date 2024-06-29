package com.demo.demoproject.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SecretController {
    @GetMapping("/9029")
    public String listMain(Model model) {
        return "secret";
    }
}



