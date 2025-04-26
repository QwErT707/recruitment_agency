package com.example.RecruitmentAgency.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Controller
public class Helcontroller {
    @GetMapping("/hello")
    public String Hello(Model model){

        model.addAttribute("currentTime", LocalDateTime.now());
        return "index";
    }
}
