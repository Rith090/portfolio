package com.example.portfolio;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WebController {

    @GetMapping("/")
    public String home() {
        return "index"; // Matches templates/index.html
    }

    @GetMapping("/about")
    public String about() {
        return "aboutme"; // Matches templates/aboutme.html
    }

    @GetMapping("/education")
    public String education() {
        return "education"; // Matches templates/education.html
    }

    @GetMapping("/experience")
    public String experience() {
        return "experience"; // Matches templates/experience.html
    }

    @GetMapping("/project")
    public String project() {
        return "project"; // Matches templates/project.html
    }

    @GetMapping("/skill")
    public String skills() {
        return "skill"; // Matches templates/skill.html
    }

    @GetMapping("/contact")
    public String contact() {
        return "contact"; // Matches templates/contact.html
    }
}