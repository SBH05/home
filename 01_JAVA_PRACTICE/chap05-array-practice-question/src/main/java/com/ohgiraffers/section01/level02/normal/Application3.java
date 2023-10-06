package com.ohgiraffers.section01.level02.normal;

import java.util.Scanner;

public class Application3 {

    public static void main(String[] args) {

        /* 홀수인 양의 정수를 입력 받아 입력 받은 크기 만큼의 정수형 배열을 할당하고
         * 배열의 중간까지는 1부터 1씩 증가하여 오름차순으로 값을 넣고,
         * 중간 이후부터 끝까지는 1씩 감소하여 내림차순으로 값 넣어 출력하세요
         *
         * 단, 홀수인 양의 정수를 입력하지 않은 경우에는 "양수 혹은 홀수만 입력해야 합니다."를 출력하세요
         *
         * -- 입력 예시 --
         * 홀수인 양의 정수를 입력하세요 : 7
         *
         * -- 출력 예시 --
         * 1 2 3 4 3 2 1
         *
         * -- 입력 예시 --
         * 홀수인 양의 정수를 입력하세요 : 8
         *
         * -- 출력 예시 --
         * 양수 혹은 홀수만 입력해야 합니다.
         */
        // 3을 입력 받으면 1 2 1        -> 2
        // 5을 입력 받으면 1 2 3 2 1     -> 3
        // 7을 입력 받으면 1 2 3 4 3 2 1   -> 4
        // 9을 입력 받으면 1 2 3 4 5 4 3 2 1  -> 5

        Scanner sc = new Scanner(System.in);
        System.out.print("홀수인 양의 정수를 입력하세요 : ");
        int num = sc.nextInt();
        int[] arr = new int[num];

        /*
        arr[0] = 1
        arr[1] = 2

         */

        if (num % 2 != 0) {
            for (int i = 1; i <= num / 2 + 1; i++) {
                System.out.print(i + " ");
            }
            for (int i = 1; i < num / 2; i++) {

                for (int j = 0; j < i; j++) {

                    if (arr[i] > arr[j]) {
                        int temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                        System.out.println();
                    }
                }
            }
        } else {
            System.out.println("양수 혹은 홀수만 입력해야 합니다.");
        }

    }
}




/*
            for (int i = 1; i <= num / 2 + 1; i++) {
                System.out.print(i + " ");
            }
            for (int j = num / 2; j > 0; j--) {
                System.out.print(j + " ");
            }
 */