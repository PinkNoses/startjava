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

    public boolean add(Book book) {
        if (countBooks < CAPACITY) {
            books[countBooks] = book;
            checkMaxLength(books[countBooks].getLength());
            countBooks++;
            return true;
        }
        return false;
    }

    public Book find(String title) {
        int index = findIndex(title);
        return index != -1 ? books[index] : null;
    }

    public boolean delete(String title) {
        if (countBooks == 0) {
            return false;
        }
        int index = findIndex(title);
        if (index != -1) {
            int lengthThisBook = books[index].getLength();
            books[index] = null;
            System.arraycopy(books, index + 1, books, index, countBooks - index - 1);
            countBooks--;
            if (lengthThisBook == length) {
                calcMaxLength();
            }
            return true;
        }
        return false;
    }

    public boolean clearShelves() {
        if (countBooks == 0) {
            return false;
        }
        Arrays.fill(books, 0, countBooks, null);
        countBooks = 0;
        return true;
    }

    public int getCountEmptyShelves() {
        return CAPACITY - countBooks;
    }

    public Book[] getAll() {
        return Arrays.copyOf(books, countBooks);
    }

    private void checkMaxLength(int lengthThisBook) {
        if (lengthThisBook > length) {
            length = lengthThisBook;
        }
    }

    private int findIndex(String title) {
        for (int i = 0; i < countBooks; i++) {
            if (books[i].getTitle().equals(title)) {
                return i;
            }
        }
        return -1;
    }

    private void calcMaxLength() {
        length = 0;
        for (Book book : getAll()) {
            checkMaxLength(book.getLength());
        }
    }
}
