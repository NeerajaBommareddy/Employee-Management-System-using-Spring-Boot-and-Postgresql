package com.example.demo.employees;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public class EmployeesDaoImpl implements EmployeesDao{

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public int save(Employees employees) {
        int employee_id= employees.getEmployee_id();
        String fn= employees.getFirst_name();
        String ln= employees.getLast_name();
        String email= employees.getEmail();
        String phone_number= employees.getPhone_number();
        Date hire_date= employees.getHire_date();
        int job_id= employees.getJob_id();
        float sal= employees.getSalary();
        int dep_id=employees.getDepartment_id();
        String sql="insert into employee.employees(employee_id, first_name, last_name, email, phone_number,hire_date, job_id, salary, department_id) values (?,?,?,?,?,?,?,?,?);";
        int res=jdbcTemplate.update(sql,employee_id,fn,ln,email,phone_number,hire_date,job_id,sal,dep_id);
        return res;
    }

    @Override
    public List<Employees> getAllEmployees() {
        String sql="select * from employee.employees;";
        List<Employees> employees=jdbcTemplate.query(sql, BeanPropertyRowMapper.newInstance(Employees.class));
        return employees;
    }
}
