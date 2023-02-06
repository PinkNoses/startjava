public class IfElseStatementTheme {

    public static void main (String[] args) {
        System.out.println("1.Перевод псевдокода на язык Java");
        int age = 25;
        double height = 1.5d;
        boolean isMale = true;
        if (age > 20) {
            System.out.println("Person over 20 years of age");
        } else {
            System.out.println("Person under 20 years of age");
        } 
        if (!isMale) {
            System.out.println("This is a female person");
        } else {
            System.out.println("This is a male person");
        }
        if (height < 1.80d) {
            System.out.println("Height below 180 cm");
        } else {
            System.out.println("Height above 180 cm");
        }
        char firstNameLetter = "Igor".charAt(0);
        if (firstNameLetter == 'M') {
            System.out.println("First letter of name is \"М\"");
        } else if (firstNameLetter == 'I') {
            System.out.println("First letter of name is \"I\"");
        } else {
            System.out.println("First letter of name isn`t \"M\" and \"I\"");
        }

        System.out.println("\n2.Поиск max и min числа");
        int num1 = 15;
        int num2 = 1;
        if (num1 > num2) {
            System.out.println("Число " + num1 + " max");
            System.out.println("Число " + num2 + " min");
        } else if (num1 < num2) {
            System.out.println("Число " + num2 + " max");
            System.out.println("Число " + num1 + " min");
        } else {
            System.out.println("Числа равны");
        }
        
        System.out.println("\n3.Проверка числа");
        int num = -31;
        System.out.print("Данное число (" + num + ") ");
        if (num == 0) {
            System.out.println("равно 0");
        } else {
            if (num > 0) {
                System.out.print("положительное ");
            } else {
                System.out.print("отрицательное ");
            }
            if (num % 2 == 0) {
                System.out.println(" и четное");
            } else {
                System.out.println("и нечетное");
            }
        }
        
        System.out.println("\n4.Поиск одинаковых цифр в числах");
        num1 = 641;
        num2 = 740;
        int hundredsNum1 = num1 / 100;
        int tensNum1 = num1 % 100 / 10;
        int onesNum1 = num1 % 10;
        int hundredsNum2 = num2 / 100;
        int tensNum2 = num2 % 100 / 10;
        int onesNum2 = num2 % 10;
        System.out.println("Исходные числа: " + num1 + "; " + num2);
        if (hundredsNum1 == hundredsNum2) {
            System.out.println("Одинаковая цифра: " + hundredsNum1 + "; номер разряда 1.");
        }
        if (tensNum1 == tensNum2) {
            System.out.println("Одинаковая цифра: " + tensNum1 + "; номер разряда 2.");
        }
        if (onesNum1 == onesNum2) {
            System.out.println("Одинаковая цифра: " + onesNum1 + "; номер разряда 3.");
        } 
        if (hundredsNum1 != hundredsNum2 && tensNum1 != tensNum2 && 
                    onesNum1 != onesNum2) {
            System.out.println("Равных цифр в числах нет");
        }
        
        System.out.println("\n5.Определение символа по его коду");
        char symbol =  '\u0057';
        System.out.print("Символ " + symbol + " - ");
        if (symbol >= '0' && symbol <= '9') {
            System.out.println("число");
        } else if (symbol >= 'A' && symbol <= 'Z') {
            System.out.println("большая буква");
        } else if (symbol >= 'a' && symbol <= 'z') {
            System.out.println("маленькая буква");
        } else {
            System.out.println("не буква и не число");
        }
        
        System.out.println("\n6.Подсчет суммы вклада и начисленных банком %");
        int deposit = 300000;
        int percent = 5;
        if (deposit >= 100000 & deposit <= 300000) {
           percent = 7;
        } else if (deposit > 300000) {
            percent = 10;
        }
        System.out.println("Cуммa вклада: " + deposit);
        int yearlyProfit = deposit * (100 + percent) / 100;
        System.out.println ("Начисленный %: " + (yearlyProfit - deposit));
        System.out.println("Итоговая сумма с %: " + yearlyProfit);
        
        System.out.println("\n7.Определение оценки по предметам");
        int historyPercent = 59;
        int programmingPercent = 91;
        int ratingHistory = 2;
        int ratingProgramming = 2;
        if (historyPercent > 91) {
            ratingHistory = 5;
        } else if (historyPercent > 73) {
            ratingHistory = 4;
        } else if (historyPercent > 60) {
            ratingHistory = 3;
        }
        System.out.println(ratingHistory + ": История");
        if (programmingPercent > 91) {
            ratingProgramming = 5;
        } else if (programmingPercent > 73) {
            ratingProgramming = 4;
        } else if (programmingPercent > 60) {
            ratingProgramming = 4;
        }
        System.out.println(ratingProgramming + ": Программирование");
        System.out.println("Средний балл оценок по предметам: " + (ratingProgramming + ratingHistory) / 2);
        System.out.println("Средний % по предметам: " + (historyPercent + programmingPercent) / 2);
        
        System.out.println("\n8.Расчет прибыли за год");
        int rent = 5000;
        int selling = 13000;
        int primeCost = 9000;
        yearlyProfit = (selling - primeCost - rent) * 12;
        if (yearlyProfit > 0) {
            System.out.println("Прибыль за год: +" + yearlyProfit + " руб");
        } else {
            System.out.println("Прибыль за год:" + yearlyProfit + " руб");
        }
        
        System.out.println("\n9. Подсчет количества банкнот");
        int cash = 567;
        int banknote100inATM = 10;
        int banknote10inATM = 5;
        int banknote1inATM = 50; 
        int hundreds = cash / 100;
        int tens = cash % 100 / 10;
        int ones = cash % 10;
        int banknote100FromATM = 0;
        int banknote10FromATM = 0;
        int banknote1FromATM = 0;
        if (hundreds > banknote100inATM) {
            banknote100FromATM = banknote100inATM;
            banknote10FromATM = (hundreds - banknote100inATM) * 10;
        } else {
            banknote100FromATM = hundreds;
        }
        if (banknote10FromATM + tens > banknote10inATM) {
            banknote1FromATM = (tens + banknote10FromATM - banknote10inATM) * 10;
            banknote10FromATM = banknote10inATM;
        } else {
            banknote10FromATM = tens;
        }
        if (ones + banknote1FromATM > banknote1inATM) {
            System.out.println("Банкнот не хватает для выдачи нужной суммы");
        } else {
            banknote1FromATM += ones;
            System.out.println("банкнот номиналом 100 USD требуется в следующем количестве: " + 
                    banknote100FromATM);
            System.out.println("банкнот номиналом 10 USD требуется в следующем количестве: " + 
                    banknote10FromATM);
            System.out.println("банкнот номиналом 1 USD требуется в следующем количестве: " + 
                    banknote1FromATM);
        }
        System.out.println("Выдаваемая сумма: " + (banknote100FromATM * 100 + 
                banknote10FromATM * 10 + banknote1FromATM));
    }
}