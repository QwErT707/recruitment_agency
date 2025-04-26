package com.example.RecruitmentAgency.controller;

import com.example.RecruitmentAgency.Service.ResumeService;
import com.example.RecruitmentAgency.model.Resume;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/resumes")
public class ResumeController {
 private final ResumeService resumeService;

        @Autowired
        public ResumeController(ResumeService resumeService) {
            this.resumeService = resumeService;
        }

        @GetMapping
        public List<Resume> getAllResumes() {
            return resumeService.getAllResumes();
        }

        @GetMapping("/{id}")
        public ResponseEntity<Resume> getResumeById(@PathVariable Long id) {
            Resume resume = resumeService.getResumeById(id);
            return resume != null ? ResponseEntity.ok(resume) : ResponseEntity.notFound().build();
        }

        @PostMapping
        public ResponseEntity<Resume> createResume(@RequestBody Resume resume) {
            Resume createdResume = resumeService.createResume(resume);
            return ResponseEntity.status(HttpStatus.CREATED).body(createdResume);
        }

        @PutMapping("/{id}")
        public ResponseEntity<Resume> updateResume(@PathVariable Long id, @RequestBody Resume resumeDetails) {
            Resume updatedResume = resumeService.updateResume(id, resumeDetails);
            return updatedResume != null ? ResponseEntity.ok(updatedResume) : ResponseEntity.notFound().build();
        }

        @DeleteMapping("/{id}")
        public ResponseEntity<Void> deleteResume(@PathVariable Long id) {
            resumeService.deleteResume(id);
            return ResponseEntity.noContent().build();
        }

}
