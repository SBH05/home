package com.ohgiraffers.hw3.controller;

import com.ohgiraffers.hw3.model.vo.ProductDTO;

import java.util.Scanner;

public class ProductController {
    Scanner sc = new Scanner(System.in);

    private ProductDTO[] pro = null;


    {pro = new ProductDTO[10];}

    public static int count = 0;
    int num;
    public void mainMenu() {
        do {
            System.out.println("=====제품 관리 메뉴======");
            System.out.println("1. 제품 정보 추가");
            System.out.println("2. 제품 전체 조회");
            System.out.println("9. 프로그램 종료");
            System.out.print("번호 입력 : ");
            num = sc.nextInt();

            switch (num) {
                case 1:
                    productlnput();
                    break;
                case 2:
                    productPrint();
                    break;
                case 9:
                    System.out.println("프로그램 종료합니다,");
                    break;
                default:
                    System.out.println("번호를 입력해주세요");
                    break;
            }
        } while (num != 9);
    }



    public void productlnput() {
        System.out.print("제품 번호 : ");
        int pld = sc.nextInt();
        System.out.print("제품 이름 : ");
        String pName = sc.nextLine();
        sc.nextLine();
        System.out.print("제품 가격 : ");
        int price = sc.nextInt();
        System.out.print("제품 세금 : ");
        double tax = sc.nextDouble();
        pro[count] = new ProductDTO(pld, pName, price,tax);
        count++;
    }


    public void productPrint() {
        for (int i = 0; i < count; i++) {
            System.out.println(pro[i].information());
        }
    }
}
