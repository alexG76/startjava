package Lesson__2;

public class Wolf {
    private String half;
    private String nickname;
    private double weight;
    private int age;
    private String color;

    public void setHalf(String half) {
        this.half = half;}

    public String getHalf() {
        return half;}

    public void setNickname(String nickname) {
        this.nickname = nickname;}

    public String getNickname() {
        return nickname;}

    public void setWeight(double weight) {
        this.weight = weight;}

    public double getWeight() {
        return weight;}

    public void setAge(int age) {
        if (age > 8) {
            System.out.println("Некорректный возраст");
        } else {
            this.age = age;}
    }

    public int getAge() {
        return age;}

    public void setColor(String color) {
        this.color = color;}

    public String getColor() {
        return color;}

    public void walk() {
        System.out.println("Идёт.");}

    public void seat() {
        System.out.println("Сидеть.");}

    public void escape() {
        System.out.println("Бежать");}

    public void howl() {
        System.out.println("Выть.");}

    public void hunt() {
        System.out.println("Охотиться.");}
}
