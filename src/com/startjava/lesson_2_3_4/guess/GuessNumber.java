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
        player1.clearAttempts();
        player2.clearAttempts();
        secretNumber = 1 + (int) (Math.random() * 100);
        System.out.println("secret num: " + secretNumber);
        Scanner sc = new Scanner(System.in);
        while (!(stopGame(player1) && stopGame(player2))) {
            inputNumber(player1, sc);
            if (compareNumbers(player1)) {
                break;
            }
            inputNumber(player2, sc);
            if (compareNumbers(player2)) {
                break;
            }
        }
        outputPlayerNumbers(player1);
        outputPlayerNumbers(player2);
    }

    private void inputNumber(Player player, Scanner sc) {
        if (!stopGame(player)) {
            System.out.print(player.getName() + ", введите предполагаемое число: ");
            currentNumber = sc.nextInt();
            player.addNumber(currentNumber);
        }
    }

    private boolean compareNumbers(Player player) {
        if (currentNumber == secretNumber) {
            System.out.println("Игрок " + player.getName() + " угадал число " + secretNumber + " с " + player.getCount() + " попытки");
            return true;
        }
        if (currentNumber > secretNumber) {
            System.out.println("число " + currentNumber + " больше того, что загадал компьютер");
        } else {
            System.out.println("число " + currentNumber + " меньше того, что загадал компьютер");
        }
        return false;
    }

    private boolean stopGame(Player player) {
        if (player.getCount() == player.getLength()) {
            System.out.println("У игрока " + player.getName() + " закончились попытки.");
            return true;
        }
        return false;
    }

    private void outputPlayerNumbers(Player player) {
        System.out.print("Игрок " + player.getName() + " назвал следующие цифры: ");
        for (int number : player.getNumbers()) {
            System.out.print(number + " ");
        }
        System.out.println();
    }
}