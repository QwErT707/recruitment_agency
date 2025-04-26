package com.example.RecruitmentAgency.Service;

import com.example.RecruitmentAgency.model.Resume;
import com.example.RecruitmentAgency.repository.ResumeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ResumeService {

       private final ResumeRepository resumeRepository;

        @Autowired
        public ResumeService(ResumeRepository resumeRepository) {
            this.resumeRepository = resumeRepository;
        }

        public List<Resume> getAllResumes() {
            return resumeRepository.findAll();
        }

        public Resume getResumeById(Long id) {
            return resumeRepository.findById(id).orElse(null);
        }

        public Resume createResume(Resume resume) {
            return resumeRepository.save(resume);
        }

        public Resume updateResume(Long id, Resume resumeDetails) {
            Resume resume = resumeRepository.findById(id).orElse(null);
            if (resume != null) {
                resume.setName(resumeDetails.getName());
                resume.setEmail(resumeDetails.getEmail());
                resume.setPhone(resumeDetails.getPhone());
                resume.setExperience(resumeDetails.getExperience());
                resume.setSkills(resumeDetails.getSkills());
                return resumeRepository.save(resume);
            }
            return null;
        }

        public void deleteResume(Long id) {
            resumeRepository.deleteById(id);
        }
}
