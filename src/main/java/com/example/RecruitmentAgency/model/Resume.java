package com.example.RecruitmentAgency.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Resume {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long user_id;
    private String name;
    private String content;
    private String email;
    private String phone;
    private String experience; // Опыт работы
    private String skills; // Навыки
    public Resume() {
    }
    public Resume(Long id, Long user_id,String name, String email, String phone, String experience, String skills, String content) {
        this.id = id;
        this. user_id= user_id;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.content = content;
        this.experience = experience;
        this.skills = skills;
    }

    public String getContent() {
        return content;
    }

    public Long getuser_id() {
        return  user_id;
    }

    public void setuser_id(Long  user_id) {
        this. user_id =  user_id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getExperience() {
        return experience;
    }

    public void setExperience(String experience) {
        this.experience = experience;
    }

    public String getSkills() {
        return skills;
    }
    public void setContent(String content) {
        this.content = content;
    }
    public void setSkills(String skills) {
        this.skills = skills;
    }
}
