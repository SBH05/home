package com.hw1.controller;

import com.hw1.model.dto.AniBook;
import com.hw1.model.dto.Book;
import com.hw1.model.dto.CookBook;
import com.hw1.model.dto.Member;

public class LibraryManager {

    private Member mem = null;

    private Book[] bList = new Book[5];
    {
        bList[0] = new CookBook("백종원의 집밥", "백종원", "tvN", true);
        bList[1] = new AniBook("한번 더 해요", "미티", "원모어", 19);
        bList[2] = new AniBook("루피의 원피스", "루피", "japan", 12);
        bList[3] = new CookBook("이혜정의 얼마나 맛있게요", "이혜정", "문학", false);
        bList[4] = new CookBook("최현석 날 따라해봐", "최현석", "소금책", true);
    }

    public void insertMember(Member mem) {
        this.mem = mem;
    }

    public Member myInfo(){
        return mem;
    }


    public Book[] selectAll(){
        return this.bList;
    }


    public Book[] searchBook(String keyword) {
        Book[] book = new Book[5];

        book[0] = new CookBook("골목식당", "백종원", "SBS", true);
        book[1] = new AniBook("한번 더 해요", "미티", "원모어", 19);
        book[2] = new AniBook("루피의 원피스", "루피", "japan", 12);
        book[3] = new CookBook("이혜정의 얼마나 맛있게요", "혜정", "문학", false);
        book[4] = new CookBook("최현석 날 따라", "최현석", "책", true);

        int count = 0;

        for (int i = 0; i < bList.length; i++) {
            for (int j = 0; j < book.length; j++) {
                if (bList[i].getTitle().contains(bList[j].getTitle())){
                    count++;
                    System.out.println(bList[count].getTitle());
                }
            }
        }

            return bList;

    }

        public int rentBook(int index) {
            int result = 0;

            return result;




        }


}
