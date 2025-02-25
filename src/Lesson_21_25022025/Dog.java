package Lesson_21_25022025;

public class Dog {

    String name;
    int weight;

    public Dog(String name, int weight) {
        this.name = name;
        this.weight = weight;

    }

    public void info() {
        System.out.println("I am dog " + name + ", my weight: " + weight);
    }

    public void eat() {
        System.out.println("Ya kushayu, nyam-nyam!");
        this.weight++;
    }


    public void run() {

        while (weight < 3) {
            System.out.println("Ssory, ya golodnaya! Nado poest!");
            System.out.println("Moy ves seychas: " + weight);

            eat();
        }

        System.out.println("Ya begu!");
        weight -= 2; // umenshaem ves na 2
        System.out.println("Ves posle probezhki: " + weight);
        System.out.println("\n=========\n");
    }

}
