package Lesson_25_03032025.HW_1_03032025;

public class Calculator {

    /*
    Poryadok napisaniya:
    1. Polya klassa, v tom chisle Konstanti
    2. Bloki inizializazii, esli oni est
    3. Konstruktori, esli oni est
    4. Metodi
     */

    public static final double PI = 3.141519;

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
            return 2 * PI * radius;
        }

        static double circleArea(double radius){
            return PI * radius * radius;

        }

}
