package com.demo.demoproject.controllers;



import com.demo.demoproject.models.Lecturer;
import com.demo.demoproject.models.Review;
import com.demo.demoproject.repositories.ReviewRepository;
import com.demo.demoproject.services.LecturerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Optional;

@Controller
public class LecturerController {

    private final LecturerService lecturerService;
    private final ReviewRepository reviewRepository;

    @Autowired
    public LecturerController(LecturerService lecturerService, ReviewRepository reviewRepository) {
        this.lecturerService = lecturerService;
        this.reviewRepository = reviewRepository;
    }

    @GetMapping("/lecturer/{id}")
    public String getLecturer(@PathVariable Long id, Model model) {
        Optional<Lecturer> lecturerOpt = lecturerService.findById(id);
        if (lecturerOpt.isPresent()) {
            Lecturer lecturer = lecturerOpt.get();
            model.addAttribute("lecturer", lecturer);
            List<Review> reviews = reviewRepository.findByLecturerId(id);
            model.addAttribute("reviews", reviews);
            return "lecturer";
        } else {
            return "error/404";
        }
    }

    @PostMapping("/lecturer/{id}/reviews")
    public String addReview(@PathVariable Long id, @RequestBody Review review) {
        review.setLecturerId(id);
        reviewRepository.save(review);
        return "redirect:/lecturer/" + id;
    }
}