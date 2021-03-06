package Lesson__1;

import java.util.Scanner;

public class Calculator {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
    int num1 = inputNumber();
    int num2 = inputNumber();
    char operation = inputOperation();
    int result = calculator(num1, num2, operation);
    System.out.println("Результат оперaции: " + result);
    }


    public static int inputNumber () {
        System.out.println("Введите число: ");
        int num;
        if (sc.hasNextInt()) {
            num = sc.nextInt();
        } else {
            System.out.println("Вы допустили ошибку при вводе числа. Попробуйте еще раз.");
            sc.next();
            num = inputNumber();
        }
        return num;
    }

    public static char inputOperation() {
        System.out.println("Введите оперцию: ");
            char operation = 0;
            if (sc.hasNext()) {
                operation = sc.next().charAt(0);
            } else {
                System.out.println("Вы допустили ошибку при вводе операции. Попробуйте еще раз.");
                sc.next();
            }
            return operation;
        }

        public static int calculator (int num1, int num2, char operation) {

            int result = 1;
            if (operation == '+') {
                result = num1 + num2;
            } else if (operation == '-') {
                result = num1 - num2;
            } else if (operation == '*') {
                result = num1 * num2;
            } else if (operation == '/') {
                result = num1 / num2;
            } else if (operation == '%') {
                result = num1 % num2;
            } else {
                for (int i = 0; i < num2; num2++) {
                    result *= num1;
                }
            }
            return (char) result;
        }
    }

