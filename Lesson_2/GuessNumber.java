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

    Scanner sc = new Scanner(System.in);

    public void start() {
        secretNumber = 1 + (int) (Math.random() * 100);
        do {
            inputNumber(player1);
            if (!compareNumbers(player1)) {
                inputNumber(player2);
                compareNumbers(player2);
            }
        } while (!stopGame());
    }

    private void inputNumber(Player player) {
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
    
    private boolean stopGame() {
        if (player1.getNumber() == secretNumber || player2.getNumber() == secretNumber) {
            return true;
        }
        return false;
    }
}