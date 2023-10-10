package com.ohgiraffers.hw2.run;

import com.ohgiraffers.hw2.model.dto.StudentDTO;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {

        while (true) {
            StudentDTO[] stu = new StudentDTO[10];

            Scanner sc = new Scanner(System.in);
            System.out.print("계속 추가하겠습니까?(y or n) : ");
            char an = sc.next().charAt(0);

            int count = 0;

            if (an == 'y') {
                System.out.print("학년을 입력하세요 : ");
                int grade = sc.nextInt();
                System.out.print("반을 입력하세요 : ");
                int classroom = sc.nextInt();
                sc.nextLine();
                System.out.print("이름을 입력하세요 : ");
                String name = sc.nextLine();
                System.out.print("국어점수를 입력하세요 : ");
                int kor = sc.nextInt();
                System.out.print("영어점수를 입력하세요 : ");
                int eng = sc.nextInt();
                System.out.print("수학점수를 입력하세요 : ");
                int math = sc.nextInt();

                for (int i = 0; i < stu.length; i++) {
                    stu[i] = new StudentDTO(grade, classroom, name, kor, eng, math);
                    count++;
                    System.out.println(stu[i].information());
                    break;
                }
            } else {
                    break;
            }


        }
    }
}