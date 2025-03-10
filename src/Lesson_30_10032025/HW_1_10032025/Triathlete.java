package Lesson_30_10032025.HW_1_10032025;

public class Triathlete implements Swimmer, Runner {

    @Override
    public void run() {
        System.out.println("Triathlete - Bezhit.");
    }

    @Override
    public void swim() {
        System.out.println("Triathlete - Plivet.");

    }

}
