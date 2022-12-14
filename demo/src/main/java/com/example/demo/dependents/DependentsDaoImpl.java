package com.example.demo.dependents;

import com.example.demo.employees.Employees;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class DependentsDaoImpl implements DependentsDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public Dependents save(Dependents dependents) {
        int dependent_id= dependents.getDependent_id();
        String fn= dependents.getFirst_name();
        String ln= dependents.getLast_name();
        String relationship= dependents.getRelationship();
        int employee_id= dependents.getEmployee_id();
        String sql="insert into employee.dependents(dependent_id, first_name, last_name, relationship, employee_id) values (?,?,?,?,?);";
        Dependents res=jdbcTemplate.queryForObject(sql, BeanPropertyRowMapper.newInstance(Dependents.class),dependent_id,fn,ln,relationship,employee_id);
        return res;
    }

    @Override
    public Dependents getDependentsByEmployee_id(int employee_id) {
        String sql="select * from employee.dependents where employee_id=?;";
        Dependents dependents=jdbcTemplate.queryForObject(sql,BeanPropertyRowMapper.newInstance(Dependents.class), employee_id);
        return dependents;
    }
}
