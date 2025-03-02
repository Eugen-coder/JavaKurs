package Lesson_24_28022025.HW_1_28022025;

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

}
