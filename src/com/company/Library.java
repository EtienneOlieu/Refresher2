package com.company;

import java.util.ArrayList;

public class Library {
    ArrayList<Book> bookList = new ArrayList<>();

    public boolean doesTheISBNMatch(Book b){

        for (Book book: bookList) {
            if (book.getISBN() == b.getISBN()){
                return true;
            }
        }
     return false;
    }


}
