package com.example.demo.employees;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmployeesController {

    @Autowired
    EmployeesDaoImpl employeesDaoImpl;

    @GetMapping("/getAllEmployees")
    public List<Employees> employeesList() {
        List<Employees> employees = employeesDaoImpl.getAllEmployees();
        return employees;
    }

        @PostMapping("/addEmployee")
    public String addEmployee(@RequestBody Employees employees){
        int res=employeesDaoImpl.save(employees);
        if(res==1) {
            return "added successfully";
        }
        else {
            return "Check syntax and values";
        }
        }
    }

