package com.example.RecruitmentAgency.repository;

import com.example.RecruitmentAgency.model.Resume;
import com.example.RecruitmentAgency.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ResumeRepository  extends JpaRepository<Resume, Long> {
   //Resume findByUserid(User user_id);
}
