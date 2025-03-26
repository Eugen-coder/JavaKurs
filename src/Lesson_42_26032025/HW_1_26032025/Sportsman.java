package Lesson_42_26032025.HW_1_26032025;

import java.util.Arrays;
import java.util.Comparator;

class Sportsman implements Comparable<Sportsman> {
    String name;
    int age;
    int score;

    public Sportsman(String name, int age, int score) {
        this.name = name;
        this.age = age;
        this.score = score;
    }

    // Реализация метода compareTo для сортировки по name
    @Override
    public int compareTo(Sportsman other) {
        return this.name.compareTo(other.name);
    }

    @Override
    public String toString() {
        return "Sportsman{name='" + name + "', age=" + age + ", score=" + score + "}";
    }
}



