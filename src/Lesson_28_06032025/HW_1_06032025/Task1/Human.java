package Lesson_28_06032025.HW_1_06032025.Task1;

public class Human {

    int speed;
    int restTime;

    Human() {
        speed = 10;
        restTime = 15;
    }

    void run() {
        System.out.println("Chel bezhit so skorostyu " + speed + " km/ch.");
        relax();
    }

    void relax() {
        System.out.println("Otdix budet: " + restTime + " minut.");
    }
}
