package com.example.RecruitmentAgency.controller_page;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class JobController_page {

    @GetMapping("/jobs")
    public String jobsList(Model model){
        return "jobs";
    }
}
