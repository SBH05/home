package com.ohgiraffers.hw1.model.dto;

import java.util.SplittableRandom;

public class EmployeeDTO {

    private int empNo;
    private String name;
    private String dept;
    private String job;
    private int age;
    private char gender;
    private int salary;
    private double bonusPoint;
    private String phone;
    private String address;


    public EmployeeDTO() {}


    public EmployeeDTO(int empNo, String name, int age, char gender, String phone, String address) {
        this.empNo = empNo;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.phone = phone;
        this.address = address;
    }

    public EmployeeDTO(int empNo, String name, String dept, String job, int age, char gender, int salary, double bonusPoint, String phone, String address) {
        this.empNo = empNo;
        this.name = name;
        this.dept = dept;
        this.job = job;
        this.age = age;
        this.gender = gender;
        this.salary = salary;
        this.bonusPoint = bonusPoint;
        this.phone = phone;
        this.address = address;
    }

    public String information() {

        return this.empNo+" " + this.name +" " + this.dept + " "+this.job + " "
                + this.age +" " + this.gender + " " + this.salary + " "+ this.bonusPoint + " " +
                this.phone +" " + this.address;
    }

}
