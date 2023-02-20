package com.startjava.lesson_1.finally;

import java.util.Random;

public class MyFirstGame {
    
    public static void main(String[] args) {
        int secretNum = 1 + (int) (Math.random() * 100);
        int playerNum = 1 + (int) (Math.random() * 100);
        while (playerNum != secretNum) {
            if (playerNum < secretNum) {
                System.out.println("число " + playerNum + " меньше того, что загадал компьютер");
                playerNum += 5;
            } else {
                System.out.println("число " + playerNum + " больше того, что загадал компьютер");
                playerNum -= 1;
            }
        }
        System.out.println("Вы победили!");
    }
}