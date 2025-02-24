package Lesson_14_14022025;

import java.util.Random;

public class HW_2_14022025 {
    public static void main(String[] args) {
        Random random = new Random();
        int a = random.nextInt(51);
        int b = random.nextInt(101);

        System.out.println("a: " + a);
        System.out.println("b: " + b);
        if (a == b) {
            System.out.println("Peremennie ravni");
        } else {
            System.out.println("Peremennie ne ravni");
        }

        if (a > b) {
            System.out.println("a bolshe b");
        } else if (a < b) {
                System.out.println("a menshe b");
        }

    }
}
