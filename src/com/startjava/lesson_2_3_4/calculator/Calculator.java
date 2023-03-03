package com.startjava.lesson_2_3_4.calculator;

public class Calculator {
    public double calculate(String[] mathExpression) {
        int firstNum = Integer.parseInt(mathExpression[0]);
        String sign = mathExpression[1];
        int secondNum = Integer.parseInt(mathExpression[2]);
        switch (sign) {
            case "+":
                return Math.addExact(firstNum, secondNum);
            case "-":
                return Math.subtractExact(firstNum, secondNum);
            case "*":
                return Math.multiplyExact(firstNum, secondNum);
            case "/":
                return (double) firstNum / secondNum;
            case "%":
                return (double) firstNum % secondNum;
            case "^":
                return Math.pow(firstNum, secondNum);
        }
        return 0;
    }
}