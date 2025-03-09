package Lesson_29_07032025;

public class Child extends Parent {

    int age;

    public Child() {
        super();
        this.age = 20;
    }

    public Child(String name, int age) {

        this.name = name;
        this.age = age;
    }

    void show() {
        System.out.println("Another show!");
    }

}
