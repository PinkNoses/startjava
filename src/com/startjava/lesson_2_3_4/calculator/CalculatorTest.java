package com.startjava.lesson_2_3_4.calculator;

import java.util.Scanner;

public class CalculatorTest {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner sc = new Scanner(System.in);
        String answer = "yes";
        do {
            if (answer.equals("yes")) {
                startCalculate(calculator, sc);
            }
            System.out.println("\nХотите продолжить вычисления? [yes/no]");
            answer = sc.nextLine();
        } while (!answer.equals("no"));
    }


    private static void startCalculate(Calculator calculator, Scanner sc) {
        System.out.print("Введите математическое выражение: ");
        String[] mathExpression = sc.nextLine().split(" ");
        double result = calculator.calculate(mathExpression);
        System.out.print(outputResult(result) == 1 ? " = " + (int) result : " = " + result);
    }

    private static int outputResult(double result) {
        int intPartOfResult = (int) result;
        double residual = Math.ceil(((result - (double) intPartOfResult) * 100) / 100);
        String[] residualArr = (residual + "").split("\\.");
        for (String s : residualArr) {
            if (Integer.parseInt(s) != 0) {
                return -1;
            }
        }
        return 1;
    }
}
