package Lesson_25_03032025.HW_1_03032025;

import Lesson_24_28022025.HW_1_28022025.Calculator;

import java.util.Scanner;

public class CalculatorApp {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Lesson_24_28022025.HW_1_28022025.Calculator calc = new Calculator();

        System.out.print("Vvedite chislo: ");
        int num1 = scanner.nextInt();

        System.out.print("Vvedite chislo: ");
        int num2 = scanner.nextInt();

        System.out.println("Slozhenie: " + calc.plus(num1, num2));
        System.out.println("Vichitanie: " + calc.minus(num1, num2));
        System.out.println("Umnozhenie: " + calc.umnozh(num1, num2));
        System.out.println("Delenie: " + calc.delen(num1, num2));

        System.out.print("Vvedite radius kruga: ");
        double radius = scanner.nextDouble();
        System.out.println("Dlina okruzhnosti: " + Lesson_25_03032025.HW_1_03032025.Calculator.circleCircumference(radius));
        System.out.println("Ploshad kruga: " + Lesson_25_03032025.HW_1_03032025.Calculator.circleArea(radius));
    }
}
