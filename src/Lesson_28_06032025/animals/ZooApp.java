package Lesson_28_06032025.animals;

public class ZooApp {
    public static void main(String[] args) {


        Cat cat = new Cat();

        cat.voice();
        System.out.println(cat.toString());

        cat.eat();

        System.out.println("\n=========\n");

        Dog dog = new Dog();

        dog.voice();

        System.out.println(dog.toString());

        Hamster hamster = new Hamster();
        hamster.voice();
        System.out.println(hamster.toString());
    }
}
