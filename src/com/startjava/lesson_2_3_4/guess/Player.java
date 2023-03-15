package com.startjava.lesson_2_3_4.guess;

import java.util.Arrays;

public class Player {

    private final String name;
    private final int[] numbers = new int[10];
    private final int length = numbers.length;
    private int count;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int[] getNumbers() {
        return Arrays.copyOf(numbers, count);
    }

    public void addNumber(int number) {
        numbers[count] = number;
        count++;
    }

    public int getLength() {
        return length;
    }

    public int getCount() {
        return count;
    }

    public void clearAttempts() {
        Arrays.fill(numbers, 0, count, 0);
        count = 0;
    }
}