package com.startjava.lesson_1.base;

public class CyclesTheme {

    public static void main(String[] args) {
        System.out.println("1.Подсчет суммы четных и нечетных чисел");
        int start = -10;
        int end = 21;
        int sumEven = 0;
        int sumOdd = 0;
        System.out.print("в промежутке [" + start + ", " + end + "] сумма четных чисел = ");
        do {
            if (start % 2 == 0) {
                sumEven += start;
            } else {
                sumOdd += start;
            }
            start++;
        } while (start <= end);
        System.out.println(sumEven + ", а нечетных = " + sumOdd);

        System.out.println("\n2.Вывод чисел в интервале (min и max) в порядке убывания");
        int num1 = 10;
        int num2 = 5;
        int num3 = -1;
        int max = num1;
        int min = num2;
        if (num2 > max) {
            max = num2;
        } else if (num3 > max) {
            max = num3;
        }
        if (num1 < min) {
            min = num1;
        } else if (num3 < min) {
            min = num3;
        }
        for (int i = max - 1; i > min; i--) {
            System.out.print(i + " ");
        }

        System.out.println("\n\n3.Вывод реверсивного числа и суммы его цифр");
        int num = 1234;
        int sumDigits = 0;
        System.out.print("исходное число в обратном порядке: ");
        while (num != 0) {
            int digit = num % 10;
            num /= 10;
            sumDigits += digit;
            System.out.print(digit);
        }
        System.out.println("\nсумма его цифр: " + sumDigits);

        System.out.println("\n4.Вывод чисел на консоль в несколько строк");
        int count = 0;
        for (int i = 1; i < 24; i += 2) {
            if (count % 5 == 0) {
                System.out.println();
            }
            System.out.printf("%3d", i);
            count++;
        }
        while (count % 5 > 0) {
            System.out.printf("%3d", 0);
            count++;
        }

        System.out.println("\n\n5.Проверка количества двоек на четность/нечетность");
        num = 3242592;
        int countTwos = 0;
        System.out.print("число " + num + " содержит ");
        while (num != 0) {
            int digit = num % 10;
            num /= 10;
            if (digit == 2) {
                countTwos++;
            }
        }
        if (countTwos % 2 == 0) {
            System.out.println(countTwos + " (четное) количество двоек");
        } else {
            System.out.println(countTwos + " (нечетное) количество двоек");
        }

        System.out.println("\n6.Отображение фигур в консоли");
        for (int star1 = 0; star1 < 5; star1++ ) {
            for (int star2 = 0; star2 < 10; star2++ ) {
                System.out.print("*");
            }
            System.out.println();
        }

        int lineNum = 0;
        int columnNum = 0;
        while (lineNum < 5) {
            while (columnNum + lineNum < 5) {
                System.out.print("#");
                columnNum++;
            }
            System.out.println();
            columnNum = 0;
            lineNum++;
        }

        lineNum = 0;
        columnNum = 0;
        do {
            do {
                System.out.print("$");
                columnNum++;
            } while (columnNum <= lineNum);
            System.out.println();
            lineNum++;
            columnNum = 0;
            if (lineNum >= 3) {
                columnNum = 2;
            }
            if (lineNum == 4) {
                columnNum = 4;
            }
        } while (lineNum < 5);

        System.out.println("\n7.Отображение ASCII-символов");
        System.out.printf("%5s %5s %n", "Dec", "Char");
        for (int i = 0; i < 128; i++) {
            if (i > 0 && i < 48 && i % 2 != 0) {
                System.out.printf("%5d %5c %n", i, (char) i);
            } else if (i > 96 && i < 123 && i % 2 == 0) {
                System.out.printf("%5d %5c %n", i, (char) i);
            }
        }

        System.out.println("\n8.Проверка, является ли число палиндромом");
        num = 1234321;
        int copyNum = num;
        int revNum = 0;
        while (copyNum != 0){
            int digit = copyNum % 10;
            revNum = revNum * 10 + digit;
            copyNum /= 10;
        }
        System.out.print("число " + num);
        if (num == revNum) {
            System.out.println(" является палиндромом");
        } else {
            System.out.println(" не является палиндромом");
        }

        System.out.println("\n9.Определение, является ли число счастливым");
        num = 145091;
        copyNum = num;
        int sum = 0;
        int sumRightHalfDigits = 0;
        count = 0;
        System.out.print("Сумма цифр ");
        while (copyNum > 0) {
            if (count == 3) {
                sumRightHalfDigits = sum;
                System.out.println(" = " + sumRightHalfDigits);
                System.out.print("Сумма цифр ");
                count = 0;
                sum = 0;
            }
            int digit = copyNum % 10;
            sum += digit;
            copyNum /= 10;
            count++;
            System.out.print(digit);

        }
        int sumLeftHalfDigits = sum;
        System.out.println(" = " + sumLeftHalfDigits);
        System.out.print("Число " + num + " является ");
        if (sumRightHalfDigits == sumLeftHalfDigits) {
            System.out.println("счастливым");
        } else {
            System.out.println("несчастливым");
        }

        System.out.println("\n10.Вывод таблицы умножения Пифагора");
        for (int i = 1; i < 10; i++) {
            if (i == 1) {
                System.out.printf("%2s", "|");
            } else {
                System.out.printf("%3d", i);
            }
        }
        System.out.println();
        for (int i = 0; i < 26; i++) {
            System.out.print("_");
        }
        System.out.println("");
        for (int i = 2; i < 10; i++) {
            System.out.print(i + "|");
            for (int j = 2; j < 10; j++) {
                System.out.printf("%3d", (i * j));
            }
            System.out.println();
        }
   }
}