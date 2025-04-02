package Lesson_47_02042025.HW_1_02042025;

import java.util.List;
import java.util.stream.Collectors;

public class FilterNumbers {
    public static List<Integer> filterNumbers(List<Integer> numbers) {
        return numbers.stream()
                .filter(n -> n % 2 == 0) // Четные числа
                .filter(n -> n > 10 && n < 100) // Числа больше 10 и меньше 100
                .collect(Collectors.toList());

    }


}