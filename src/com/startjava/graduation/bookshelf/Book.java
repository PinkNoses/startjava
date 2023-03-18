package com.startjava.graduation.bookshelf;

public class Book {

    private final String author;
    private final String title;
    private final int publishYear;
    private int length;

    public Book(String author, String title, int publishYear) {
        this.author = author;
        this.title = title;
        this.publishYear = publishYear;
        calculateLength();
    }

    public String getTitle() {
        return title;
    }

    public int getLength() {
        return length;
    }

    @Override
    public String toString() {
        return author + ", " + title + ", " + publishYear;
    }

    private void calculateLength() {
        length = toString().length();
    }
}
