package Lesson_28_06032025.animals;

public class CastingExample {

    public static void main(String[] args) {

        Animal animal = new Cat(); // tip Cat avtomaticheski preobrazuetsya k tipu Animal

        /*

        !!! Vazhno !
        Tip ssilochnoy peremennoy opredelyaet:
        1. Ssilki na obekti kakix tipov mogut xranitsya v etoy peremennoy
        2. Spisok metodov, kotorie mozhno vizvat, obrashayas k etoy peremennoy

         */

        animal.voice();

        Animal animal1 = new Hamster();

        animal1.voice();

        Animal[] animals = new Animal[3];
        animals[0] = animal;
        animals[1] = animal1;
        animals[2] = new Dog();

        for (int i = 0; i < animals.length; i++) {
            animals[i].voice();
        }

        // Todo Nisxodyashee preobrazovanie

    }
}
