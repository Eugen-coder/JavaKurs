package Lesson_26_04032025;

public class AnimalsApp {
    public static void main(String[] args) {

        Dog dog = new Dog("Bobik");
        dog.eat();
        System.out.println(dog.getName());
        System.out.println(dog.toString());



        dog.bark();

    }
}
