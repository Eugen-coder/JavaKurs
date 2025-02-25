package Lesson_21_25022025;

public class Cat {

    String name; // polr klassa
    String color;
    int age;


    public Cat() {

    }

    public Cat(String catName) {
        name = catName;
    }

    public Cat(String catName, String color) {
        name = catName;
        this.color = color;

        // Kluchevoe slovo / this / ispolzuetsya dlya ssilki na tekushiy
        // Ono pomozhet pri reshenii konfliktov imen poley klassa i parametrov metodov /
    }

    public Cat(String name, String color, int age) {
        this(name,color);

        this.name = name;
        this.color = color;
        this.age = age;

    }

    // Povedenie budushix obyektov
    public void sleep() {
        System.out.println("Ya splu!");
    }

    public void sayMeow() {
        System.out.println("Meow!");

    }

    public void run() {
        System.out.println("Ya begu!");
    }

    public void whoAmI() {
        System.out.printf("Ya kotik %s, vozrast: %d, moy okras %s\n", name, age,color);
    }

}
