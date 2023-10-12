package com.ohgiraffers.hw2.run;

import com.ohgiraffers.hw2.model.dto.StudentDTO;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {

        StudentDTO[] stu = new StudentDTO[10];
        Scanner sc = new Scanner(System.in);
        int count = 0;

        while (true) {

            System.out.print("계속 추가하겠습니까?(y or n) : ");
            char an = sc.next().charAt(0);

            if (an == 'y'|| an == 'Y') {
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
                stu[count] = new StudentDTO(grade, classroom, name, kor, eng, math);
                count++;

            }else if (an == 'n'){
                break;
            }
        }


        for (int i = 0; i < count; i++){
            if (stu[i] != null){
            }
                int sum = stu[i].getKor() + stu[i].getEng() + stu[i].getMath();
                System.out.println(stu[i].information() + ", 평균=" + sum / 3);
        }


    }
}