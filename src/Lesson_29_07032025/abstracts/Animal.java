package Lesson_29_07032025.abstracts;

// Abstraktnie klassi pozvolyayut opredelit shablin dlya gruppi svyazannix klassov.
// 1. Nelzya sozdat obekt abstractnogo klassa
// 2. Mogut sodergat abstraktnie metodi.
// 3. Abstraktniy metod - eto metod bez realizacii
// 4. Abstraktnie klassi mogut soderzhat realizovannie metodi
// 5. Mogut soderzhat polya i konstruktori

public abstract class Animal {

    private String name;

    public Animal() {
        this.name = "Animal";
    }

    abstract void move();// metod neimeet tela
    abstract void eat();

    public void sayHello(){
        System.out.println("Hello from animal");
    }
}
