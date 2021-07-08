package Lesson_2;

public class WolfTest {
    public static void main(String[] args) {
        Wolf wolf = new Wolf();
        wolf.setNickname("Dic");
        wolf.setAge(5);
        wolf.setColor("серый");
        wolf.setWeight(74.5);
        wolf.setHalf("кобель");
        System.out.println("Имя: " + wolf.getNickname());
        System.out.println("Возраст: " + wolf.getAge() + " , окрас: " + wolf.getColor());
        System.out.println("Пол: " + wolf.getHalf() + " , вес: " + wolf.getWeight());
        System.out.println();

        wolf.howl();
        wolf.escape();
        wolf.seat();
        wolf.walk();
        wolf.hunt();
    }
}
