package com.hw1.controller;

import com.hw1.model.dto.Book;
import com.hw1.model.dto.Member;

public class LibraryManager {

    private Member mem = null;

    private Book[] bList = new Book[5];

    public void insertMember(Member : mem) {
        this.mem = mem;
    }

    public Member myInfo(){
        return myInfo();
    }

    public int rentBook(int index) {
        return index;
    }

    public Book[] selectAll(){
        return selectAll();
    }

    public Book[] searchBook(String keyword) {
        return searchBook();
    }


}
