public class CyclesTheme {

    public static void main(String[] args) {
        System.out.println("1.Подсчет суммы четных и нечетных чисел");
        int start = -10;
        int end = 21;
        int evenNum = 0;
        int oddNum = 0;
        System.out.print("в промежутке [" + start + ", " + end + "] сумма четных чисел = ");
        do {
            if (start % 2 == 0) {
                evenNum += start;
                start++;
            } else {
                oddNum += start;
                start++;
            }
        } while (start <= end);
        System.out.println(evenNum + ", а нечетных = " + oddNum);

        System.out.println("\n2.Вывод чисел в интервале (min и max) в порядке убывания");
        int num1 = 10;
        int num2 = 5;
        int num3 = -1;
        int max = num1;
        int min = num2;
        if (num3 > num1) {
            max = num3;
            if (num1 < num2) {
                min = num1;
            }
        } else {
            min = num3;
        }
        if (num2 > num1) {
            max = num2;
        }

        for (int i = max - 1; i > min; i--) {
            System.out.print(i + " ");
        }

        System.out.println("\n\n3.Вывод реверсивного числа и суммы его цифр");
        int num = 1234;
        int sumDigit = 0;
        System.out.print("исходное число в обратном порядке: ");
        while (num != 0) {
            int digit = num % 10;
            num /= 10;
            sumDigit += digit;
            System.out.print(digit);
        }
        System.out.println("\nсумма его цифр: " + sumDigit);

        System.out.println("\n4.Вывод чисел на консоль в несколько строк");
        int count = 0;
        for (int i = 1; i < 24; i += 2) {
            System.out.printf("%3d", i);
            count++;
            if (count % 5 == 0) {
                System.out.println();
            }
        }
        while (count % 5 != 0) {
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
        for (int i = 0; i < 5; i++ ) {
            for (int j = 0; j < 10; j++ ) {
                System.out.print("*");
            }
            System.out.println();
        }

        int i = 0;
        int j = 0;
        while (i < 5) {
            while (j + i < 5) {
                System.out.print("#");
                j++;
            }
            System.out.println();
            j = 0;
            i++;
        }

        i = 0;
        j = 0;
        do {
            do {
                System.out.print("$");
                j++;
            } while (j <= i);
            System.out.println();
            i++;
            j = 0;
            if (i >= 3) {
                j = 2;
            }
            if (i == 4) {
                j = 4;
            }
        } while (i < 5);

        System.out.println("\n7.Отображение ASCII-символов");
        System.out.printf("%5s %5s %n", "Dec", "Char");
        for (i = 0; i < 128; i++) {
            if (i > 0 && i < 48 && i % 2 !=0 ) {
                System.out.printf("%5d %5c %n", i, (char) i);
            } else if (i > 96 && i < 123 && i % 2 == 0) {
                System.out.printf("%5d %5c %n", i, (char) i);
            }
        }

        System.out.println("\n8.Проверка, является ли число палиндромом");
        num = 1234321;
        int numCopy = num;
        int revNum = 0;
        int digit = 0;
        while (numCopy != 0){
            digit = numCopy % 10;
            revNum = revNum * 10 + digit;
            numCopy /= 10;
        }
        if (num == revNum) {
            System.out.println("число " + num + " является палиндромом");
        }

        System.out.println("\n9.Определение, является ли число счастливым");
        int totalNum = 145091;
        num = totalNum;
        digit = 0;
        int digitSum1 = 0;
        int digitSum2 = 0;
        count = 0;
        System.out.print("Сумма цифр ");
        while (count != 3) {
            digit = num % 10;
            digitSum1 += digit;
            num /= 10;
            count++;
            System.out.print(digit);
        }
        System.out.println(" = " + digitSum1);
        System.out.print("Сумма цифр ");
        while (num != 0) {
            digit = num % 10;
            digitSum2 += digit;
            num /= 10;
            System.out.print(digit);
        }
        System.out.println(" = " + digitSum1);
        System.out.print("Число " + totalNum + " является ");
        if (digitSum1 == digitSum2) {
            System.out.println("счастливым");
        } else {
            System.out.println("несчастливым");
        }

        System.out.println("\n10.Вывод таблицы умножения Пифагора");
        for (i = 1; i < 10; i++) {
            if (i == 1) {
                System.out.printf("%2s", "|");
            } else {
                System.out.printf("%3d", i);
            }
        }
        System.out.println();
        for (i = 0; i < 26; i++) {
            System.out.print("_");
        }
        System.out.println("");
        for (i = 2; i < 10; i++) {
            System.out.print(i + "|");
            for (j = 2; j < 10; j++) {
                System.out.printf("%3d", (i * j));
            }
            System.out.println("");
        }
   }
}