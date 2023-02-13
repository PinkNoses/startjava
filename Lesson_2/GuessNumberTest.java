import java.util.Scanner;


public class GuessNumberTest {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Игрок № 1, введи свое имя:");
        Player player1 = new Player(sc.nextLine());
        System.out.println("Игрок № 2, введи свое имя:");
        Player player2 = new Player(sc.nextLine());
        GuessNumber game = new GuessNumber(player1, player2);
        String answer = "yes";
        while (answer.equals("yes")) {
            game.start();
            do {
                game.setEqualNums(false);
                System.out.println("Хотите продолжить игру? [yes/no]");
                answer = sc.nextLine();
            } while (!answer.equals("yes") && !answer.equals("no"));
        }
    }
}