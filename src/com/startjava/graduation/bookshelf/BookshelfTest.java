package com.startjava.graduation.bookshelf;

import java.util.Scanner;

public class BookshelfTest {
    static Bookshelf bookshelf = new Bookshelf();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        do {
            showMenu();
            showBookshelf();
            System.out.print("\nДля работы введите номер пункта из меню: ");
        } while (isValidChosenMenuItem());
    }

    private static void showMenu() {
        System.out.println("""
                        Меню
                1. Добавить книгу
                2. Найти книгу
                3. Удалить книгу
                4. Очистить шкаф
                5. Завершить\s""");
    }

    private static void showBookshelf() {
        int length = bookshelf.getLength();
        int countBooks = bookshelf.getCountBooks();
        if (countBooks == 0) {
            System.out.println("\nСейчас шкаф пуст. Вы можете добавить в него первую книгу.");
        } else {
            System.out.println("В шкафу " + countBooks + " книги и свободно " +
                    bookshelf.getEmptyShelvesCount() + " полок");
            for (Book book : bookshelf.getAll()) {
                System.out.println("|" + book +
                        " ".repeat(length - book.getLength()) + "|\n" +
                        "|" + "-".repeat(length) + "|");
            }
            if (countBooks != bookshelf.getCapacity()) {
                System.out.println("|" + " ".repeat(length) + "|\n");
            }
        }
    }

    private static boolean isValidChosenMenuItem() {
        String menuItem = sc.nextLine();
        if (isValid(menuItem)) {
            switch (Integer.parseInt(menuItem)) {
                case 1 -> addBook();
                case 2 -> findBook();
                case 3 -> deleteBook();
                case 4 -> clearShelves();
                case 5 -> {
                    System.out.println("До скорой встречи!");
                    return false;
                }
                default -> System.out.println("Некорректно введен номер пункта из меню! Попробуйте еще раз.\n");
            }
            System.out.println("Для продолжения работы нажмите Enter");
            sc.nextLine();
        } else {
            System.out.println("Некорректные введенные данные. Требуется вводить номера пунктов из меню.\n");
        }
        return true;
    }

    private static boolean isValid(String input) {
        try {
            Integer.parseInt(input);
            return true;
        } catch (NumberFormatException ex) {
            return false;
        }
    }

    private static void addBook() {
        if (bookshelf.add(createBook())) {
            System.out.println("Книга успешно добавлена в книжный шкаф.");
        } else {
            System.out.println("Невозможно добавить книгу. В шкафу нет свободной полки.");
        }
    }

    private static Book createBook() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите имя автора: ");
        String author = sc.nextLine();
        System.out.print("Введите название книги: ");
        String title = sc.nextLine();
        System.out.print("Введите год издания: ");
        int publishYear = sc.nextInt();
        return new Book(author, title, publishYear);
    }

    private static void findBook() {
        System.out.print("Введите название книги: ");
        Book findBook = bookshelf.find(sc.nextLine());
        if (findBook == null) {
            System.out.println("Книга не была найдена. Убедитесь, что название введено правильно.");
        } else {
            System.out.println("Книга найдена: " + findBook);
        }
    }

    private static void deleteBook() {
        if (bookshelf.getCountBooks() == 0) {
            System.out.println("Невозможно удалить книгу - шкаф пуст!");
            return;
        }
        System.out.print("Введите название книги: ");
        if (bookshelf.delete(sc.nextLine())) {
            System.out.println("Книга была удалена.");
        } else {
            System.out.println("Книга не была удалена. Убедитесь, что название введено правильно.");
        }
    }

    private static void clearShelves() {
        if (bookshelf.clearShelves()) {
            System.out.println("Шкаф успешно очищен.");
        } else {
            System.out.println("Не удалось очистить шкаф. В шкафу нет книг.");
        }
    }
}
