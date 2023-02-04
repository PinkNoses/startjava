import java.util.Random;
public class MyFirstGame {
    
    public static void main(String[] args) {
        int totalNum = 1 + (int) (Math.random() * 100);
        int userNum = 1 + (int) (Math.random() * 100);
        while (userNum != totalNum) {
            if (userNum < totalNum) {
                System.out.println("число " + userNum + " меньше того, что загадал компьютер");
                userNum += 5;
            } else {
                System.out.println("число " + userNum + " больше того, что загадал компьютер");
                userNum -= 1;
            }
        }
        System.out.println("Вы победили!");
    }
}