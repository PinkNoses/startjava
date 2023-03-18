package com.startjava.graduation.bookshelf;

import java.util.Arrays;

public class Bookshelf {
    private final int ARRAY_LENGTH = 10;
    private final Book[] books = new Book[ARRAY_LENGTH];
    private int length;
    private int booksCount;

    public int getARRAY_LENGTH() {
        return ARRAY_LENGTH;
    }

    public int getLength() {
        return length;
    }

    public int getBooksCount() {
        return booksCount;
    }

    public boolean add(Book book) {
        if (booksCount != ARRAY_LENGTH) {
            books[booksCount] = book;
            checkBookLength(books[booksCount]);
            booksCount++;
            return true;
        }
        return false;
    }

    public boolean delete(String title) {
        if (booksCount == 0) {
            return false;
        }
        Book bookForDelete = find(title);
        if (bookForDelete != null) {
            int lengthThisBook = bookForDelete.getLength();
            int index = Arrays.asList(books).indexOf(bookForDelete);
            books[index] = null;
            System.arraycopy(books, index + 1, books, index, ARRAY_LENGTH - index - 1);
            books[ARRAY_LENGTH - 1] = null;
            booksCount--;
            if (lengthThisBook == length) {
                findNewLength();
            }
            return true;
        }
        return false;
    }

    public boolean clearShelves() {
        if (booksCount == 0) {
            return false;
        }
        Arrays.fill(books, null);
        booksCount = 0;
        return true;
    }

    public int getEmptyShelvesCount() {
        return ARRAY_LENGTH - booksCount;
    }

    public Book[] getAll() {
        return Arrays.copyOf(books, booksCount);
    }

    private void checkBookLength(Book book) {
        if (book.getLength() == length || book.getLength() < length) {
            return;
        }
        if (book.getLength() > length) {
            length = book.getLength();
        }
    }

    private Book find(String title) {
        for (int i = 0; i < booksCount; i++) {
            if (books[i].getTitle().equals(title)) {
                return books[i];
            }
        }
        return null;
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
