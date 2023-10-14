package com.hw1.model.dto;

public class Member {

    private String name;
    private int age;
    private char gender;
    private int couponCount = 0;

    public Member() {}

    public Member(String name, int age, char gender, int couponCount) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.couponCount = couponCount;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public void setCouponCount(int couponCount) {
        this.couponCount = couponCount;
    }

    public String getName(){
        return name;
    }

    public int getAge() {
        return age;
    }

    public char getGender() {
        return gender;
    }

    public int getCouponCount() {
        return couponCount;
    }


    @Override
    public String toString() {
        return  "이름='" + name +
                ", 나이=" + age +
                ", 성별=" + gender +
                ", 쿠폰 수=" + couponCount ;
    }
}

