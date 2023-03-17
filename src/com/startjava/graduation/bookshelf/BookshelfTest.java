package com.startjava.graduation.bookshelf;

import java.util.Scanner;

public class BookshelfTest {
    static Bookshelf bookshelf = new Bookshelf();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            showMenu();
            bookshelf.showBookshelf();
            System.out.print("\nДля работы введите пункт из меню: ");
            String input = sc.nextLine();
            switch (input) {
                case "Добавить книгу" -> addBook();
                case "Взять книгу" -> deleteBook();
                case "Очистить шкаф" -> clearShelves();
                case "Завершить" -> {
                    System.out.println("До скорой встречи!");
                    return;
                }
            }
            System.out.println("Для продолжения работы нажмите Enter");
            sc.nextLine();
        }
    }

    private static void showMenu() {
        System.out.println("""
                        Меню
                1. Добавить книгу
                2. Взять книгу
                3. Очистить шкаф
                4. Завершить\s""");
    }

    private static void addBook() {
        System.out.println("Какую книгу хотите добавить в книжный шкаф? ");
        if (bookshelf.add()) {
            System.out.println("Книга успешно добавлена в книжный шкаф.");
        } else {
            System.out.println("Невозможно добавить книгу. В шкафу нет свободной полки.");
        }
    }

    private static void deleteBook() {
        try {
            if (bookshelf.delete()) {
                System.out.println("Книга была взята.");
            }
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        }
    }

    private static void clearShelves() {
        if (bookshelf.clearShelves()) {
            System.out.println("Шкаф успешно очищен.");
        } else {
            System.out.println("Не удалось очистить шкаф.");
        }
    }
}
