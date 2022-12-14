package com.example.demo.jobs;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class JobsDaoImpl implements JobsDao{
    @Autowired
    private JdbcTemplate jdbcTemplate;
    @Override
    public int save(Jobs jobs) {
        int job_id=jobs.getJob_id();
        String job_title=jobs.getJob_title();
        String sql="insert into employee.jobs(job_id,job_title) values(?,?);";
        int res=jdbcTemplate.update(sql,job_id,job_title);
        return res;
    }

    @Override
    public Jobs getJobTitleById(int job_id) {
        String sql="select job_title from employee.jobs where job_id=?";
        Jobs title=jdbcTemplate.queryForObject(sql,BeanPropertyRowMapper.newInstance(Jobs.class),job_id);
        return title;
    }
}
