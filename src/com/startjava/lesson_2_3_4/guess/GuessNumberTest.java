package com.startjava.lesson_2_3_4.guess;

import java.util.Scanner;

public class GuessNumberTest {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("У каждого игрока по 10 попыток.");
        System.out.print("Игрок № 1, введи свое имя: ");
        Player player1 = new Player(sc.nextLine());
        System.out.print("Игрок № 2, введи свое имя: ");
        Player player2 = new Player(sc.nextLine());
        GuessNumber game = new GuessNumber(player1, player2);
        String answer = "yes";
        do {
            if (answer.equals("yes")) {
                game.start();
                game.inputPlayerNumbers(player1);
                game.inputPlayerNumbers(player2);
            }
            System.out.println("Хотите продолжить игру? [yes/no]");
            answer = sc.nextLine();
        } while (!answer.equals("no"));
    }
}