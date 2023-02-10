import java.util.Scanner;

public class CalculatorTest {

    public static void main (String[] args) {
        boolean isAnswerIsYes = true;
        Calculator calculator = new Calculator();
        Scanner sc = new Scanner(System.in);
        while (isAnswerIsYes) {
            String answer = "";
            System.out.print("Введите первое число: ");
            calculator.setA(sc.nextInt());
            System.out.print("Введите знак математической операции: ");
            calculator.setSign(sc.next().charAt(0));
            System.out.print("Введите второе число: ");
            calculator.setB(sc.nextInt());
            sc.nextLine();
            calculator.setResult(calculator.resolve(calculator.getA(), calculator.getSign(), calculator.getB()));
            System.out.println(calculator.getA() + " " + calculator.getSign() + " " +
                    calculator.getB() + " = " + calculator.getResult());
            while (!(answer.equals("yes") || answer.equals("no"))) {
                System.out.println("Хотите продолжить вычисления? [yes/no]");
                answer = sc.nextLine();
                if (answer.equals("no")) {
                    isAnswerIsYes = false;
                }
            }
        }
    }
}