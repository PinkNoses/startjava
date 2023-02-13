import java.util.Scanner;
import java.util.Random;

public class GuessNumber {

    private int secretNum;
    private Player player1;
    private Player player2;
    private boolean equalNums;

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void setEqualNums(boolean equalNums) {
        this.equalNums = equalNums;
    }

    public void start() {
        Scanner sc = new Scanner(System.in);
        secretNum = 1 + (int) (Math.random() * 100);
        do {
            System.out.println(secretNum);
            System.out.println(player1.getName() + ", введите предполагаемое число:");
            player1.setNumber(sc.nextInt());
            compareNums(player1);
            if (!equalNums) {
                System.out.println(player2.getName() + ", введите предполагаемое число:");
                player2.setNumber(sc.nextInt());
                compareNums(player2);
            }
        } while (!equalNums);
    }

    private boolean compareNums(Player player) {
        if (player.getNumber() == secretNum) {
            System.out.println(player.getName() + ", Вы победили!");
            equalNums = true; 
        } else if (player.getNumber() > secretNum) {
            System.out.println("число " + player.getNumber() + " больше того, что загадал компьютер");
        } else if (player.getNumber() < secretNum) {
            System.out.println("число " + player.getNumber() + " меньше того, что загадал компьютер");
        }
        return equalNums; 
    }
}



