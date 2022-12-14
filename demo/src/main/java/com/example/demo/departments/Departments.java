package com.example.demo.departments;

public class Departments {
    private int department_id;
    private String department_name;
    private int location_id;

    public Departments() {
        super();
    }

    public Departments(int department_id, String department_name, int location_id) {
        this.department_id = department_id;
        this.department_name = department_name;
        this.location_id = location_id;
    }

    public int getDepartment_id() {
        return department_id;
    }

    public void setDepartment_id(int department_id) {
        this.department_id = department_id;
    }

    public String getDepartment_name() {
        return department_name;
    }

    public void setDepartment_name(String department_name) {
        this.department_name = department_name;
    }

    public int getLocation_id() {
        return location_id;
    }

    public void setLocation_id(int location_id) {
        this.location_id = location_id;
    }
}
