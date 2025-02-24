package Lesson_14_14022025;

import java.util.Scanner;

public class HW_3_14022025 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Vvedite chislo: ");
        int num = sc.nextInt();

        boolean a =(num % 2 == 0);
        boolean b =(num % 3 == 0);
        boolean c = a && b;

        System.out.println("Chislo: " + num + " chetnoe: " + a + "; kratno 3: " + b + "; chetnoe i kratno 3: " + c);
        sc.close();



    }
}
