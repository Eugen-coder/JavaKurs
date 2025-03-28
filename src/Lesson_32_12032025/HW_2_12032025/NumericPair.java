package Lesson_32_12032025.HW_2_12032025;

public class NumericPair<T extends Number>{
    private T first;
    private T second;

    public NumericPair(T first, T second) {
        this.first = first;
        this.second = second;
    }

    public double sum() {
        return first.doubleValue() + second.doubleValue();
    }

}
