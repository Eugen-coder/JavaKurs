package Lesson_31_11032025.Reflex;

public class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public void sayHello () {
        System.out.println("Privet, menya zovut " + name);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }
}
