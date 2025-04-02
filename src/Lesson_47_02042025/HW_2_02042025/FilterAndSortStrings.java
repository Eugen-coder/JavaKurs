package Lesson_47_02042025.HW_2_02042025;

import java.util.List;
import java.util.stream.Collectors;

public class FilterAndSortStrings {
    public static List<String> filterAndSortStrings(List<String> strings, String startLetter) {
        return strings.stream()
                .filter(s -> s.startsWith(startLetter)) // Фильтруем строки, начинающиеся на определенную букву
                .sorted() // Сортируем строки в алфавитном порядке
                .collect(Collectors.toList()); // Сохраняем результат в новый список

    }
}