package com.demo.demoproject.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PurposeController {
    @GetMapping("/purpose")
    public String listMain(Model model) {
        return "purpose";
    }
}

