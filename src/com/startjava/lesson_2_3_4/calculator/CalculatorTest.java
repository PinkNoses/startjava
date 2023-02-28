package com.startjava.lesson_2_3_4.calculator;

import java.util.Scanner;

public class CalculatorTest {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner sc = new Scanner(System.in);
        String answer = "yes";
        while (answer.equals("yes")) {
            System.out.print("Введите первое число: ");
            calculator.setA(sc.nextInt());
            System.out.print("Введите знак математической операции: ");
            calculator.setSign(sc.next().charAt(0));
            System.out.print("Введите второе число: ");
            calculator.setB(sc.nextInt());
            sc.nextLine();
            System.out.println(calculator.getA() + " " + calculator.getSign() + " " + calculator.getB() + 
                    " = " + calculator.calculate());
            do {
                System.out.println("Хотите продолжить вычисления? [yes/no]");
                answer = sc.nextLine();
            } while (!answer.equals("yes") && !answer.equals("no"));
        }
    }
}