package Lesson__1;

public class ConditionalStatement {
    public static void main(String[] args) {
        int age = 25;
        if (age > 20) {
            System.out.println("Возраст студента.");
        }

        boolean mankind = true;
        if (mankind) {
            System.out.println("Это мужчинв.");
        } else if (!mankind) {
            System.out.println("Это не мужчина.");
        }

        double height = 1.50;
        if (height < 1.80) {
            System.out.println("да, верно.");
        } else {
            System.out.println("нет, не верно.");
        }

        char fistNameLetter = 77;
        if (fistNameLetter == 77) {
            System.out.println("пол мужской.");
        } else if (fistNameLetter == 73) {
            System.out.println("пол не мужской.");
        } else {
            System.out.println("пол не определен.");
        }
    }
}
