package Lesson_42_26032025.HW_1_26032025;

import java.util.Arrays;
import java.util.Comparator;

public class SportsmanApp {
    public static void main(String[] args) {

        Sportsman[] sportsmen = {
                new Sportsman("Илья", 25, 90),
                new Sportsman("Олег", 30, 85),
                new Sportsman("Алексей", 22, 95)
        };

        // Сортировка по естественному порядку (по имени)
        Arrays.sort(sportsmen);
        System.out.println("=======================");
        System.out.println("\nСортировка по имени:");
        for (Sportsman s : sportsmen) {
            System.out.println(s);

        }

        System.out.println("\n=======================");

        // Сортировка по рейтингу с использованием ScoreComparator
        Arrays.sort(sportsmen, new ScoreComparator());
        System.out.println("\nСортировка по рейтингу:");
        for (Sportsman s : sportsmen) {
            System.out.println(s);
        }

        System.out.println("\n=======================");

        // Сортировка по возрасту с использованием анонимного класса
        Arrays.sort(sportsmen, new Comparator<Sportsman>() {
            @Override
            public int compare(Sportsman s1, Sportsman s2) {
                return Integer.compare(s1.age, s2.age);
            }
        });
        System.out.println("\nСортировка по возрасту:");
        for (Sportsman s : sportsmen) {
            System.out.println(s);
        }

        System.out.println("\n=======================");

    }
}
