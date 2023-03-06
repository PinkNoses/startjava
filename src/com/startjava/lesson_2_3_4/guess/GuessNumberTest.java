package com.startjava.lesson_2_3_4.guess;

import java.util.Arrays;
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
                Arrays.fill(player1.getNumArray(), 0, player1.getCount(), 0);
                Arrays.fill(player2.getNumArray(), 0, player2.getCount(), 0);
                player1.setCount(0);
                player2.setCount(0);
                game.start();
                inputPlayerNumber(player1);
                inputPlayerNumber(player2);
            }
            System.out.println("Хотите продолжить игру? [yes/no]");
            answer = sc.nextLine();
        } while (!answer.equals("no"));
    }

    private static void inputPlayerNumber(Player player) {
        System.out.print("Игрок " + player.getName() + " назвал следующие цифры: ");
        int[] playerNumber = Arrays.copyOf(player.getNumArray(), player.getCount());
        for (int num : playerNumber) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}