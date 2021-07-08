package Lesson_2;

public class Calculator {
    int num1;
    int num2;
    char operation;
    int result = calc(num1, num2, operation);

    public static int calc(int num1, int num2, char operation) {
        int result = 1;
        switch (operation) {
            case '+' -> result = num1 + num2;
            case '-' -> result = num1 - num2;
            case '*' -> result = num1 * num2;
            case '/' -> result = num1 / num2;
            case '%' -> result = num1 % num2;
        }

        return result;
    }

    public void setFirstNum(int nextInt) {
    }

    public void setMathOper(char charAt) {
    }

    public void setSecondNum(int nextInt) {
    }


    public int calculate() {
        return 0;
    }
}
