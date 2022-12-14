package com.example.demo.jobs;

import com.example.demo.employees.Employees;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class JobsController {
    @Autowired
    JobsDaoImpl jobsDaoImpl;

    @PostMapping("/addJob")
    public String addJob(@RequestBody Jobs jobs){
        int res=jobsDaoImpl.save(jobs);
        if(res==1) {
            return "added successfully";
        }
        else {
            return "Check syntax and values";
        }
    }

    @GetMapping("/getJobTitleById/{job_id}")
    public Jobs getJobTitleById(@PathVariable int job_id) {
    Jobs title = jobsDaoImpl.getJobTitleById(job_id);
        return title;

   }
}
