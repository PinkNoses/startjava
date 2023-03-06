package com.startjava.lesson_2_3_4.guess;

import java.util.Scanner;

public class GuessNumber {

    private int secretNumber;
    private final Player player1;
    private final Player player2;

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void start() {
        secretNumber = 1 + (int) (Math.random() * 100);
        Scanner sc = new Scanner(System.in);
        do {
            inputNumber(player1, player1.getCount(), sc);
            compareNumbers(player1);
            if (stopGame(player1)) {
                return;
            }
            inputNumber(player2, player2.getCount(), sc);
            compareNumbers(player2);
        } while (!stopGame(player2));
    }

    private void inputNumber(Player player, int count, Scanner sc) {
        if (!stopGame(player)) {
            player.setCount(++count);
            System.out.print(player.getName() + ", введите предполагаемое число: ");
            player.setNumber(sc.nextInt());
            for (int i = 0; i < player.getNumArray().length; i++) {
                if (player.getNumArray()[i] == 0) {
                    player.getNumArray()[i] = player.getNumber();
                    return;
                }
            }
        }
    }

    private void compareNumbers(Player player) {
        if (player.getNumber() == secretNumber) {
            return;
        }
        if (player.getNumber() > secretNumber) {
            System.out.println("число " + player.getNumber() + " больше того, что загадал компьютер");
        } else {
            System.out.println("число " + player.getNumber() + " меньше того, что загадал компьютер");
        }
    }

    private boolean stopGame(Player player) {
        if (player.getCount() == player.getNumArray().length) {
            System.out.println("У игрока " + player.getName() + " закончились попытки.");
            return true;
        } else if (player.getNumber() == secretNumber) {
            System.out.println("Игрок " + player.getName() + " угадал число " + secretNumber + " с " + player.getCount() + " попытки");
            return true;
        }
        return false;
    }
}