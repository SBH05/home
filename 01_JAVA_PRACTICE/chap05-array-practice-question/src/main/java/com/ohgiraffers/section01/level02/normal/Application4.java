package com.ohgiraffers.section01.level02.normal;

public class Application4 {

    public static void main(String[] args) {

     /*
		  로또 번호 자동 생성기 프로그램을 작성하세요.
		  단, 중복 값 없이 오름차순으로 정렬하여 출력하세요.

		  Random 클래스 사용 혹은 Math.random() 메소드를 사용
	   */

        int[] arr = new int[6];
        /*
        int random0 = (int) (Math.random() * 45) + 1;
        int random1 = (int) (Math.random() * 45) + 1;
        System.out.println(random);
        System.out.println(random1);

        arr[0] = random0

         */
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 45) + 1;
            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                     i--;
                }
            }
            System.out.print(arr[i] + " ");
        }


            System.out.println();

        for(int i = 1; i < arr.length; i++) {

            for(int j = 0; j < i; j++) {

                if(arr[i] < arr[j]){
                    int temp;
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }

        }
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}