package com.company;

import java.util.Date;

public class Book {
    private String title;
    private int ISBN;
    private int publicationYear;

    public Book(String title, int ISBN, int publicationYear) {
        this.title = title;
        this.ISBN = ISBN;
        this.publicationYear = publicationYear;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getISBN() {
        return ISBN;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }

    public String toString(){
        return title + " " + ISBN + " " + publicationYear;
    }
}
