package com.student.core;

public class Student {

    private long id;
    private String firstName;
    private String surName;
    private String dept;
    private Double fees;

    private Student(){
        super();
    }

    public Student(final String firstName, final String surName, final String dept, final Double fees) {
        this.firstName = firstName;
        this.surName = surName;
        this.dept = dept;
        this.fees = fees;
    }

    public long getId() {
        return id;
    }

    public void setId(final long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(final String firstName) {
        this.firstName = firstName;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(final String surName) {
        this.surName = surName;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(final String dept) {
        this.dept = dept;
    }

    public Double getFees() {
        return fees;
    }

    public void setFees(final Double fees) {
        this.fees = fees;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", surName='" + surName + '\'' +
                ", dept='" + dept + '\'' +
                ", fees=" + fees +
                '}';
    }
}
