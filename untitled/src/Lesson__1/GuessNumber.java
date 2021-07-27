package Lesson__1;

import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Привет! Угадай загаданное число!");
        int endRange = 101;
        int secretNumber = (int) (Math.random() * endRange);
        while (true) {
            System.out.println("Угадай число от 0 до " + endRange);
            int playerNumber = sc.nextInt();
            if (playerNumber == secretNumber) {
                System.out.println("Вы угадали!!!");
                break;
            } else if (playerNumber > secretNumber) {
                System.out.println("Загаданное число меньше.");
            } else {
                System.out.println("Загаданное число больше.");
            }
        }
        sc.close();
    }
}
