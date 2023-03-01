package com.startjava.lesson_2_3_4.array;

public class ArrayTheme {
    public static void main(String[] args) {
        System.out.println("1.Реверс значений массива");
        int[] intArr = {5, 7, 1, 6, 4, 3, 2};
        int length = intArr.length;
        System.out.print("Исходный массив: ");
        outputArray(intArr);
        for (int i = 0; i < length; i++) {
            int temp = intArr[i];
            intArr[i] = intArr[--length];
            intArr[length] = temp;
        }
        System.out.print("\nИсходный массив в обратном порядке: ");
        outputArray(intArr);

        System.out.println("\n\n2.Вывод произведения элементов массива");
        intArr = new int[10];
        length = intArr.length;
        for (int i = 0; i < length; i++) {
            intArr[i] = i;
        }
        int result = 1;
        for (int i = 1; i < length - 1; i++) {
            result *= intArr[i];
            System.out.print(intArr[i] + ((i < length - 2) ? " * " : " = " + result));
        }
        System.out.println("\n" + intArr[0] + "\n" + intArr[9]);

        System.out.println("\n3.Удаление элементов массива");
        double[] doubleArr = new double[15];
        length = doubleArr.length;
        System.out.println("Исходный массив: ");
        int count = 0;
        for (int i = 0; i < length; i++) {
            doubleArr[i] = Math.random();
        }
        outputArray(doubleArr, count);
        double middleCellValue = doubleArr[length / 2];
        int countZero = 0;
        System.out.println("\nИзмененный массив: ");
        for (int i = 0; i < length; i++) {
            if (doubleArr[i] > middleCellValue) {
                doubleArr[i] = 0.0;
                countZero++;
            }
        }
        outputArray(doubleArr, count);
        System.out.println("\nКоличество обнуленных ячеек: " + countZero);

        System.out.println("\n4.Вывод элементов массива лесенкой в обратном порядке");
        char[] charArr = new char[26];
        length = charArr.length;
        for (int i = 0; i < 26; i++) {
            charArr[i] = (char) ('A' + i);
        }
        for (int j = length - 1; j >= 0; j--) {
            for (int i = length - 1; i >= j; i--) {
                System.out.print(charArr[i]);
            }
            System.out.println();
        }

        System.out.println("\n5.Генерация уникальных чисел");
        intArr = new int[30];
        for (int i = 0; i < intArr.length; ) {
            while (true) {
                int randomNumber = 60 + (int) (Math.random() * 40);
                if (!contain(randomNumber, intArr)) {
                    intArr[i] = randomNumber;
                    i++;
                    break;
                }
            }
        }
        sort(intArr);
        for (int i = 0; i < 30; i++) {
            if (i % 10 == 0) {
                System.out.println();
            }
            System.out.print(intArr[i] + " ");
        }

        System.out.println("\n\n6.Копирование не пустых строк");
        String[] srcStrings = {" ", "AA", "", "BBB", "CC", "D", " ", "E", "FF", "G", ""};
        length = srcStrings.length;
        System.out.print("Исходный массив: ");
        outputArray(srcStrings);
        int j = 0;
        for (int i = 0; i < length; i++) {
            if (!srcStrings[i].isBlank()) {
                if (i != j) {
                    String temp = srcStrings[j];
                    srcStrings[j] = srcStrings[i];
                    srcStrings[i] = temp;
                }
                j++;
            } else {
                count++;
            }
        }
        String[] destStrings = new String[length - count];
        System.arraycopy(srcStrings, 0, destStrings, 0, destStrings.length);
        System.out.print("\nИзмененный массив: ");
        outputArray(destStrings);
    }

    private static void outputArray(int[] intArray) {
        for (int element : intArray) {
            System.out.print(element + " ");
        }
    }

    private static void outputArray(double[] doubleArray, int count) {
        for (double element : doubleArray) {
            if (count > 7) {
                System.out.println();
                count = 0;
            }
            count++;
            System.out.printf("%5.3f %s", element, " ");
        }
    }

    private static boolean contain(int randomNumber, int[] intArray) {
        for (int number : intArray) {
            if (number == randomNumber) {
                return true;
            }
        }
        return false;
    }

    private static void sort(int[] intArray) {
        for (int i = 0; i < intArray.length - 1; i++) {
            for (int j = intArray.length - 1; j > i; j--) {
                if (intArray[j - 1] > intArray[j]) {
                    int temp = intArray[j - 1];
                    intArray[j - 1] = intArray[j];
                    intArray[j] = temp;
                }
            }
        }
    }

    private static void outputArray(String[] array) {
        for (String element : array) {
            System.out.print(element + ", ");
        }
    }
}

