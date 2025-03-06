package Lesson_28_06032025.animals;

public class Dog extends Animal{

    @Override
    public void voice() {
        super.voice();
    }

    public String toString() {
        return super.toString() + " | Dog. dopolnenie realizacii roditelskogo metoda";
    }
}
