package Lesson_1;

public class Variable_1 {
    public static void main(String[] args) {
        double cpu = 3.4;
        System.out.println("Процессор:  " + cpu + " GHz;");

        byte ram = 8;
        System.out.println("Операционная система:  " + ram + " Гб;");

        int compactDiscReadOnlyMemory = 700;
        System.out.println("CD-ROM: " + compactDiscReadOnlyMemory + " Mб;");

        long hdd = 500;
        System.out.println("Жесткий диск:  " + hdd + " Гб;");

        short typeOfOperatingSystem = 64;
        System.out.println("Тип ситемы:  " + typeOfOperatingSystem + " -разрядная ОП;");

        char symbol = 'D';
        System.out.println(symbol);

        float numeral = 2362.5f;
        System.out.println(numeral);

        boolean conclusion = true;
        System.out.println("Всё выше перечисленное:  " + conclusion);
    }
}
