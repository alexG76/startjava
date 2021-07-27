package Lesson__2;

import java.util.Scanner;

public class CalculatorTest {
    public void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String reply = "yes";

        while (reply.equals("yes")) {
            Calculator calc = new Calculator();

            scanner = new Scanner(System.in);
            System.out.println("Введите первое число: ");
            calc.setFirstNum(scanner.nextInt());

            System.out.println("Введите знак математической операции: ");
            calc.setMathOper(scanner.next().charAt(0));

            System.out.println("Введите второе число: ");
            calc.setSecondNum(scanner.nextInt());

            System.out.println(new StringBuilder().append("Результат вычисления = ").append(calc.calculate()).toString());

            while (reply.equals("yes") | reply.equals("no")) {
                System.out.println("Хотите продолжить вычисления? [yes/no]");
                reply = scanner.nextLine();
            }
        }
    }
}
