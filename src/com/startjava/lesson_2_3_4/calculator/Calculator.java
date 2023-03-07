package com.startjava.lesson_2_3_4.calculator;

public class Calculator {
    public double calculate(String mathExpression) {
        String[] mathExpressionArray = mathExpression.split(" ");
        int num1 = Integer.parseInt(mathExpressionArray[0]);
        String sign = mathExpressionArray[1];
        int num2 = Integer.parseInt(mathExpressionArray[2]);
        switch (sign) {
            case "+":
                return Math.addExact(num1, num2);
            case "-":
                return Math.subtractExact(num1, num2);
            case "*":
                return Math.multiplyExact(num1, num2);
            case "/":
                return (double) num1 / num2;
            case "%":
                return (double) num1 % num2;
            case "^":
                return Math.pow(num1, num2);
        }
        return 0;
    }
}