public class VariablesTheme {	
    
    //public static void main(String[] args) {
        System.out.println("1. Вывод значений переменных на консоль");
        byte core = 4;
        short ram = 16;
        int ssd = 512;
        long compCost = 1234567890;
        float diagonal = 15.6f;
        double freqCpu = 3.30d;
        char windowsVersion = '8';
        boolean isCompOn = true;
        System.out.println("Количество ядер: " + core);
        System.out.println("Оперативная память: " + ram);
        System.out.println("Объем жесткого диска: " + ssd);
        System.out.println("Стоимость ПК: " + compCost);
        System.out.println("Диагональ монитора: " + diagonal);
        System.out.println("Частота процессора: " + freqCpu);
        System.out.println("Версия Windows: " + windowsVersion);
        System.out.println("Компьютер включен? " + isCompOn);
        
        System.out.println("\n2. Расчет стоимости товара со скидкой");
        int penPrice = 100;
        int bookPrice = 200;
        int discount = 11;
        int discountSum = (penPrice + bookPrice) * (100 - discount) / 100;
        int discountPrice = (penPrice + bookPrice) - discountSum;
        System.out.println("Общая стоимость товаров без скидки: " + (penPrice + bookPrice));
        System.out.println("Сумма скидки: " + discountPrice);
        System.out.println("Общая стоимость товаров со скидкой: " + discountSum );
       
        System.out.println("\n3. Вывод слова JAVA");
        System.out.println("   J    a  v     v  a");
        System.out.println("   J   a a  v   v  a a");
        System.out.println("J  J  aaaaa  V V  aaaaa");
        System.out.println(" JJ  a     a  V  a     a");
        
        System.out.println("\n4. Вывод min и max значений целых числовых типов");
        byte byteMax = Byte.MAX_VALUE;
        short shortMax = Short.MAX_VALUE;
        int intMax = Integer.MAX_VALUE;
        long longMax = Long.MAX_VALUE;
        System.out.println(byteMax + ", " + ++byteMax + ", " + --byteMax);
        System.out.println(shortMax + ", " + ++shortMax + ", " + --shortMax);
        System.out.println(intMax + ", " + ++intMax + ", " + --intMax);
        System.out.println(longMax + ", " + ++longMax + ", " + --longMax);

        System.out.println("\n5. Перестановка значений переменных");
        int num1 = 2;
        int num2 = 5;
        int temp = num1;
        System.out.println("Замена переменных с помощью третьей переменной:");
        System.out.println("исходные значения переменных: num1 = " + num1 + ", num2 = " + num2);
        num1 = num2;
        num2 = temp;
        System.out.println("новые значения переменных: num1 = " + num1 + ", num2 = " + num2);
        System.out.println("Замена переменных с помощью побитовой операции ^:");
        System.out.println("исходные значения переменных: num1 = " + num1 + ", num2 = " + num2);
        num1 ^= num2;
        num2 ^= num1;
        num1 ^= num2;
        System.out.println("новые значения переменных: num1 = " + num1 + ", num2 = " + num2);
        System.out.println("Замена переменных с помощью арифметических операций:");
        System.out.println("исходные значения переменных: num1 = " + num1 + ", num2 = " + num2);
        num1 *= num2;
        num2 = num1 / num2;
        num1 /= num2;
        System.out.println("новые значения переменных: num1 = " + num1 + ", num2 = " + num2);

        System.out.println("\n6. Вывод символов и их кодов");
        char hash = '#';
        char ampersand = '&';
        char at = '@';
        char caret = '^';
        char underscore = '_';
        System.out.println("Коду " + (int) hash + " соответствует символ " + hash);
        System.out.println("Коду " + (int) ampersand + " соответствует символ " + ampersand);
        System.out.println("Коду " + (int) at + " соответствует символ " + at);
        System.out.println("Коду " + (int) caret + " соответствует символ " + caret);
        System.out.println("Коду " + (int) underscore + " соответствует символ " + underscore);

        System.out.println("\n7. Вывод в консоль ASCII-арт Дюка");
        char slash = '/';
        char backSlash = '\\';
        char bracketRight = '(';
        char bracketLeft = ')';
        System.out.println("    " + slash + backSlash);
        System.out.println("   " + slash + "  " + backSlash);
        System.out.println("  " + slash + underscore + bracketRight + " " + bracketLeft + 
                backSlash);
        System.out.println(" " + slash + "      " + backSlash);
        System.out.println("" + slash + underscore + underscore + underscore + underscore + 
                slash + backSlash + underscore + underscore + backSlash);

        System.out.println("\n8. Вывод количества сотен, десятков и единиц числа");
        int num = 123;
        int hundreds = num / 100;
        int tens = num % 100 / 10;
        int ones = num % 10;
        System.out.println("Число " + num + " содержит:");
        System.out.println(hundreds + " сотен");
        System.out.println(tens + " десятков");
        System.out.println(ones + " единиц");
        System.out.println("Сумма его цифр = " + (hundreds + tens + ones));
        System.out.println("Произведение = " + hundreds * tens * ones);

        System.out.println("\n9. Вывод времени");
        int totalSeconds = 86399;
        num = 86399;
        int hours = num / 3600;
        int minutes = num % 3600 / 60;
        int seconds = minutes % 60;
        System.out.println(hours + ":" + minutes + ":" + seconds);
    }
}
