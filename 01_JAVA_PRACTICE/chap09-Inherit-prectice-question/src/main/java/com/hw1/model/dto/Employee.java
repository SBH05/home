package com.hw1.model.dto;

public class Employee extends Person{

    private int salary;
    private String dept;

    public Employee(){}

    public Employee(int salary, String dept) {
        this.salary = salary;
        this.dept = dept;
    }



}
