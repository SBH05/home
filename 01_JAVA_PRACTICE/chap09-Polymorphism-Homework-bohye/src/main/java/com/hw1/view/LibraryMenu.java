package com.hw1.view;


import com.hw1.controller.LibraryManager;
import com.hw1.model.dto.Member;

import java.util.Scanner;

public class LibraryMenu  {

    public void mainMenu() {

        Scanner sc = new Scanner(System.in);
        Member mem = new Member();

        while (true){
            System.out.println("1. 마이페이지");
            System.out.println("2. 도서 전체 조회 ");
            System.out.println("3. 도서 검색");
            System.out.println("4. 도서 대여하기 ");
            System.out.println("0. 프로그램 종료하기");
            System.out.println("번호를 입력하세요");
            int num = sc.nextInt();

            switch (num){

                case 1 : LibraryManager.myInfo(); break;
                case 2 : selectAll(); break;
                case 3 : searchBook(); break;
                case 4 : rentBook(); break;
                case 0 : System.out.println("프로그램 종료합니다"); break;
            }

        }
    }

    public void selectAll() {

        LibraryManager LM = new LibraryManager();
        LM.selectAll();
    }


}
