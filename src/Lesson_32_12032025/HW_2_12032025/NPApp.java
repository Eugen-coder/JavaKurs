package Lesson_32_12032025.HW_2_12032025;

public class NPApp {
    public static void main(String[] args) {

        NumericPair<Integer> intPair = new NumericPair<>(10, 20);
        System.out.println(intPair.sum());  // Vivodim: 30.0

        NumericPair<Double> doublePair = new NumericPair<>(5.5, 4.5);
        System.out.println(doublePair.sum());  // Vivodim: 10.0
    }
}
