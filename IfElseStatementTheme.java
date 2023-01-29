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
        } else if (num1 < num2) {
            System.out.println("Число " + num2 + " max");
        } else {
            System.out.println("Числа равны");
        }
        
        System.out.println("\n3.Проверка числа");
        int num = -31;
        if (num == 0) {
            System.out.println("Данное число (" + num + ") равно 0");
        } else {
            System.out.print("Данное число (" + num + ") ");
            if (num > 0 & num % 2 == 0) {
                System.out.println("четное и положительное");
            } else if (num < 0 & num % 2 == 0) {
                System.out.println("четное и отрицательное");
            } else if (num > 0 & num % 2 != 0) {
                System.out.println("нечетное и положительное");
            } else if (num < 0 & num % 2 != 0) {
                System.out.println("нечетное и отрицательное");
            }  
        }
        
        System.out.println("\n4.Поиск одинаковых цифр в числах");
        num1 = 945;
        num2 = 645;
        int firstDigitNum1 = num1 / 100;
        int secondDigitNum1 = num1 % 100 / 10;
        int thirdDigitNum1 = num1 % 10;
        int firstDigitNum2 = num2 / 100;
        int secondDigitNum2 = num2 % 100 / 10;
        int thirdDigitNum2 = num2 % 10;
        System.out.println("Исходные числа: " + num1 + "; " + num2);
        if (firstDigitNum1 == firstDigitNum2) {
            System.out.println("Одинаковая цифра: " + firstDigitNum1 + "; номер разряда 1.");
        }
        if (secondDigitNum1 == secondDigitNum2) {
            System.out.println("Одинаковая цифра: " + secondDigitNum1 + "; номер разряда 2.");
        }
        if (thirdDigitNum1 == thirdDigitNum2) {
            System.out.println("Одинаковая цифра: " + thirdDigitNum1 + "; номер разряда 3.");
        } else {           
            System.out.println("Равных цифр в числах нет");
        }
        
        System.out.println("\n5.Определение символа по его коду");
        char symb = '\u0057';
        System.out.print("Символ " + symb + " - ");
        if (Character.isDigit('W')) {
            System.out.println("число");
        } else if (Character.isLetter ('W')) {
            if (Character.isUpperCase('W')) {
                System.out.println("большая буква");
            } else if (Character.isLowerCase('W')) {
                System.out.println("маленькая буква");
            }
        } else {
            System.out.println("не буква и не число");
        }
        
        System.out.println("\n6.Подсчет суммы вклада и начисленных банком %");
        int deposit = 300000;
        int yearlyProfit = 0;
        System.out.println("Cуммa вклада: " + deposit);
        System.out.print("Начисленный %: ");
        if (deposit < 100000) {
            yearlyProfit = deposit * 105 / 100;
            System.out.println(yearlyProfit - deposit);
        } else if (deposit >= 100000 & deposit <= 300000) {
            yearlyProfit = deposit * 107 / 100;
            System.out.println(yearlyProfit - deposit);
        } else if (deposit > 300000) {
            yearlyProfit = deposit * 110 / 100;
            System.out.println(yearlyProfit - deposit);
        }
        System.out.println("Итоговая сумма с %: " + yearlyProfit);
        
        System.out.println("\n7.Определение оценки по предметам");
        int history = 59;
        int prog = 91;
        int ratingHistory = 0;
        int ratingProg = 0;
        if (history <= 60) {
            ratingHistory = 2;
        } else if (history > 91) {
            ratingHistory = 5;
        } else if (history > 73) {
            ratingHistory = 4;
        } else if (history > 60) {
            ratingHistory = 3;
        }
        System.out.println(ratingHistory + ": История");
        if (prog <= 60) {
            ratingProg = 2;
        } else if (prog > 91) {
            ratingProg = 5;
        } else if (prog > 73) {
            ratingProg = 4;
        } else if (prog > 60) {
            ratingProg = 4;
        }
        System.out.println(ratingProg + ": Программирование");
        System.out.println("Средний балл оценок по предметам: " + (ratingProg + ratingHistory) / 2);
        System.out.println("Средний % по предметам: " + (history + prog) / 2);
        
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