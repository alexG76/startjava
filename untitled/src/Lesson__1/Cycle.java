package Lesson__1;

public class Cycle {
    public static void main(String[] args) {
        for (int i = 0; i <= 20; i++) {
            System.out.println("Число: " + i);
        }

        int counter = -6;
        while (counter < 8) {
            System.out.println("Вы написали: " + counter);
            counter += 2;
        }

        int j = 10;
        int sum = 0;
        do {
            j++;
            sum = j % 2 == 0 ? sum : sum + j;
        } while (j < 20);
        System.out.println("Сумма: " + sum);
    }
}
