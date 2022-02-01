package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        /*ListForExercise listForExercise = new ListForExercise();
        String s = "Hat";
        ArrayList<String> stringList = new ArrayList<>();

        System.out.println(s);

        System.out.println(listForExercise.doesArrayListContainString(stringList,s));
        System.out.println(listForExercise.doesArrayListContainString(stringList,s));
         */

        Library library = new Library();
        Book book1 = new Book("Ringenes Herre", 23409234, 1942);
        Book book2 = new Book("Fisher King", 124872135, 1998);

        library.bookList.add(new Book("Krig og Fred", 124872135,1920));
        library.bookList.add(new Book("Crazy Rich Asians", 124872134,2011));
        library.bookList.add(new Book("Star Beast", 143372135,1978));

        System.out.println(library.doesTheISBNMatch(book1));
        System.out.println(library.doesTheISBNMatch(book2));

    }




}
