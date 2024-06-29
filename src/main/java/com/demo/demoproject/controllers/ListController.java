package com.demo.demoproject.controllers;

import com.demo.demoproject.models.Lecturer;
import com.demo.demoproject.services.LecturerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class ListController {

    private final LecturerService lecturerService;

    @Autowired
    public ListController(LecturerService lecturerService) {
        this.lecturerService = lecturerService;
    }

    @GetMapping("/list")
    public String listMain(Model model) {
        List<Lecturer> lecturers = lecturerService.getAllLecturers();
        model.addAttribute("lecturers", lecturers);
        return "list-main";
    }
}
