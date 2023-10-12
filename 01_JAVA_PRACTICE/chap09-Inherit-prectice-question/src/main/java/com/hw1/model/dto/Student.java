package com.hw1.model.dto;

public class Student extends Person {

    private int grade;
    private String major;

    public Student(){}

    public Student(String name, int age, double height, double weight) {
        super(name, age, height, weight);
    }

    public Student(int grade, String major) {
        this.grade = grade;
        this.major = major;
    }

    public int getGrade() {
        return grade;
    }

    public String getMajor() {
        return major;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public void setMajor(String major) {
        this.major = major;
    }


}
