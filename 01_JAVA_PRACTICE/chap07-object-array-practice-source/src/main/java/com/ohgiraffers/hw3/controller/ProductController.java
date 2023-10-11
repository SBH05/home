package com.ohgiraffers.hw3.controller;

import java.util.Scanner;

public class ProductController {
    Scanner sc = new Scanner(System.in);

    private ProductDTO[] pro = null;

    public static int count;

    public void mainMenu(){}

    public void productlnput() {
        System.out.println("제품 이름 : ");
        String name = sc.nextLine();
        System.out.println("제품 가격 : ");
        int price = sc.nextInt();

    }

    public void productPrint() {}

}
