package com.example.RecruitmentAgency.controller_page;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ResumesController_page {

    @GetMapping("/resumes")
    public String resumesList(Model model){
        return "resumes";
    }
}
