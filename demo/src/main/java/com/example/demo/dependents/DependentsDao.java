package com.example.demo.dependents;


public interface DependentsDao {
    public Dependents save(Dependents dependents);

    public Dependents getDependentsByEmployee_id(int employee_id);
}
