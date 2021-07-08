package Lesson_2;

public class PersonMain {
    public static void main(String[] args) {
        Person person = new Person();
        person.name = "Mike";
        person.gender = "мужчина";
        person.age = 40;
        person.weight = 80.2;
        person.height = 182.5;
        System.out.println("Знакомтесь, клерк - " + person.name + " , " + "он - " + person.gender + ".");
        System.out.println("Его возраст: " + person.age + " лет, его рост: " + person.height + " см, его вес: " + person.weight + " кг.");

        person.walk();
        person.sit();
        person.run();
        person.speak();
        person.learnJava();
    }
}

class Person {
    String gender;
    String name;
    double height;
    double weight;
    int age;

    void walk() {
        System.out.println(name + " идёт на работу.");
    }

    void sit() {
        System.out.println(name + " сидит на стуле в офисе.");
    }

    void run() {
        System.out.println(name + " бежит на беговой дорожке.");
    }

    void speak() {
        System.out.println(name + " разговариет по телефону.");
    }

    void learnJava() {
        System.out.println(name + " изучает язык Java.");
    }
}
