package com.demo.demoproject.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class LibraryController {

    @GetMapping("/library")
    public String home(Model model) {
        return "library";
    }

}