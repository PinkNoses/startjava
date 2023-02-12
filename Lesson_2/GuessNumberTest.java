import java.util.Scanner;
import java.util.Random;

public class GuessNumberTest {

    public static void main(String[] args) {
        String answer = "yes";

        Scanner sc = new Scanner(System.in);
        System.out.println("Игрок № 1, введи свое имя:");
        Player player1 = new Player(sc.nextLine());
        System.out.println("Игрок № 2, введи свое имя:");
        Player player2 = new Player(sc.nextLine());
        GuessNumber guessNumber = new GuessNumber();
        while (answer.equals("yes")) {
            guessNumber.setSecretNum(1 + (int) (Math.random() * 100));
            System.out.println(guessNumber.getSecretNum());             // Секретное число
           
            while (player1.getNumber() != guessNumber.getSecretNum() && 
                    player2.getNumber() != guessNumber.getSecretNum()) {
                System.out.println(player1.getName() + ", введите предполагаемое число:");
                player1.setNumber(sc.nextInt());
                guessNumber.compareNum(player1.getNumber(), player1.getName());
                if (player1.getNumber() == guessNumber.getSecretNum()) {
                    break;
                } else {
                    System.out.println(player2.getName() + ", введите предполагаемое число:");
                    player2.setNumber(sc.nextInt());
                    guessNumber.compareNum(player2.getNumber(), player2.getName());
                }
            }
            sc.nextLine();
            do {
                System.out.println("Хотите продолжить игру? [yes/no]");
                answer = sc.nextLine();
            } while (!answer.equals("yes") && !answer.equals("no"));
        }
    }
}