package com.startjava.lesson_2_3_4.calculator;

public class Calculator {

    private String[] mathExpression = new String[3];

    public void setMathExpression(String[] mathExpression) {
        this.mathExpression = mathExpression;
    }

    public double calculate() {
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

    public int outputResult() {
        int intPartOfResult = (int) calculate();
        double residual = Math.ceil(((calculate() - (double) intPartOfResult) * 100) / 100);
        String[] residualArr = (residual + "").split("\\.");
        for (String s : residualArr) {
            if (Integer.parseInt(s) != 0) {
                return -1;
            }
        }
        return 1;
    }
}