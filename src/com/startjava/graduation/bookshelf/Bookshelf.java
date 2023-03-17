package com.startjava.graduation.bookshelf;

import java.util.Arrays;
import java.util.Scanner;

public class Bookshelf {
    private final Book[] books = new Book[10];
    private final int arrayLength = books.length;
    private int bookshelfLength;
    private int booksNumber;

    Scanner sc = new Scanner(System.in);

    public boolean add() {
        if (booksNumber != arrayLength) {
            books[booksNumber] = create();
            checkBookLength(books[booksNumber]);
            booksNumber++;
            return true;
        }
        return false;
    }

    public boolean delete() throws NullPointerException {
        if (booksNumber == 0) {
            return false;
        }
        System.out.print("Введите название книги: ");
        Book bookForDelete = find(sc.nextLine());
        if (bookForDelete == null) {
            throw new NullPointerException("Книга не была удалена. Убедитесь, что название введено правильно.");
        }
        int lengthThisBook = bookForDelete.getLength();
        int index = Arrays.asList(books).indexOf(bookForDelete);
        books[index] = null;
        System.arraycopy(books, index + 1, books, index, arrayLength - index - 1);
        books[arrayLength - 1] = null;
        booksNumber--;
        if (lengthThisBook == bookshelfLength) {
            findNewBookshelfLength();
        }
        return true;
    }

    public boolean clearShelves() {
        if (booksNumber == 0) {
            return false;
        }
        Arrays.fill(books, null);
        booksNumber = 0;
        return true;
    }

    public void showBookshelf() {
        if (booksNumber == 0) {
            System.out.println("\nСейчас шкаф пуст. Вы можете добавить в него первую книгу.");
        } else {
            System.out.println("В шкафу " + booksNumber + " книги и свободно " + getEmptyShelvesNumber() + " полок");
            for (Book book : getAll()) {
                System.out.printf("|" + book + " ".repeat(bookshelfLength - book.getLength()) + "|\n" + "|" +
                        "-".repeat(bookshelfLength) + "|\n");
            }
            if (booksNumber != arrayLength) {
                System.out.println("|" + " ".repeat(bookshelfLength) + "|\n");
            }
        }
    }

    private Book create() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите имя автора: ");
        String author = sc.nextLine();
        System.out.print("Введите название книги: ");
        String title = sc.nextLine();
        System.out.print("Введите год издания: ");
        int publishYear = sc.nextInt();
        return new Book(author, title, publishYear);
    }

    private void checkBookLength(Book book) {
        if (book.getLength() == bookshelfLength || book.getLength() < bookshelfLength) {
            return;
        }
        if (book.getLength() > bookshelfLength) {
            bookshelfLength = book.getLength();
        }
    }

    private Book find(String title) {
        for (int i = 0; i < booksNumber; i++) {
            if (books[i].getTitle().equals(title)) {
                return books[i];
            }
        }
        return null;
    }

    private void findNewBookshelfLength() {
        int maxLengthBook = Integer.MIN_VALUE;
        for (Book book : getAll()) {
            if (book.getLength() > maxLengthBook) {
                maxLengthBook = book.getLength();
            }
        }
        bookshelfLength = maxLengthBook;
    }

    private Book[] getAll() {
        return Arrays.copyOf(books, booksNumber);
    }

    private int getEmptyShelvesNumber() {
        return arrayLength - booksNumber;
    }
}
