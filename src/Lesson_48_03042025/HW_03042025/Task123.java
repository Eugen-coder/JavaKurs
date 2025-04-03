package Lesson_48_03042025.HW_03042025;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Task123 {
        public static void main(String[] args) {
            // Task 1: Из списка целых чисел выделите те значения, которые больше 10 и отсортируйте
            List<Integer> numbers = List.of(23, 15, 42, 8, 19, 3, 34, 55);
            List<Integer> filteredAndSortedNumbers = numbers.stream()
                    .filter(num -> num > 10)
                    .sorted(Comparator.comparingInt(num -> num % 10)) // Сортировка по последней цифре
                    .collect(Collectors.toList());
            System.out.println("Task 1 Result: " + filteredAndSortedNumbers);

            // Task 2: Найдите строку с минимальной длиной
            List<String> strings = List.of("apple", "banana", "kiwi", "grape", "orange");
            String shortestString = strings.stream()
                    .min(Comparator.comparingInt(String::length))
                    .orElse("No strings found");
            System.out.println("Task 2 Result: " + shortestString);

            // Task 3: Фильтрация списка, умножение и сбор результата
            List<Integer> numbersForTask3 = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
            List<Integer> modifiedNumbers = numbersForTask3.stream()
                    .filter(num -> num % 2 == 0) // Оставляем только чётные числа
                    .map(num -> num * 2)         // Умножаем на 2
                    .collect(Collectors.toList());
            System.out.println("Task 3 Result: " + modifiedNumbers);
        }
    }

