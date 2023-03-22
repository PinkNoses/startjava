package com.startjava.graduation.bookshelf;

import java.util.Arrays;

public class Bookshelf {
    private static final int CAPACITY = 10;
    private final Book[] books = new Book[CAPACITY];
    private int length;
    private int countBooks;

    public int getCapacity() {
        return CAPACITY;
    }

    public int getLength() {
        return length;
    }

    public int getCountBooks() {
        return countBooks;
    }

    public Book getBook(int index) {
        return books[index];
    }

    public boolean add(Book book) {
        if (countBooks < CAPACITY) {
            books[countBooks] = book;
            checkBookLength(books[countBooks]);
            countBooks++;
            return true;
        }
        return false;
    }

    public int find(String title) {
        return findIndex(title);
    }

    public boolean delete(String title) {
        if (countBooks == 0) {
            return false;
        }
        int index = findIndex(title);
        if (index != -1) {
            int lengthThisBook = books[index].getLength();
            books[index] = null;
            System.arraycopy(books, index + 1, books, index, CAPACITY - index - 1);
            countBooks--;
            if (lengthThisBook == length) {
                findNewLength();
            }
            return true;
        }
        return false;
    }

    public int findIndex(String title) {
        for (int i = 0; i < countBooks; i++) {
            if (books[i].getTitle().equals(title)) {
                return i;
            }
        }
        return -1;
    }

    public boolean clearShelves() {
        if (countBooks == 0) {
            return false;
        }
        Arrays.fill(books, 0, countBooks, null);
        countBooks = 0;
        return true;
    }

    public int getEmptyShelvesCount() {
        return CAPACITY - countBooks;
    }

    public Book[] getAll() {
        return Arrays.copyOf(books, countBooks);
    }

    private void checkBookLength(Book book) {
        if (book.getLength() == length || book.getLength() < length) {
            return;
        }
        if (book.getLength() > length) {
            length = book.getLength();
        }
    }

    private void findNewLength() {
        int maxLengthBook = Integer.MIN_VALUE;
        for (Book book : getAll()) {
            if (book.getLength() > maxLengthBook) {
                maxLengthBook = book.getLength();
            }
        }
        length = maxLengthBook;
    }
}
