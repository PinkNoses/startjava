public class VariablesTheme {	
    
    public static void main(String[] args) {
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
        System.out.println();

        System.out.println("2. Расчет стоимости товара со скидкой");
        int pen = 100;
        int book = 200;
        int percentage = 11;
        int discount = pen * book * 11 / 100;
        int costWithDiscount = pen * book - discount;
        System.out.println(discount);
        System.out.println(costWithDiscount);
        System.out.println();

        System.out.println("3. Вывод слова JAVA");
        System.out.println("   J    a  v     v  a");
        System.out.println("   J   a a  v   v  a a");
        System.out.println("J  J  aaaaa  V V  aaaaa");
        System.out.println(" JJ  a     a  V  a     a");
        System.out.println();

        System.out.println("4. Вывод min и max значений целых числовых типов");
        byte byteMax = Byte.MAX_VALUE;
        short shortMax = Short.MAX_VALUE;
        int intMax = Integer.MAX_VALUE;
        long longMax = Long.MAX_VALUE;
        System.out.println(byteMax + ", " + ++byteMax + ", " + --byteMax);
        System.out.println(shortMax + ", " + ++shortMax + ", " + --shortMax);
        System.out.println(intMax + ", " + ++intMax + ", " + --intMax);
        System.out.println(longMax + ", " + ++longMax + ", " + --longMax);
        System.out.println();

        System.out.println("5. Перестановка значений переменных");
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
        System.out.println();

        System.out.println("6. Вывод символов и их кодов");
        byte code1 = 35;
        byte code2 = 38;
        byte code3 = 64;
        byte code4 = 94;
        byte code5 = 95;
        char char1 = (char) code1;
        char char2 = (char) code2;
        char char3 = (char) code3;
        char char4 = (char) code4;
        char char5 = (char) code5;
        System.out.println("Коду " + code1 + " соотвествует символ " + char1);
        System.out.println("Коду " + code2 + " соотвествует символ " + char2);
        System.out.println("Коду " + code3 + " соотвествует символ " + char3);
        System.out.println("Коду " + code4 + " соотвествует символ " + char4);
        System.out.println("Коду " + code5 + " соотвествует символ " + char5);
        System.out.println();

        System.out.println("7. Вывод в консоль ASCII-арт Дюка");
        char slash = '/';
        char backSlash = '\\';
        char line = '_';
        char bracketRight = '(';
        char bracketLeft = ')';
        System.out.println("    " + slash + backSlash);
        System.out.println("   " + slash + "  " + backSlash);
        System.out.println("  " + slash + line + bracketRight + " " + bracketLeft + 
                backSlash);
        System.out.println(" " + slash + "      " + backSlash);
        System.out.println("" + slash + line + line + line + line + slash + 
                backSlash + line + line + backSlash);
        System.out.println();

        System.out.println("8. Вывод количества сотен, десятков и единиц числа");
        int num = 123;
        System.out.println("Число " + num + " содержит:");
        System.out.println(num / 100 + " сотен");
        System.out.println(num % 100 / 10 + " десятков");
        System.out.println(num % 100 % 10 + " единиц");
        System.out.println("Сумма его цифр = " + (num / 100 + num % 100 / 10 + num % 100 % 10));
        System.out.println("Произведение = " + num / 100 * num % 100 / 10 * num % 100 % 10);
        System.out.println();

        System.out.println("9. Вывод времени");
        num = 86399;
        int hour = num / 3600;
        int minute = num / 60 % (hour * 60);
        int second = num % (hour * 3600) % (minute * 60);
        System.out.println(hour + ":" + minute + ":" + second);












        





        
    }
}