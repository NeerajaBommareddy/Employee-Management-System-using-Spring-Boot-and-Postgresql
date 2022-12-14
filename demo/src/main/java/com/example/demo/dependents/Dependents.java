package com.example.demo.dependents;

public class Dependents {
    private int dependent_id;
    private String first_name;
    private String last_name;
    private String relationship;
    private int employee_id;

    public Dependents() {
        super();
    }

    public Dependents(int dependent_id, String first_name, String last_name, String relationship, int employee_id) {
        this.dependent_id = dependent_id;
        this.first_name = first_name;
        this.last_name = last_name;
        this.relationship = relationship;
        this.employee_id = employee_id;
    }

    public int getDependent_id() {
        return dependent_id;
    }

    public void setDependent_id(int dependent_id) {
        this.dependent_id = dependent_id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getRelationship() {
        return relationship;
    }

    public void setRelationship(String relationship) {
        this.relationship = relationship;
    }

    public int getEmployee_id() {
        return employee_id;
    }

    public void setEmployee_id(int employee_id) {
        this.employee_id = employee_id;
    }
}
