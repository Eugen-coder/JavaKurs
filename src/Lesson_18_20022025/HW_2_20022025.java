package Lesson_18_20022025;
import java.util.Arrays;

public class HW_2_20022025 {
    public static String[] findShortestAndLongest(String[] strings) {
        if (strings == null || strings.length == 0) {
            return new String[]{}; // Возвращаем пустой массив, если входной массив пуст или null
        }

        String shortest = strings[0];
        String longest = strings[0];

        for (String str : strings) {
            if (str.length() < shortest.length()) {
                shortest = str;
            }
            if (str.length() > longest.length()) {
                longest = str;
            }
        }

        return new String[]{shortest, longest};
    }

    public static void main(String[] args) {
        String[] input = {"apple", "banana", "cherry", "kiwi", "blueberry"};
        System.out.println(Arrays.toString(findShortestAndLongest(input)));
    }
}
