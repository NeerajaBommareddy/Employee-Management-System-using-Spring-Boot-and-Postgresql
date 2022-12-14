package com.example.demo.employees;

import java.util.List;

public interface EmployeesDao {

    public int save(Employees employees);

    public List<Employees> getAllEmployees();
}
