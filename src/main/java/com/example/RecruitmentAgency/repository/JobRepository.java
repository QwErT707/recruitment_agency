package com.example.RecruitmentAgency.repository;

import com.example.RecruitmentAgency.model.Job;
import com.example.RecruitmentAgency.model.User;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface JobRepository extends JpaRepository<Job, Long> {
    List<Job> findByEmployer(User employer);
}
