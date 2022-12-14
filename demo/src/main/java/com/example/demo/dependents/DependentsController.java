package com.example.demo.dependents;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DependentsController {

    @Autowired
    DependentsDaoImpl dependentsDaoImpl;

    @GetMapping("/getDependents/{employee_id}")
    public Dependents getDependentsByEmployeeId(@PathVariable int employee_id) {
        Dependents dependents=dependentsDaoImpl.getDependentsByEmployee_id(employee_id);
        return dependents;
    }
}
