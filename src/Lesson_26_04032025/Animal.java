package Lesson_26_04032025;

public class Animal {

    protected String name;

    public Animal(String name) {
        this.name = name;
    }

    public Animal() {
    }

    void eat() {
        System.out.println(name + " eats");
    }

    public String toString() {
        return "Animal " + name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
