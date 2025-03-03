package Lesson_25_03032025.HW_1_03032025;

public class Calculator {

        static int plus (int a, int b) {
            return a + b;
        }

        static int minus (int a, int b) {
            return a - b;
        }

        static int umnozh (int a, int b){
            return a * b;
        }

        static int delen (int a, int b) {
            if (b == 0) {
                System.out.println("Oshibka!");
                return 0;
            }
            return a / b;
        }

        static double circleCircumference(double radius){
            return 2 * Math.PI * radius;
        }

        static double circleArea(double radius){
            return Math.PI * radius * radius;

        }

}
