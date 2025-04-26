package com.example.RecruitmentAgency.controller;

import com.example.RecruitmentAgency.Service.JobService;
import com.example.RecruitmentAgency.model.Job;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/jobs")
public class JobController {
    private final JobService jobService;
    @Autowired
    public JobController(JobService jobService){
        this.jobService=jobService;
    }

    @GetMapping
    public List<Job> getAllJobs(){
        return jobService.getAllJobs();
    }
    @GetMapping("/{id}")
    public ResponseEntity<Job> getJobById(@PathVariable Long id){
        Job job= jobService.getJobById(id);
        return job != null ? ResponseEntity.ok(job) :ResponseEntity.notFound().build();
    }

    @PostMapping
    public ResponseEntity<Job> createJob(@RequestBody Job job){
        Job createJob= jobService.createJob(job);
        return ResponseEntity.status(HttpStatus.CREATED).body(createJob);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Job> updateJob(@PathVariable Long id, @RequestBody Job jobDetails){
        Job updateJob = jobService.updateJob(id, jobDetails);
        return updateJob != null ? ResponseEntity.ok(updateJob) : ResponseEntity.notFound().build();
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteJob(@PathVariable Long id){
        jobService.deleteJob(id);
        return ResponseEntity.noContent().build();
    }
}
