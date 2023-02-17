import java.util.Scanner;
import java.util.Random;

public class GuessNumber {

    private int secretNumber;
    private Player player1;
    private Player player2;
    private boolean equalNumbers;

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void start() {
        secretNumber = 1 + (int) (Math.random() * 100);
        do {
            Scanner sc = new Scanner(System.in);
            inputNumber(player1, sc);
            if (compareNumbers(player1)) {
                return;
            }
            inputNumber(player2, sc);
        } while (!compareNumbers(player2));
    }

    private void inputNumber(Player player, Scanner sc) {
        System.out.println(player.getName() + ", введите предполагаемое число:");
        player.setNumber(sc.nextInt());
        sc.nextLine();
    }

    private boolean compareNumbers(Player player) {
        if (player.getNumber() == secretNumber) {
            System.out.println(player.getName() + ", Вы победили!");
            return true;
        }
        if (player.getNumber() > secretNumber) {
            System.out.println("число " + player.getNumber() + " больше того, что загадал компьютер");
        } else {
            System.out.println("число " + player.getNumber() + " меньше того, что загадал компьютер");
        }
        return false;
    }
}