package com.example.RecruitmentAgency.Service;

import com.example.RecruitmentAgency.model.Job;
import com.example.RecruitmentAgency.repository.JobRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobService {
    private final JobRepository jobRepository;

    @Autowired
    public JobService(JobRepository jobRepository){
        this.jobRepository = jobRepository;
    }
    public List<Job> getAllJobs(){
        return jobRepository.findAll();
    }

    public Job getJobById(Long id){
        return jobRepository.findById(id).orElse(null);
    }

    public Job createJob(Job job){
        return jobRepository.save(job);
    }
    public Job updateJob(Long id, Job jobDetails){
        Job job = jobRepository.findById(id).orElse(null);
        if(job !=null){
            job.setTitle(jobDetails.getTitle());
            job.setDescription(jobDetails.getDescription());
            return jobRepository.save(job);
        }
        return null;
    }

    public void deleteJob(Long id){
        jobRepository.deleteById(id);
    }
}
