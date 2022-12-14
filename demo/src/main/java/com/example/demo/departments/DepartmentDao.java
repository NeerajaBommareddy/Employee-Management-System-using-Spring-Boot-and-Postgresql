package com.example.demo.departments;

public interface DepartmentDao {

    public Departments save(Departments departments);

    public Departments getDeptById(int department_id);
}
