import java.util.Scanner;

public class GuessNumber {

    private int secretNum;
    private Player player1;
    private Player player2;

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public int getSecretNum() {
        return secretNum;
    }

    public void setSecretNum(int secretNum) {
        this.secretNum = secretNum;
    }

    private void compareNum(Player player) {
        if (player.getNumber() == secretNum) {
            System.out.println(player.getName() + ", Вы победили!");
        } else if (player.getNumber() > secretNum) {
            System.out.println("число " + player.getNumber() + " больше того, что загадал компьютер");
        } else if (player.getNumber() < secretNum) {
            System.out.println("число " + player.getNumber() + " меньше того, что загадал компьютер");
        }
    }

    public void startGame() {
        Scanner sc = new Scanner(System.in);
        while (player1.getNumber() != secretNum && player2.getNumber() != secretNum) {
            System.out.println(player1.getName() + ", введите предполагаемое число:");
            player1.setNumber(sc.nextInt());
            compareNum(player1);
            if (player1.getNumber() == secretNum) {
                break;
            } else {
                System.out.println(player2.getName() + ", введите предполагаемое число:");
                player2.setNumber(sc.nextInt());
                compareNum(player2);
            }
        }
    }
}



