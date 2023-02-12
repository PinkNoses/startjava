public class GuessNumber {

    private int secretNum;

    public int getSecretNum() {
        return secretNum;
    }

    public void setSecretNum(int secretNum) {
        this.secretNum = secretNum;
    }

    public void compareNum(int playerNum, String playerName) {
        if (playerNum == secretNum) {
            System.out.println(playerName + ", Вы победили!");
        } else if (playerNum > secretNum) {
            System.out.println("число " + playerNum + " больше того, что загадал компьютер");
        } else if (playerNum < secretNum) {
            System.out.println("число " + playerNum + " меньше того, что загадал компьютер");
        }
    }
}