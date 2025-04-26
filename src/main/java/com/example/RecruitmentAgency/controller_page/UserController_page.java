package com.example.RecruitmentAgency.controller_page;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController_page {

    @GetMapping("/users")
    public String userList(Model model) {
        return "users";
    }
}
