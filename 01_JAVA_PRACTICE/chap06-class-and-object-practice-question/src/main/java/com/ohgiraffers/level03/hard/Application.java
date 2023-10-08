package com.ohgiraffers.level03.hard;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        System.out.print("phone : ");
//        String ph = sc.nextLine();
//        System.out.print("address : ");
//        String add = sc.nextLine();
//        System.out.print("name : ");
//        String name = sc.nextLine();
//        System.out.print("dept : ");
//        String dept = sc.nextLine();
//        System.out.print("job : ");
//        String job = sc.nextLine();
//        System.out.print("number : ");
//        int num = sc.nextInt();
//        System.out.print("age : ");
//        int age = sc.nextInt();
//        System.out.print("salary : ");
//        int sal = sc.nextInt();
//        System.out.print("bonusPoint : ");
//        double bo = sc.nextDouble();
//        System.out.print("gender : ");
//        char gen = sc.next().charAt(0);


        //EmployeeDTO em = new EmployeeDTO(num,name,dept,job,age,gen,sal,bo,ph,add);
        //System.out.println(em.getInformation());

        EmployeeDTO em = new EmployeeDTO();
        em.setNumber(200);
        em.setName("홍길동");
        em.setJob("영업부");
        em.setDept("과장");
        em.setAge(20);
        em.setGender('남');
        em.setSalary(2000000);
        em.setBonusPoint(0.5);
        em.setPhone("010-1234-5678");
        em.setAddress("서울시 서초구 서초동");


        System.out.println(em.getNumber());
        System.out.println(em.getName());
        System.out.println(em.getJob());
        System.out.println(em.getDept());
        System.out.println(em.getAge());
        System.out.println(em.getGender());
        System.out.println(em.getSalary());
        System.out.println(em.getBonusPoint());
        System.out.println(em.getPhone());
        System.out.println(em.getAddress());


    }
}