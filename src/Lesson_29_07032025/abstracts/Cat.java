package Lesson_29_07032025.abstracts;

public class Cat extends Animal{

    @Override
    void move() {
        System.out.println("Kot peredvigaetsya");
    }

    @Override
    void eat() {
        System.out.println("Kot kushaet!");
    }
}
