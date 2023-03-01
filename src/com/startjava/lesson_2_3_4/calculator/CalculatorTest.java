package com.startjava.lesson_2_3_4.calculator;

import java.util.Scanner;

public class CalculatorTest {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner sc = new Scanner(System.in);
        String answer = "";
        while (!answer.equals("no")) {
            startCalculate(calculator, sc);
            answer = checkAnswer(sc);
            if (answer.equals("no")) {
                return;
            } else if (!answer.equals("yes")) {
                answer = checkAnswer(sc);
            }
        }
    }

    private static void startCalculate(Calculator calculator, Scanner sc) {
        System.out.print("Введите математическое выражение: ");
        calculator.setMathExpression(sc.nextLine().split(" "));
        System.out.print(calculator.outputResult() == 1 ? " = " + (int) calculator.calculate() : " = " +
                calculator.calculate());
    }

    private static String checkAnswer(Scanner sc) {
        System.out.println("\nХотите продолжить вычисления? [yes/no]");
        return sc.nextLine();
    }
}