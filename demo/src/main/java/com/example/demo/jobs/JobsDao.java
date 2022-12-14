package com.example.demo.jobs;

public interface JobsDao {
    public int save(Jobs jobs);

    public Jobs getJobTitleById (int job_id);

}
