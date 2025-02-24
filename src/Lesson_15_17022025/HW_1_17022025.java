package Lesson_15_17022025;

import java.util.Random;
import java.util.Scanner;

public class HW_1_17022025 {
    public static void main(String[] args) {

        // Task1

        Random ran = new Random();

        int a = ran.nextInt(101);
        System.out.println("Chislo a: " + a);
        int b = ran.nextInt(101);
        System.out.println("Chislo b: " + b);
        int c = ran.nextInt(101);
        System.out.println("Chislo c: " + c);
        int d = ran.nextInt(101);
        System.out.println("Chislo d: " + d);

        int max = a;
        if (b > max) max = b;
        if (c > max) max = c;
        if (d > max) max = d;

        System.out.println("Maksimalnoe chislo: " + max);

        System.out.println("\n======\n");

        // Task2

        Scanner sc = new Scanner(System.in);
        System.out.println("Vvedite chslo ot 1 do 7: ");
        int tag = sc.nextInt();
        switch (tag) {
            case 1:
                System.out.println("Ponedelnik");
                break;
            case 2:
                System.out.println("Vtornik");
                break;
            case 3:
                System.out.println("Sreda");
                break;
            case 4:
                System.out.println("Chetverg");
                break;
            case 5:
                System.out.println("Pyatniza");
                break;
            case 6:
            case 7:
                System.out.println("Vixodnoy");
                break;
            default:
                System.out.println("Nekorrektnie dannie, vvedite chislo ot 1 do 7: ");
                break;

        }

        }
    }
