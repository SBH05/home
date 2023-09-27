package com.ohgiraffers.section01.level01.normal;

public class RandomMaker {

    /*
     * static 메소드로 생성
     * 반환형 : String
     * 메소드명 : rockPaperScissors
     *
     * 가위,바위,보 중에 하나를 출력
     * (가위,바위,보 는 난수를 이용하여 구현)
     *
     * -- 출력 --
     * 가위
     * */

    public static String rockPaperScissors() {

        int random = (int) (Math.random() * 3) + 1;
        String result = "";

        if(random == 1) {
            result = "바위";
//            System.out.println("바위");
        }
            else if (random == 2){
                result = "가위";
 //               System.out.println("가위");
        } else {
                result = "보";
 //           System.out.println("보");
        }
            return  result;
    }


    /*
     * static 메소드로 생성
     * 반환형 : String
     * 메소드명 : tossCoin
     *
     * 동전 앞/뒤 중에 하나를 출력
     * (앞면,뒷면은 난수를 이용하여 구현)
     *
     * -- 출력 --
     * 앞면
     *
     * */

    public static String tossCoin() {
        /*
        앞 = 1
        뒤 = 2
         */

        int random = (int)(Math.random() * 2) + 1;
        String result1 = "";

        if(random == 1){
            result1 = "앞";
        } else {
            result1 = "뒤";
        }

        return result1;
    }



}
