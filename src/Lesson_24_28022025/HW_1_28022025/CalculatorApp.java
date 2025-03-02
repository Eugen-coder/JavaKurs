package Lesson_24_28022025.HW_1_28022025;

import java.util.Scanner;

public class CalculatorApp {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Calculator calc = new Calculator();

        System.out.print("Vvedite chislo: ");
        int num1 = scanner.nextInt();

        System.out.print("Vvedite chislo: ");
        int num2 = scanner.nextInt();

        System.out.println("Slozhenie: " + calc.plus(num1, num2));
        System.out.println("Vichitanie: " + calc.minus(num1, num2));
        System.out.println("Umnozhenie: " + calc.umnozh(num1, num2));
        System.out.println("Delenie: " + calc.delen(num1, num2));
    }
}
