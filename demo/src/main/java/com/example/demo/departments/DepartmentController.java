package com.example.demo.departments;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DepartmentController {

    @Autowired
    DepartmentDaoImpl departmentDaoImpl;

    @GetMapping("/getDeptById/{department_id}")
    public Departments getDeptById(@PathVariable int department_id){
        Departments department=departmentDaoImpl.getDeptById(department_id);
        return department;
    }
}
