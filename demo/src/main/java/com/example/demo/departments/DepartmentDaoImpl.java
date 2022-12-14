package com.example.demo.departments;

import com.example.demo.dependents.Dependents;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class DepartmentDaoImpl implements DepartmentDao{

    @Autowired
    private JdbcTemplate jdbcTemplate;
    @Override
    public Departments save(Departments departments) {
        int dept_id=departments.getDepartment_id();
        String dept_name=departments.getDepartment_name();
        int loc_id=departments.getLocation_id();
        String sql="insert into employees.departments(department_id,department_name,location_id) values(?,?,?);";
        Departments res=jdbcTemplate.queryForObject(sql, BeanPropertyRowMapper.newInstance(Departments.class),dept_id,dept_name,loc_id);
        return res;
    }

    @Override
    public Departments getDeptById(int department_id) {
        String sql="select * from employee.departments where department_id=?;";
        Departments departments=jdbcTemplate.queryForObject(sql,BeanPropertyRowMapper.newInstance(Departments.class),department_id);
        return departments;
    }
}
