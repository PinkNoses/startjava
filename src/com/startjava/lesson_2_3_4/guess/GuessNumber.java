package com.startjava.lesson_2_3_4.guess;

import java.util.Scanner;

public class GuessNumber {

    private int secretNumber;
    private final Player player1;
    private final Player player2;
    private int currentNumber;

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void start() {
        player1.cleanPlayerNumbers();
        player2.cleanPlayerNumbers();
        secretNumber = 1 + (int) (Math.random() * 100);
        System.out.println("Secret Number: " + secretNumber);
        Scanner sc = new Scanner(System.in);
        do {
            inputNumber(player1, player1.getCount(), sc);
            compareNumbers();
            if (stopGame(player1)) {
                return;
            }
            inputNumber(player2, player2.getCount(), sc);
            compareNumbers();
        } while (!stopGame(player2));
    }

    public void inputPlayerNumbers(Player player) {
        System.out.print("Игрок " + player.getName() + " назвал следующие цифры: ");
        for (int num : player.getNumbers()) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    private void inputNumber(Player player, int count, Scanner sc) {
        if (!stopGame(player)) {
            player.setCount(++count);
            System.out.print(player.getName() + ", введите предполагаемое число: ");
            currentNumber = sc.nextInt();
            player.setNumber(currentNumber);
        }
    }

    private void compareNumbers() {
        if (currentNumber == secretNumber) {
            return;
        }
        if (currentNumber > secretNumber) {
            System.out.println("число " + currentNumber + " больше того, что загадал компьютер");
        } else {
            System.out.println("число " + currentNumber + " меньше того, что загадал компьютер");
        }
    }

    private boolean stopGame(Player player) {
        if (currentNumber == secretNumber) {
            System.out.println("Игрок " + player.getName() + " угадал число " + secretNumber + " с " + player.getCount() + " попытки");
            return true;
        }
        if (player.getCount() == player.getNumbers().length && player.getCount() == 3) {
            System.out.println("У игрока " + player.getName() + " закончились попытки.");
            return true;
        }
        return false;
    }
}